import java.util.Scanner;
public class StringPresence1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        String[] word = new String[n];
        for(int i=0;i<n;i++){
            word[i] = scan.next();
        }
        scan.nextLine();
        String text = scan.nextLine();
        boolean have = false;
        for(int i=0;i<n;i++){
            if(text.indexOf(word[i]) != -1){
                System.out.print(word[i] + " ");
                have = true;
            }
        }
        if(!have){
            System.out.println("none");
        }
    }
}