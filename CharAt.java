import java.util.Scanner;
public class CharAt {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int a = scan.nextInt();
        if(a <= 0 || a > text.length()){ 
            System.out.println("invalid position");
        }
        else{
            System.out.println(text.charAt(a-1));
        }
    }
}
