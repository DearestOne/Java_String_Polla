import java.util.Scanner;
public class SplitCount {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int index = 0;
        int count = 0;
        for(;;){
            int ab = text.indexOf("AB",index);
            int ab1 = text.indexOf("AB",ab + 1);
            int cd = text.indexOf("CD",ab);
            if(ab == -1){
                break;
            }
            if(ab < cd && (ab1 < ab || ab1 > cd)){
                count++;
                index = cd + 1;
            }
            else{
                index = ab + 1;
            }
        }
        System.out.println(count);
    }
}
