import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int numberNums = scanner.nextInt();
        int[] numArray = new int[numberNums];
        int sumOfNumsDivisableBySix = 0;

        for (int i = 0; i < numberNums; i++) {
            numArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < numberNums; i++) {
            if (numArray[i] % 6 == 0) {
                sumOfNumsDivisableBySix += numArray[i];
            }
        }
        System.out.println(sumOfNumsDivisableBySix);

    }
}