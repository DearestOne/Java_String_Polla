import java.util.Scanner;
public class CharInRange2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String range1 = scan.nextLine();
        String range2 = scan.nextLine();
        String range3 = scan.nextLine();
        String text = scan.nextLine();
        int score = 0;
        int success = 0;
        int lose = 0;
        for(int i=0;i<text.length();i++){
            boolean s = false;
            int min = Math.min((int)range1.charAt(0),(int)range1.charAt(2));
            int max = Math.max((int)range1.charAt(0),(int)range1.charAt(2));
            if((int)text.charAt(i) >= min && (int)text.charAt(i) <= max){
                score++;
                s = true;
            }
            min = Math.min((int)range2.charAt(0),(int)range2.charAt(2));
            max = Math.max((int)range2.charAt(0),(int)range2.charAt(2));
            if((int)text.charAt(i) >= min && (int)text.charAt(i) <= max){
                score++;
                s = true;
            }
            min = Math.min((int)range3.charAt(0),(int)range3.charAt(2));
            max = Math.max((int)range3.charAt(0),(int)range3.charAt(2));
            if((int)text.charAt(i) >= min && (int)text.charAt(i) <= max){
                score++;
                s = true;
            }
            if(s == false){
                score -= 2;
                lose++;
            }
            else{
                success++;
            }
        }
        System.out.println(success);
        System.out.println(lose);
        System.out.println(score);
    }
}
