import java.util.Scanner;
public class CountBetween2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        int countUP = 0;
        int countLOW = 0;
        int countOUT = 0;
        for(int i=0;i<text.length();i++){
            if(Character.isUpperCase(text.charAt(i))){
                countUP++;
            }
            else if(Character.isLowerCase(text.charAt(i))){
                countLOW++;
            }
            else{
                countOUT++;
            }
        }
        System.out.println(countLOW);
        System.out.println(countUP);
        System.out.println(countOUT);
    }
}
