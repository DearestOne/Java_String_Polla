import java.util.Scanner;
public class SpellChecking2 {
    static Scanner scan = new Scanner(System.in);
    static int countMatch(String vocab, String word) {
        int match = 0;
        int min = Math.min(vocab.length(),word.length());
        if(vocab.equals(word)){
            match = 100;
        }
        else{
            for(int i=0;i<min;i++){
                if(vocab.charAt(i) == word.charAt(i)){
                    match++;
                }
            }
        }
        return match;
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        String[] dic = new String[n];
        for(int i=0;i<n;i++){
            dic[i] = scan.next();
        }
        scan.nextLine();
        int k = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<k;i++){
            String q = scan.nextLine();
            int max = 0;
            int result = 0;
            for(int j=0;j<n;j++){
                int m = countMatch(dic[j], q);
                if(m > max){
                    max = m;
                    result = j;
                }
            }
            System.out.println(dic[result]);
        }
    }
}