import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        int direction = input.nextInt();
        String outputText = "";

        switch (direction) {
            case 1:
                outputText = "move up";
                break;
            case 2:
                outputText = "move down";
                break;
            case 3:
                outputText = "move left";
                break;
            case 4:
                outputText = "move right";
                break;
            case 0:
                outputText = "do not move";
                break;
            default:
                outputText = "error!";
                break;
        }
        System.out.println(outputText);
    }
}