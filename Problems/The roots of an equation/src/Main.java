import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = 1; i < 1000; i++) {
            //loop through and check if i, when put into the equation, will equal 0
            // if true, then print i
            if (a * i * i * i +
                    b * i * i +
                    c * i +
                    d == 0) {
                System.out.println(i);
            }
        }
    }
}