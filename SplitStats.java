import java.util.Scanner;
public class SplitStats {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int index = 0;
        int count = 0;
        int length = 0;
        int max_length = 0;
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
                length = cd - ab - 2;
                if(length > max_length){
                    max_length = length;
                }
            }
            else{
                index = ab + 1;
            }
        }
        System.out.println(count);
        System.out.println(max_length);
        index = 0;
        for(;;){
            int ab = text.indexOf("AB",index);
            int ab1 = text.indexOf("AB",ab + 1);
            int cd = text.indexOf("CD",ab);
            if(ab == -1){
                break;
            }
            if(ab < cd && (ab1 < ab || ab1 > cd)){
                index = cd + 1;
                length = cd - ab - 2;
                if(length == max_length){
                    System.out.println(text.substring(ab + 2, ab + 2 + max_length));
                }
            }
            else{
                index = ab + 1;
            }
        }
    }
}
