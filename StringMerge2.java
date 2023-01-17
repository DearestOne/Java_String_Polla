import java.util.Scanner;
public class StringMerge2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        int min = Math.min(text1.length(),text2.length());
        for(int i=0;i<min;i++){
            char c1 = text1.charAt(i);
            char c2 = text2.charAt(i);
            boolean c1_IsDigit = Character.isDigit(c1);
            boolean c2_IsDigit = Character.isDigit(c2);
            boolean c1_isC = c1 == '(' || c1 == ')' || c1 == '{' || c1 == '}';
            boolean c2_isC = c2 == '(' || c2 == ')' || c2 == '{' || c2 == '}';
            if((c1_IsDigit && c2_IsDigit) || (c1_isC && c2_isC)){
                System.out.print(c1);
            }
            else if(Character.isUpperCase(c2) && Character.isUpperCase(c1)){
                System.out.print(c1);
            }
            else if(Character.isLowerCase(c2) && Character.isLowerCase(c1)){
                System.out.print(c1);
            }
            else if(c1_IsDigit){
                System.out.print(c2_isC ? c2 : c1);
            }
            else if(c2_IsDigit){
                System.out.print(c1_isC ? c1 : c2);
            }
            else if(c1_isC || c2_isC){
                System.out.print(c1_isC ? c1 : c2);
                // if(c1_isC){
                //     System.out.print(c1);
                // }
                // else{
                //     System.out.print(c2);
                // }
            }
            else{
                System.out.print(Character.isUpperCase(c1) ? c1 : c2);
            }
        }
    }
}
