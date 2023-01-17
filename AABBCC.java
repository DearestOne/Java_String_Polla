import java.util.Scanner;
public class AABBCC {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int prev = 0;
        int count = 0;
        int max = 0;
        for(int i=0;i<text.length();i++){
            int now = (int)text.charAt(i);
            if(now == prev || now == prev + 1){
                count++;
                max = Math.max(max, count);
            }
            else{
                count = 1;
            }
            prev = (int)text.charAt(i);
        }
        System.out.println(max);
    }
}
