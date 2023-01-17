import java.util.Scanner;
public class AtoZ2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.next();
        int count = 0;
        boolean a = false;
        int min = text.length();
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == 'A'){
                count = 1;
                a = true;
            }
            else if(text.charAt(i) == 'Z' && a){
                min = Math.min(min,count);
                a = false;
            }
            else{
                count++;
            }
        }
        count = 0;
        a = false;
        for(int i=text.length() - 1;i>=0;i--){
            if(text.charAt(i) == 'A'){
                count = 1;
                a = true;
            }
            else if(text.charAt(i) == 'Z' && a){
                min = Math.min(min,count);
                a = false;
            }
            else{
                count++;
            }
        }
        System.out.println(min + 1);
    }
}
