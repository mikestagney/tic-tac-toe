import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();

        num = ((num + 1) * num + 2) * num + 3;

        System.out.println(num);

    }
}