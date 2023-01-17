import java.util.Scanner;
public class StringExtremum2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int option = scan.nextInt();
        scan.nextLine();
        String q1 = scan.nextLine();
        String q2 = scan.nextLine();
        String result = " ";
        if(option == 1){
            int max = 0;
            for(;;){
                String text = scan.nextLine();
                boolean a = (text.indexOf(q1) >= 0) || (text.indexOf(q2) >= 0);
                if(text.length() == 0){
                    break;
                }
                if(a == true && text.length() >= max){
                    max = text.length();
                    result = text;
                }
            }
            System.out.println(max);
            System.out.println(result);
        }
        else{
            int min = Integer.MAX_VALUE;
            for(;;){
                String text = scan.nextLine();
                boolean a = (text.indexOf(q1) >= 0) || (text.indexOf(q2) >= 0);
                if(text.length() == 0){
                    break;
                }
                if(a == true && text.length() <= min){
                    min = text.length();
                    result = text;
                }
            }
            System.out.println(min);
            System.out.println(result);
        }
    }
}
