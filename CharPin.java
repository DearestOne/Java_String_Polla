import java.util.Scanner;
public class CharPin {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        String pin = scan.nextLine();
        char[] ctext = text.toCharArray();
        char[] cpin = pin.toCharArray();
        for(int i=1;i<text.length()-1;i++){
            boolean is_pin = ctext[i-1] == cpin[0] && ctext[i] == cpin[1] && ctext[i+1] == cpin[2];
            if(is_pin){
                ctext[i-1] = cpin[2];
                ctext[i+1] = cpin[0];
                i += 2;
            }
        }
        for(int i=text.length() - 1;i>=0;i--){
            System.out.print(ctext[i]);
        }
    }
}
