import java.util.Scanner;
public class Anagram1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.next();
        int[] count = new int[8];
        for(int i=0;i<text.length();i++){
            count[(int)text.charAt(i) - 'A']++;
        }
        for(int i=0;i<8;i++){
            System.out.print(count[i] + " ");
        }
    }
}
