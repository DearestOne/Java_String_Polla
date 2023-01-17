import java.util.Scanner;
public class CutAndHide {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        String target = scan.nextLine();
        String cut = text.substring(text.indexOf(target),text.lastIndexOf(target) + 1);
        System.out.print(target);
        for(int i=1;i<cut.length() - 1;i++){
            if(cut.charAt(i) != target.charAt(0)){
                System.out.print(cut.charAt(i));
            }
        }
        System.out.print(target);
    }
}
