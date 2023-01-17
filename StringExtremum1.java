import java.util.Scanner;
public class StringExtremum1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int option = scan.nextInt();
        scan.nextLine();
        if(option == 2){
            int result = Integer.MAX_VALUE;
            String less = " ";
            for(;;){
                String text = scan.nextLine();
                if(text.length() == 0){
                    break;
                }
                if(text.length() <= result){
                    result = text.length();
                    less = text;
                }
            }
            System.out.println(result);
            System.out.println(less);
        }
        else{
            int result = 0;
            String more = " ";
            for(;;){
                String text = scan.nextLine();
                if(text.length() == 0){
                    break;
                }
                if(text.length() >= result){
                    result = text.length();
                    more = text;
                }
            }
            System.out.println(result);
            System.out.println(more);
        }
    }
}
