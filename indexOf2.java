import java.util.Scanner;
public class indexOf2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        String find = scan.nextLine();
        int l = 0;
        int count = 0;
        for(;;){
            if(text.indexOf(find,l) == -1){
                break;
            }
            System.out.print(text.indexOf(find,l) + 1 + " ");
            l = text.indexOf(find,l) + 1;
            count ++;
        }
        if(count == 0){
            System.out.println("string not found");
        }
    }
}
