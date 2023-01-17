import java.util.Scanner;
public class LowerChar {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String text = scan.nextLine();
        char c1 = scan.next().charAt(0); 
        char c2 = scan.next().charAt(0);
        int p = scan.nextInt();
        int q = scan.nextInt();
        int min = Math.min((int)c1,(int)c2);
        int max = Math.max((int)c1,(int)c2);
        for(int i=0;i<text.length();i++){
            boolean intext = i >= p-1 && i < q;
            boolean inrange = (int)text.charAt(i) >= min && (int)text.charAt(i) <= max;
            if(inrange && intext){
                System.out.print((char)min);
            }
            else{
                System.out.print(text.charAt(i));
            }
        }
    }
}
