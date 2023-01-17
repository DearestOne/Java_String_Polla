import java.util.Scanner;
public class KeyWord2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        String[] word = new String[n];
        int[] count = new int[n];
        int maxIndex = 0;
        for(int i=0;i<n;i++){
            String text = scan.next();
            boolean check = false;
            for(int j=0;j<maxIndex;j++){
                if(text.equals(word[j])){
                    count[j]++;
                    check = true;
                }
            }
            if(!check){
                count[maxIndex]++;
                word[maxIndex] = text;
                maxIndex++;
            }
        }
        int max = 0;
        for(int i=0;i<maxIndex;i++){
            System.out.print(word[i] + " ");
            max = Math.max(max,count[i]);
        }
        System.out.println();
        System.out.print(max + " ");
        for(int i=0;i<maxIndex;i++){
            if(max == count[i]){
                System.out.print(word[i] + " ");
            }
        }
    }
}
