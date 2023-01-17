import java.util.Scanner;
public class CharLotto {
    static Scanner scan = new Scanner(System.in);
    static void display(int[] p){
        int sum = 0;
        for(int i=0;i<6;i++){
            System.out.print(p[i] + " ");
            sum += p[i];
        }
        System.out.println();
        System.out.println(sum);
    }
    public static void main(String[] args) {
        String[] buy = new String[12];
        int[] point = new int[6];
        for(int i=0;i<12;i++){
            buy[i] = scan.next();
        }
        for(int i=0;i<6;i++){
            String lotter = scan.next();
            for(int j=0;j<12;j++){
                if(lotter.equals(buy[j])){
                    point[i]++;
                }
            }
        }
        display(point);
    }
}
