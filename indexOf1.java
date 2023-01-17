import java.util.Scanner;
public class indexOf1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        String find = scan.nextLine();
        if(text.indexOf(find) == -1){
            System.out.println("string not found");
        }
        else{
            System.out.println(text.indexOf(find) + 1);
        }
    }
}
