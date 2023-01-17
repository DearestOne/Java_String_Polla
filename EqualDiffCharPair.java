import java.util.Scanner;
public class EqualDiffCharPair {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int target = scan.nextInt();
        for(int i=1;i<text.length();i++){
            int c1 = (int)text.charAt(i-1);
            int c2 = (int)text.charAt(i);
            if(c2 == c1 + target){
                System.out.print(i + " ");
                i++;
            }
        }
    }
}
