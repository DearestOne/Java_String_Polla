import java.util.Scanner;
public class SubMatch2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        String find = scan.nextLine();
        for(int i=0;i<find.length()-2;i++){
            if(text.indexOf(find.substring(i,i+3)) == -1){
                System.out.println("No");
            }
            else{
                System.out.println(text.indexOf(find.substring(i,i+3)) + 1);
            }
        }
    }
}
