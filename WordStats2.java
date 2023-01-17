import java.util.Scanner;
public class WordStats2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        scan.nextLine();
        int[] min = new int[26];
        int[] max = new int[26];
        for(int i=0;i<26;i++){
            min[i] = 501;
        }
        boolean[] have = new boolean[26];
        for(int i=0;i<n;i++){
            String text = scan.nextLine();
            int start_index = (int)text.charAt(0) - 65;
            have[start_index] = true;
            max[start_index] = Math.max(max[start_index],text.length());
            min[start_index] = Math.min(min[start_index],text.length());
        }
        for(int i=0;i<26;i++){
            if(have[i]){
                System.out.println((char)(i + 65) + " " + min[i] + " " + max[i]);
            }
        }
    }
}
