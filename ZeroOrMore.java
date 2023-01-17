import java.util.Scanner;
public class ZeroOrMore {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String x = scan.next();
        String text = scan.next();
        int index = x.indexOf("*");
        String be = x.substring(0, index);        
        String af = x.substring(index + 1, x.length());
        int start = text.indexOf(be) + be.length();
        int end = text.indexOf(af) == -1 ? text.length() : text.indexOf(af);
        if(index == 0){
            System.out.println(text.substring(0, end));
        }
        else if(index == x.length() - 1){
            System.out.println(text.substring(start, text.length()));
        }
        else{
            System.out.println(text.substring(start, end));
        }
    }
}
