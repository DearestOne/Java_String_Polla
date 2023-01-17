import java.util.Scanner;
public class Anagram2 {
    static Scanner scan = new Scanner(System.in);
    static void display_array(int[] x,int n){
        for(int i=0;i<n;i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        int[] count1 = new int[8];
        int[] count2 = new int[8];
        for(int i=0;i<text1.length();i++){
            count1[(int)text1.charAt(i) - 65]++;
        }
        for(int i=0;i<text2.length();i++){
            count2[(int)text2.charAt(i) - 65]++;
        }
        display_array(count1, 8);
        display_array(count2, 8);
        int wrong = 0;
        for(int i=0;i<8;i++){
            if(count1[i] == count2[i]){
                System.out.print(0 + " ");
            }
            else{
                System.out.print(Math.abs(count1[i] - count2[i]) + " ");
                wrong ++;
            }
        }
        System.out.println();
        System.out.println(wrong > 3 ? "no" : "anagram");
    }
}
