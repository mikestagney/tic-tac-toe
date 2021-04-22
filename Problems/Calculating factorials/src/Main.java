import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        long factor = 1;

        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        return factor;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}