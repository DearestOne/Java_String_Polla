import java.util.Scanner;
public class LongestString {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int max = 0;
        for(int i=0;i<5;i++){
            String text = scan.nextLine();
            if(text.length() > max){
                max = text.length();
            }
        }
        System.out.println(max);
    }
}
