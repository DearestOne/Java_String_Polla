import java.util.Scanner;
public class CharScore2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int score1 = 0;
        int score2 = 0;
        int start_index = 0;
        int end_index = text.length() - 1;
        for(;;){
            if(score1 <= score2){
                score1 += (int)text.charAt(start_index) - 64;
                start_index++;
            }
            else{
                score2 += (int)text.charAt(end_index) - 64;
                end_index--;
            }
            if(start_index == end_index + 1){
                break;
            }
        }
        System.out.println(score1 + " " + score2);
        System.out.println(text.substring(0,end_index + 1) + " " + text.substring(end_index + 1,text.length()));
    }
}
