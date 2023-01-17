import java.util.Scanner;
public class LongestString2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String[] text = new String[5];
        int max = 0;
        for(int i=0;i<5;i++){
            text[i] = scan.nextLine();
            if(text[i].length() > max){
                max = text[i].length();
            }
        }
        for(int i=0;i<5;i++){
            if(text[i].length() == max){
                System.out.println(text[i]);
                break;
            }
        }
    }
}
