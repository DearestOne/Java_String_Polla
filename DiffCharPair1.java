import java.util.Scanner;
public class DiffCharPair1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        char c1 = scan.next().charAt(0);
        char c2 = scan.next().charAt(0);
        char now = 'a';
        char prev = 'z';
        for(int i=0;i<text.length();i++){
            now = text.charAt(i);
            if((now == c1 && prev == c2)||(now == c2 && prev == c1)){
                System.out.print(i + " ");
                i++;
            }
            if(i<text.length()){
                prev = text.charAt(i);
            }
        }
    }
}
