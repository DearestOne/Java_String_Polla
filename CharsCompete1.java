import java.util.Scanner;
public class CharsCompete1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        char T1 = scan.next().charAt(0);
        char T2 = scan.next().charAt(0);
        int goal = scan.nextInt();
        int S1 = 0,S2 = 0;
        for(int i=0;i<text.length();i++){
            if(T1 == text.charAt(i)){
                S1++;
            }
            else if(T2 == text.charAt(i)){
                S2++;
            }
            if(S1 == goal || S2 == goal){
                break;
            }
        }
        if(S1 > S2){
            System.out.println(T1);
            System.out.println(S1 + " " + S2);
        }
        else if(S2 > S1){
            System.out.println(T2);
            System.out.println(S2 + " " + S1);
        }
        else{
            System.out.println("draw");
            System.out.println(S2 + " " + S1);
        }
    }
}
