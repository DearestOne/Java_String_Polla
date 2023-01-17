import java.util.Scanner;
public class CountBetween1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        int cnt1 = 0;
        int cnt2 = 0;
        int out = 0;
        // s = start, e = end;
        int s1 = scan.nextInt();
        int e1 = scan.nextInt();
        int s2 = scan.nextInt();
        int e2 = scan.nextInt();
        for(int i=0;i<n;i++){
            if(x[i] >= s1 && x[i] <= e1){
                cnt1++;
            }
            else if(x[i] >= s2 && x[i] <= e2){
                cnt2++;
            }
            else{
                out++;
            }
        }
        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(out);
    }
}
