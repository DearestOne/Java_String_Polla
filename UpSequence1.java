import java.util.Scanner;
public class UpSequence1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        for(int i=0;i<text.length();i++){
            if(i == text.length()-1){
                System.out.println(text.charAt(i));
            }
            else if((int)text.charAt(i) >= (int)text.charAt(i+1)){
                System.out.println(text.charAt(i));
            }
        }
    }
}
