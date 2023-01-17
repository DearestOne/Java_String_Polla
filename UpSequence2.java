import java.util.Scanner;
public class UpSequence2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        String result = "";
        for(int i=0;i<text.length();i++){
            if(i == text.length()-1){
                System.out.println(result + text.charAt(i));
            }
            else if((int)text.charAt(i) >= (int)text.charAt(i+1)){
                System.out.println(result + text.charAt(i));
                result = "";
            }
            else{
                result = result + text.charAt(i);
            }
        }
    }
}
