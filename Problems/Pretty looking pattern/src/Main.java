import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        char[][] patternArray = new char[4][4];

        String result = "YES";

        for (int r = 0; r < 4; r++) {
            String temp = input.nextLine();
            for (int c = 0; c < 4; c++) {
                patternArray[r][c] = temp.charAt(c);
            }
        }

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (patternArray[r][c] == patternArray[r][c + 1] &&
                       patternArray[r][c] == patternArray[r + 1][c] &&
                       patternArray[r][c] == patternArray[r + 1][c + 1]) {
                    result = "NO";
                    break;
                }
            }
        }

        System.out.println(result);
    }
}