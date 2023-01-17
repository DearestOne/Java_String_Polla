import java.util.Scanner;
public class CharWatch1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        char[] c = new char[3];
        int[] count = new int[3];
        int fail = 0;
        for(int i=0;i<3;i++){
            c[i] = scan.next().charAt(0);
        }
        scan.nextLine();
        String text = scan.nextLine();
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            if(x > text.length() || x <= 0){
                fail++;
            }else{
                for(int j=0;j<3;j++){
                    if(text.charAt(x-1) == c[j]){
                        count[j]++;
                    }
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(count[i]);
        }
        System.out.println(fail);
    }
}
