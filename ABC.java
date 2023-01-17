import java.util.Scanner;
public class ABC {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int count = 0;
        for(int i=1;i<text.length() - 1;i++){
            if((int)text.charAt(i) == (int)text.charAt(i-1)+1 && 
            (int)text.charAt(i) == (int)text.charAt(i+1)-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
