import java.util.Scanner;
public class IntToChar {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int code = scan.nextInt();
        if(code >= 65 && code <= 90){
            System.out.println((char)code);
        }
        else{
            System.out.println("unsupported code");
        }
    }
}
// A = 65;
// Z = 90;