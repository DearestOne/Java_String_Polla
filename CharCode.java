import java.util.Scanner;
public class CharCode {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        char c = scan.next().charAt(0);
        System.out.println((int)c);
    }
}
