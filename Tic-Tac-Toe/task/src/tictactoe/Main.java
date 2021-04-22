package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] gameBoard = new char[3][3];
        int counter = 0;
        int numOfXs = 0;
        int numOfOs = 0;
        int numEmpty = 9;
        String resultText = "";
        boolean isXWin = false;
        boolean isOWin = false;

        int rowCoord = 0;
        int colCoord = 0;
        boolean validInput = false;
        boolean isDraw = false;
        char gamePiece = 'X';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = ' ';
                counter++;
            }
        }
        while(!isXWin || !isOWin || !isDraw) {
            displayGameBoard(gameBoard);
            validInput = false;

            while (!validInput) {
                System.out.print("Enter the coordinates: ");
                colCoord = scanner.nextInt();
                rowCoord = scanner.nextInt();

                if (colCoord > 3 || colCoord < 1 || rowCoord > 3 || rowCoord < 1) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                colCoord -= 1;
                rowCoord = Math.abs(rowCoord - 3);

                if (gameBoard[rowCoord][colCoord] == ' ') {
                    gameBoard[rowCoord][colCoord] = gamePiece;
                    validInput = true;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }


            }

            numEmpty--;

            switch (gamePiece) {
                case 'X':
                    numOfXs++;
                    gamePiece = 'O';
                    break;
                case 'O':
                    numOfOs++;
                    gamePiece = 'X';
                    break;
            }

            //check if X has 3
            isXWin = winnerCheck(gameBoard, 'X');
            isOWin = winnerCheck(gameBoard, 'O');

            if (isXWin) {
                resultText = "X wins";
                break;
                           }
            if (isOWin) {
                resultText = "O wins";
                break;
            }

            if (!isXWin && !isOWin && numEmpty == 0) {
                resultText = "Draw";
                isDraw = true;
                break;
            }

        }
        displayGameBoard(gameBoard);
        System.out.println(resultText);

    }
    public static boolean winnerCheck(char[][]board, char piece) {
        boolean didWin = false;

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][2] == piece) {
                didWin = true;
                break;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[2][i] == piece) {
                didWin = true;
                break;
            }
        }

        if (!didWin) {
            if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == piece) ||
                    (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[0][2] == piece))
                didWin = true;
        }
        return didWin;
    }
    public static void displayGameBoard(char[][] gameBoard) {
         System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

}

