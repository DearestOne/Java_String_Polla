import java.util.Scanner;
public class CharInRange1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String range1 = scan.nextLine();
        String range2 = scan.nextLine();
        String range3 = scan.nextLine();
        for(int i=0;i<3;i++){
            int count = 0;
            char x = scan.next().charAt(0);
            int min = Math.min((int)range1.charAt(0),(int)range1.charAt(2));
            int max = Math.max((int)range1.charAt(0),(int)range1.charAt(2));
            if((int)x >= min && (int)x <= max){
                System.out.print("1 ");
                count++;
            }
            min = Math.min((int)range2.charAt(0),(int)range2.charAt(2));
            max = Math.max((int)range2.charAt(0),(int)range2.charAt(2));
            if((int)x >= min && (int)x <= max){
                System.out.print("2 ");
                count++;
            }
            min = Math.min((int)range3.charAt(0),(int)range3.charAt(2));
            max = Math.max((int)range3.charAt(0),(int)range3.charAt(2));
            if((int)x >= min && (int)x <= max){
                System.out.print("3");
                count++;
            }
            System.out.println(count == 0 ? 0 : "");
        }
    }
}
