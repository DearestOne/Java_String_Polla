import java.util.Scanner;
public class CharSweep {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int index_start = scan.nextInt();
        int vector = scan.nextInt();
        int sweep = (int)text.charAt(index_start);
        if(vector == 1){
            for(int i=index_start;i<index_start + text.length();i++){
                int real_index = i % text.length();
                if((int)text.charAt(real_index) >= sweep){
                    System.out.print(text.charAt(real_index));
                }
            }
        }
        else{
            for(int i=index_start + text.length();i>index_start;i--){
                int real_index = i % text.length();
                if((int)text.charAt(real_index) >= sweep){
                    System.out.print(text.charAt(real_index));
                }
            }
        }
    }
}
