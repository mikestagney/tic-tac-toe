import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        String enteredText = input.next();
        long firstNum = Long.parseLong(enteredText);
        String operation = input.next();
        enteredText = input.next();
        long secondNum = Long.parseLong(enteredText);

        switch (operation) {
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case  "-":
                System.out.println(firstNum - secondNum);
                break;
            case "/":
                if (secondNum == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNum / secondNum);
                }
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }


    }
}