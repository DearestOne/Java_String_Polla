import java.util.Scanner;
public class CyclicString1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int l = scan.nextInt();
        int count = 0;
        for(;;){
            System.out.print(text.charAt(count % text.length()));
            count++;
            if(count == l){
                break;
            }
        }
    }
}
