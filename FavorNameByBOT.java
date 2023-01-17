import java.util.Scanner;
public class FavorNameByBOT {
    static Scanner scan = new Scanner(System.in);
    static int positive_count(String name, char[] pos) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < pos.length; j++) {
                if (name.charAt(i) == pos[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    static int negative_count(String name, char[] neg) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < neg.length; j++) {
                if (name.charAt(i) == neg[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // input days
        String[] days = new String[4];
        char[][] positiveLetters = new char[4][];
        char[][] negativeLetters = new char[4][];
        for (int i = 0; i < 4; i++) {
            days[i] = scan.next();
            int p = scan.nextInt();
            positiveLetters[i] = new char[p];
            for (int j = 0; j < p; j++) {
                positiveLetters[i][j] = scan.next().charAt(0);
            }
            int n = scan.nextInt();
            negativeLetters[i] = new char[n];
            for (int j = 0; j < n; j++) {
                negativeLetters[i][j] = scan.next().charAt(0);
            }
        }
        // input name and birth
        String name = scan.next();
        String birth = scan.next();

        // process day
        for (int i = 0; i < 4; i++) {
            if (birth.equals(days[i])) {
                System.out.println(positive_count(name, positiveLetters[i]));
                System.out.println(negative_count(name, negativeLetters[i]));
                break;
            }
        }
    }
}