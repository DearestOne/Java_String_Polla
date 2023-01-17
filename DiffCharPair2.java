import java.util.Scanner;
public class DiffCharPair2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        char c1 = scan.next().charAt(0);
        char c2 = scan.next().charAt(0);
        for(int i=0;i<text.length() - 1;i++){
            char pre = (i>0) ? text.charAt(i-1) : ' ';;
            char now1 = text.charAt(i);
            char now2 = text.charAt(i+1);
            char back = (i<text.length()-2) ? text.charAt(i+2) : ' ';
            boolean pre_back = pre != c1 && pre != c2 && back != c1 && back != c2;
            if((pre_back) && (now1 == c1 && now2 == c2)){
                System.out.print(i + 1 + " ");
            }
            else if((pre_back) && (now1 == c2 && now2 == c1)){
                System.out.print(i + 1 + " ");
            }
        }
    }
}
