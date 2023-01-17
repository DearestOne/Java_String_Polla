import java.util.Scanner;
public class AtoZ1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        if(text.indexOf("Z") > text.indexOf("A")){
            int max = Math.max(text.indexOf("Z"),text.indexOf("A"));
            int min = Math.min(text.indexOf("Z"),text.indexOf("A"));
            System.out.println(text.substring(min, max + 1));
        }
        else{
            for(int i=text.indexOf("A");i>=text.indexOf("Z");i--){
                System.out.print(text.charAt(i));
            }
        }
    }
}
