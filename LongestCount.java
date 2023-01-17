import java.util.Scanner;
public class LongestCount {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int max = 0;
        int count = 0;
        for(;;){
            String text = scan.nextLine();
            if(text.length() == 0){
                break;
            }
            if(text.length() > max){
                max = text.length();
                count = 1;
            }
            else if(text.length() == max){
                count++;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
