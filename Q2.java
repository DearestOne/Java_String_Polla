import java.util.Scanner;
public class Q2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int cUP = 0;
        int cLOW = 0;
        int cNUM = 0;
        for(int i=0;i<text.length();i++){
            if(Character.isUpperCase(text.charAt(i))){
                System.out.print(1);
                cUP++;
            }
            else if(Character.isLowerCase(text.charAt(i))){
                System.out.print(0);
                cLOW++;
            }
            else{
                System.out.print(2);
                cNUM++;
            }
        }
        System.out.println();
        System.out.println(cLOW);
        System.out.println(cUP);
        System.out.println(cNUM);
    }
}
