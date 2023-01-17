import java.util.Scanner;
public class CharCount2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int max = scan.nextInt();
        int[] x = new int[91];
        int count = 0;
        scan.nextLine();
        for(;;){
            String text = scan.nextLine();
            count++;
            for(int i=0;i<text.length();i++){
                x[(int)text.charAt(i)]++;
                if(x[(int)text.charAt(i)] == max){
                    System.out.println(text.charAt(i));
                    System.out.println(count);
                    return;
                }
            }
        }
    }
}
