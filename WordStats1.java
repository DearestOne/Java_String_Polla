import java.util.Scanner;
public class WordStats1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] c = new int[26];
        scan.nextLine();
        for(int i=0;i<n;i++){
            String text = scan.nextLine();
            c[(int)text.charAt(0) - 65]++;
        }
        for(int i=0;i<26;i++){
            if(c[i] > 0){
                System.out.println((char)(i + 65) + " " + c[i]);
            }
        }
    }
}
