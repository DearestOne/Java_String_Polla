import java.util.Scanner;
public class CyclicString2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int l = scan.nextInt();
        for(int i=0;i<l;i++){
            if((i / text.length()) % 2 == 1){
                System.out.print(text.charAt(text.length() - (i % text.length()) - 1));
            }
            else{
                System.out.print(text.charAt(i % text.length()));
            }
        }
    }
}
