import java.util.Scanner;
public class SpellChecking1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        String[] dic = new String[n];
        String[] q = new String[10];
        for(int i=0;i<n;i++){
            dic[i] = scan.next();
        }
        scan.nextLine();
        for(int i=0;i<10;i++){
            q[i] = scan.next();
        }
        for(int i=0;i<10;i++){
            boolean HaveInDic = false;
            for(int j=0;j<n;j++){
                if(q[i].equals(dic[j])){
                    HaveInDic = true;
                }
            }
            System.out.print(HaveInDic ? 1 : 0);
        }
    }
}
