import java.util.Scanner;
public class AABBCC2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        String result = "";
        char prev = 'a';
        int count = 0;
        int max = 0;
        for(int i=0;i<text.length();i++){
            char now = text.charAt(i);
            if(now == prev || (int) now == (int)prev + 1){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 1;
            }
            prev = text.charAt(i);
        }
        System.out.println(max);
        for(int i=0;i<text.length();i++){
            char now = text.charAt(i);
            if(now == prev || (int) now == (int)prev + 1){
                count++;
                result = result + text.charAt(i);
                if(count == max){
                    System.out.println(result);
                    break;
                }
            }
            else{
                count = 1;
                result = "" + text.charAt(i);
            }
            prev = text.charAt(i);
        }
    }
}
