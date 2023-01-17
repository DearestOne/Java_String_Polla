import java.util.Scanner;
public class ShootingString1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        char attack = scan.next().charAt(0);
        scan.nextLine();
        for(;;){
            String text = scan.nextLine();
            if(text.equals("Z")){
                break;
            }
            int count = 0;
            for(int i=0;i<text.length();i++){
                if(text.charAt(i) == attack){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
