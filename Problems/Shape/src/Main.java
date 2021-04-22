import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        int shapeNumber = input.nextInt();
        String shapeName = "";
        boolean isGoodShape = true;

        switch (shapeNumber) {
            case 1:
                shapeName = "square";
                break;
            case 2:
                shapeName = "circle";
                break;
            case 3:
                shapeName = "triangle";
                break;
            case 4:
                shapeName = "rhombus";
                break;
            default:
                shapeName = "There is no such shape!";
                isGoodShape = false;
                break;
        }
        if (!isGoodShape) {
            System.out.println(shapeName);
        } else {
            System.out.println("You have chosen a " + shapeName);
        }
    }
}