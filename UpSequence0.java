import java.util.Scanner;
public class UpSequence0 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i == n-1){
                System.out.println(x[i]);
            }
            else if(x[i] >= x[i+1]){
                System.out.println(x[i]);
            }
        }
    }
}
