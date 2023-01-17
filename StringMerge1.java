import java.util.Scanner;
public class StringMerge1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        int option = scan.nextInt();
        int min = Math.min(text1.length(),text2.length());
        for(int i=0;i<min;i++){
            boolean char1up = Character.isUpperCase(text1.charAt(i));
            boolean char2up = Character.isUpperCase(text2.charAt(i));
            if(char1up != char2up){
                System.out.print(Character.isUpperCase(text1.charAt(i)) ? text1.charAt(i) : text2.charAt(i));
            }
            else{
                System.out.print(option == 1 ? text1.charAt(i) : text2.charAt(i));
            }
        }
    }
}
