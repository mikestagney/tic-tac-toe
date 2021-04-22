import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int numberOfParts = scanner.nextInt();
        int[] partsArr = new int[numberOfParts];
        int fixedParts = 0;
        int rejectedParts = 0;
        int perfectParts = 0;

        for (int i = 0; i < numberOfParts; i++) {
            partsArr[i] =  scanner.nextInt();
        }
        for (int i = 0; i < numberOfParts; i++) {
            int currentPart = partsArr[i];

            if (currentPart == 0) {
                perfectParts++;
            } else if (currentPart < 1) {
                rejectedParts++;
            } else if (currentPart > 0) {
                fixedParts++;
            }
        }
        System.out.println(perfectParts + " " + fixedParts + " " + rejectedParts);

    }
}