import java.util.Scanner;
public class StringPresence3 {
    static Scanner scan = new Scanner(System.in);
    static void display_array(int n,int[] x){
        for(int i=0;i<n;i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        String[] word = new String[n];
        int[] have = new int[n]; 
        int[] first = new int[n]; 
        int[] last = new int[n]; 
        for(int i=0;i<n;i++){
            word[i] = scan.next();
        }
        int k = scan.nextInt();
        scan.nextLine();
        boolean haveindex = false;
        for(int i=0;i<k;i++){
            String text = scan.nextLine();
            int min = Integer.MAX_VALUE,max = 0;
            int index_min = -1,index_max = -1;
            for(int j=0;j<n;j++){
                if(text.indexOf(word[j]) != -1){
                    have[j]++;
                    haveindex = true;
                    if(text.indexOf(word[j]) >= max){
                        max = text.indexOf(word[j]);
                        index_max = j;
                    }
                    if(text.indexOf(word[j]) <= min){
                        min = text.indexOf(word[j]);
                        index_min = j;
                    }
                }
            }
            if(index_max != -1 && index_min != -1){
                first[index_min]++;
                last[index_max]++;
            }
        }
        if(haveindex){
            display_array(n, have);
            display_array(n, first);
            display_array(n, last);
        }
        else{
            System.out.println("none");
        }
    }
}
