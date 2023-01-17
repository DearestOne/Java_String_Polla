import java.util.Scanner;
public class InsideOut2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int start = scan.nextInt();
        int l = text.length();
        if(l % 2 == 0){
            for(int i=0;i<l / 2;i++){
                if(start >= i){
                    System.out.print(text.charAt(start - i));
                }
                else{
                    System.out.print(text.charAt(l + (start - i)));
                }
                System.out.print(text.charAt((start + i + 1) % l));
            }
        }
        else{
            for(int i=0;i<=l/2;i++){
                System.out.print(i == l/2 ? "" : text.charAt((start + i) % l));
                if(start - i - 1 >= 0){
                    System.out.print(text.charAt(start - i - 1));
                }
                else{
                    System.out.print(text.charAt(l + (start - i - 1)));
                }
            }
        }
    }
}
