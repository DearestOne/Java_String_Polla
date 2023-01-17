import java.util.Scanner;
public class InsideOut {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int half = text.length() / 2;
        if(text.length() % 2 == 0){
            for(int i=0;i<half;i++){
                System.out.print(text.charAt(half - i - 1));
                System.out.print(text.charAt(half + i));
            }
        }
        else{
            for(int i=0;i<=half;i++){
                System.out.print(text.charAt(half + i));
                System.out.print(i == half ? "" : text.charAt(half - i - 1));
            }
        }
    }
}
