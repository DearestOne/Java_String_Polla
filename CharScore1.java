import java.util.Scanner;
public class CharScore1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int half = text.length() / 2;
        int f = 0,s = 0;
        for(int i=0;i<text.length();i++){
            if(i >= half){
                s += (int)text.charAt(i) - 64;
            }
            else{
                f += (int)text.charAt(i) - 64;
            }
        }
        System.out.println(f);
        System.out.println(s);
    }
}
