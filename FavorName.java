import java.util.Scanner;
public class FavorName {
    static Scanner scan = new Scanner(System.in);
    static int positive_count(String name,char[] pos,int p){
        int count = 0;
        for(int i=0;i<name.length();i++){
            for(int j=0;j<p;j++){
                if(name.charAt(i) == pos[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    static int negetive_count(String name,char[] neg,int n){
        int count = 0;
        for(int i=0;i<name.length();i++){
            for(int j=0;j<n;j++){
                if(name.charAt(i) == neg[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //input day1
        String day1 = scan.next();
        int p1 = scan.nextInt();
        char[] positive1 = new char[p1];
        for(int i=0;i<p1;i++){
            positive1[i] = scan.next().charAt(0);
        }
        int n1 = scan.nextInt();
        char[] negative1 = new char[n1];
        for(int i=0;i<n1;i++){
            negative1[i] = scan.next().charAt(0);
        }

        //input day2
        String day2 = scan.next();
        int p2 = scan.nextInt();
        char[] positive2 = new char[p2];
        for(int i=0;i<p2;i++){
            positive2[i] = scan.next().charAt(0);
        }
        int n2 = scan.nextInt();
        char[] negative2 = new char[n2];
        for(int i=0;i<n2;i++){
            negative2[i] = scan.next().charAt(0);
        }

        //input day3
        String day3 = scan.next();
        int p3 = scan.nextInt();
        char[] positive3 = new char[p3];
        for(int i=0;i<p3;i++){
            positive3[i] = scan.next().charAt(0);
        }
        int n3 = scan.nextInt();
        char[] negative3 = new char[n3];
        for(int i=0;i<n3;i++){
            negative3[i] = scan.next().charAt(0);
        }

        //input day4
        String day4 = scan.next();
        int p4 = scan.nextInt();
        char[] positive4 = new char[p4];
        for(int i=0;i<p4;i++){
            positive4[i] = scan.next().charAt(0);
        }
        int n4 = scan.nextInt();
        char[] negative4 = new char[n4];
        for(int i=0;i<n4;i++){
            negative4[i] = scan.next().charAt(0);
        }

        //input name && birth
        String name = scan.next();
        String birth = scan.next();

        //process day
        if(birth.equals(day1)){
            System.out.println(positive_count(name, positive1, p1));
            System.out.println(negetive_count(name, negative1, n1));
        }
        else if(birth.equals(day2)){
            System.out.println(positive_count(name, positive2, p2));
            System.out.println(negetive_count(name, negative2, n2));
        }
        else if(birth.equals(day3)){
            System.out.println(positive_count(name, positive3, p3));
            System.out.println(negetive_count(name, negative3, n3));
        }
        else if(birth.equals(day4)){
            System.out.println(positive_count(name, positive4, p4));
            System.out.println(negetive_count(name, negative4, n4));
        }
    }
}
