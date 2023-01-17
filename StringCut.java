import java.util.Scanner;
public class StringCut {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        char skip = scan.next().charAt(0);
        int start = 0;
        boolean out = false;
        boolean target = false;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == skip){
                target = true;
                if(start != i){
                    System.out.println(text.substring(start,i));
                    out = true;
                }
                start = i + 1;
            }
            else if(i == text.length() - 1 && start != 0){
                System.out.println(text.substring(start,text.length()));
                out = true;
            }
        }
        if(target == false){
            System.out.println("no target character found");
        }
        else if(out == false){
            System.out.println("no output");
        }
    }
}
