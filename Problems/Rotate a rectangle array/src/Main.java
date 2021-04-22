import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        //get row and column size and initialize array
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] inArr = new int[row][col];
        int[][] outArr = new int[col][row];

        //get the rest of the numbers and fill the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                inArr[i][j] = input.nextInt();
            }
        }
        //rotate input array 90 degrees and store in output array
        for (int c = 0; c < col; c++) {
            int counter = row - 1;
            for (int r = 0; r < row; r++) {
                outArr[c][r] = inArr[counter][c];
                counter--;
            }

        }


        //print out the rotated array
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(outArr[i][j] + " ");
            }
            System.out.println();
        }


    }
}

/*
Old array			New array
row 	col		        row 	col
0	    0		          0 	2
1	    0		          0 	1
2	    0		          0 	0
 */