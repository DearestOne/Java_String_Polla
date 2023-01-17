import java.util.Scanner;
public class ABC2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int count = 0;
        boolean first = false;
        String f = "";
        for(int i=1;i<text.length() - 1;i++){
            int val1 = (int)text.charAt(i-1);
            int val2 = (int)text.charAt(i);
            int val3 = (int)text.charAt(i+1);
            if(val1 == val2 - 1 && val1 == val3 - 2){
                count++;
                if(count == 1 && !first){
                    first = true;
                    f = f + (char)val1 + (char)val2 + (char)val3;
                }
            }
        }
        System.out.println(count);
        System.out.println(count == 0 ? "-1" : text.indexOf(f) + 1);
    }
}
