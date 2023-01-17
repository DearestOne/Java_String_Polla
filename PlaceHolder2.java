import java.util.Scanner;
public class PlaceHolder2 {
    static Scanner scan = new Scanner(System.in);
    static boolean isPlaceHolder(int position, String str){
        boolean p1 = str.charAt(position + 1) != '0';
        boolean p2 = str.charAt(position + 2) == '0';
        boolean p3_p6 = true;
        for(int i=3;i<=6;i++){
            if(str.charAt(position + i) == '0'){
                p3_p6 = false;
            }
        }
        boolean p7 = str.charAt(position + 7) == '0';
        boolean p8 = str.charAt(position + 8) != '0';
        boolean p9 = str.charAt(position + 9) == '0';
        if(p1 && p2 && p3_p6 && p7 && p8 && p9){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String text = scan.nextLine();
        for(int i=0;i<text.length();i++){
            if(isPlaceHolder(i, text) && text.charAt(i) == '0'){
                System.out.println(text.substring(i + 3,i + 7));
                break;
            }
        }
    }
}
