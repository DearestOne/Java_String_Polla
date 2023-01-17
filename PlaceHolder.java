import java.util.Scanner;
public class PlaceHolder {
    static Scanner scan = new Scanner(System.in);
    static boolean isPlaceHolder(int position, String str){
        boolean p2 = str.charAt(position + 2) == '0';
        boolean p7 = str.charAt(position + 7) == '0';
        boolean p9 = str.charAt(position + 9) == '0';
        if(p2 && p7 && p9){
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
