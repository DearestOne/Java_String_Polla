import java.util.Scanner;
public class KeyWord1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        final int n = scan.nextInt();
        String[] word = new String[n];
        int cnt = 0;
        for(int i=0;i<n;i++){
            String text = scan.next();
            boolean check = false;
            for(int j=0;j<cnt;j++){
                if(text.equalsIgnoreCase(word[j])){
                    check = true;
                }
            }
            if(!check){
                word[cnt] = text;
                cnt++;
            }
        }
        for(int i=0;i<cnt;i++){
            System.out.print(word[i] + " ");
        }
    }
}
