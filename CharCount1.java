import java.util.Scanner;
public class CharCount1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int[] count = new int[91];
        for(int i=0;i<text.length();i++){
            count[(int)text.charAt(i)]++;
        }
        for(int i=65;i<91;i++){
            if(count[i] > 0){
                System.out.println((char)i + " " + count[i]);
            }
        }
    }
}
