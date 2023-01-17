import java.util.Scanner;
public class CharWatch2 {
    static Scanner scan = new Scanner(System.in);
    static boolean check(char text,char find){
        if(text == find){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        char[] c = new char[3];
        int[] count = new int[3];
        for(int i=0;i<3;i++){
            c[i] = scan.next().charAt(0);
        }
        int n = scan.nextInt();
        scan.nextLine();
        String[] text = new String[n];
        for(int i=0;i<n;i++){
            text[i] = scan.nextLine();
        }
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int x = scan.nextInt();
            for(int j=0;j<n;j++){
                if(x > 0 && x <= text[j].length()){
                    for(int z=0;z<3;z++){
                        if(check(text[j].charAt(x-1),c[z]) == true){
                            count[z]++;
                        }
                    }
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(count[i]);
        }
    }
}
