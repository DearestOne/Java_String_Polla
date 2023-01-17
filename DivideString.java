import java.util.Scanner;
public class DivideString {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        String up = "";
        String low = "";
        String out = "";
        for(int i=0;i<text.length();i++){
            if(Character.isLowerCase(text.charAt(i))){
                low = low + text.charAt(i);
            }
            else if(Character.isUpperCase(text.charAt(i))){
                up = up + text.charAt(i);
            }
            else{
                out = out + text.charAt(i);
            }
        }
        System.out.println(low);
        System.out.println(up);
        System.out.println(out);
    }
}
