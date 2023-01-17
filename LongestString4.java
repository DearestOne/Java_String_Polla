import java.util.Scanner;
public class LongestString4 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int max = 0;
        String longest = " ";
        for(;;){
            String text = scan.nextLine();
            if(text.length() == 0){
                break;
            }
            if(text.length()>=max){
                longest = text;
                max = text.length();
            }
        }
        System.out.println(longest);
    }
}
