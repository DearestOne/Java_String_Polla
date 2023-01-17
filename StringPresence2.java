import java.util.Scanner;
public class StringPresence2 {
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
        int max = 0,min = 1000;
        String MAX = "";
        String MIN = "";
        for(int i=0;i<n;i++){
            int IDO = text.indexOf(word[i]);
            if(IDO != -1){
                if(IDO > max){
                    max = IDO;
                    MAX = word[i];
                }
                if(IDO < min){
                    min = IDO;
                    MIN = word[i];
                }
                System.out.print(word[i] + " ");
                have = true;
            }
        }
        if(have){
            System.out.println();
            System.out.println(MIN);
            System.out.println(MAX);
        }
        else{
            System.out.println("none");
        }
    }
}
