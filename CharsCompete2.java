import java.util.Scanner;
public class CharsCompete2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int teamsize = scan.nextInt();
        char[] team1 = new char[teamsize];
        char[] team2 = new char[teamsize];
        for(int i=0;i<teamsize;i++){
            team1[i] = scan.next().charAt(0);
        }
        for(int i=0;i<teamsize;i++){
            team2[i] = scan.next().charAt(0);
        }
        int goal = scan.nextInt();

        // process
        int score1 = 0,score2 = 0;
        for(int i=0;i<text.length();i++){
            for(int j=0;j<teamsize;j++){
                if(team1[j] == text.charAt(i)){
                    score1++;
                }
            }
            for(int j=0;j<teamsize;j++){
                if(team2[j] == text.charAt(i)){
                    score2++;
                }
            }
            if(score1 == goal || score2 == goal){
                break;
            }
        }
        if(score1 > score2){
            System.out.println(1);
            System.out.println(score1 + " " + score2);
        }
        else if(score2 > score1){
            System.out.println(2);
            System.out.println(score2 + " " + score1);
        }
        else{
            System.out.println("draw");
            System.out.println(score2 + " " + score1);
        }
    }
}
