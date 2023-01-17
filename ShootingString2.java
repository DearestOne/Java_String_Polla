import java.util.Scanner;
public class ShootingString2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int success_score1 = 0,success_score2 = 0;
        int all_def1 = 0,all_def2 = 0;
        //team1 attack,team2 defence
        char attack = scan.next().charAt(0);
        scan.nextLine();
        for(;;){
            String text = scan.nextLine();
            if(text.equals("Z")){
                break;
            }
            all_def2 += text.length();
            for(int i=0;i<text.length();i++){
                if(text.charAt(i) == attack){
                    success_score1++;
                }
            }
        }
        //team2 attack,team1 defence
        attack = scan.next().charAt(0);
        scan.nextLine();
        for(;;){
            String text = scan.nextLine();
            if(text.equals("Z")){
                break;
            }
            all_def1 += text.length();
            for(int i=0;i<text.length();i++){
                if(text.charAt(i) == attack){
                    success_score2++;
                }
            }
        }
        //output score summary
        int sum1 = success_score1 + (all_def1 / 5);
        int sum2 = success_score2 + (all_def2 / 5);
        System.out.println(success_score1 + " " +  (all_def1 / 5) + " " + sum1);
        System.out.println(success_score2 + " " +  (all_def2 / 5) + " " + sum2);
        if(sum1 == sum2){
            System.out.println(0);
        }
        else{
            System.out.println(sum1 > sum2 ? 1 : 2);
        }
    }
}
