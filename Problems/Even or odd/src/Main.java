import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int number = 1;

        while (number != 0) {
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}