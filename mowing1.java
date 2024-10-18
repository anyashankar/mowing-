package mowing;

import java.util.*;
public class mowing1 {

    public static boolean legalMove(String[][] lawn, int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (lawn[i][j].equals("T")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int ones(int[][] array)
    {
        int n = 0;
        for (int[] a : array) {
            for (int b : a) {
                if (b == 1) {
                    n++;
                }
            }
        }
        return n;
    }

    public static ArrayList<int[]> moveMower(String[][] lawn, int row, int col)
    {
        int rows = lawn.length;
        int columns = lawn[0].length;
        int[][] moves = { { row - 1, col }, { row + 1, col }, { row, col - 1 }, { row, col + 1 } };
        ArrayList<int[]> grid = new ArrayList<int[]>();
        for (int[] a : moves) {
            if (a[0] > 0 && a[0] < rows - 1 && a[1] > 0 && a[1] < columns - 1 && legalMove(lawn, a[0], a[1])) {
                grid.add(a);
            }
        }
        return grid;
    }
    public static int[][] centers(String[][] lawn, int row, int col)
    {
        int rows = lawn.length;
        int columns = lawn[0].length;

        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = 0;
            }
        }

        array[row][col] = 1;
        while (ones(array) != 0) {
            // check all the ones
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (array[i][j] == 1) {
                        ArrayList<int[]> moves = moveMower(lawn, i, j);
                        for (int[] a : moves) {
                            if (array[a[0]][a[1]] == 0) {
                                array[a[0]][a[1]] = 1;
                            }
                        }
                        array[i][j] = 2;
                    }
                }
            }
        }
        return array;
    }
    public static void mowone(String[][] lawn, int row, int col) {

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                lawn[i][j] = "C";
            }
        }
    }
    public static String[][] mow(String[][] lawn, int row, int col) {
        int rows = lawn.length;
        int columns = lawn[0].length;

        int[][] centers = centers(lawn, row, col);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (centers[i][j] == 2) {
                    mowone(lawn, i, j);
                }
            }
        }

        return lawn;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of cases you want to run");
        int numCases = input.nextInt();
        input.nextLine();
        System.out.println("First Enter values in format - #ofrows #ofcolumns mowerstartrow mowerstartcol - all on the same line");
        System.out.println("Then enter #ofRows lines of #ofcolumns terms each separated by spaces (all dots, unless tree)");
        System.out.println("After the first case, do the same for the following cases");

        for (int i = 0; i < numCases; i++) {
            String grid = input.nextLine();

            String[] numbers = grid.split(" ");
            int rows = Integer.parseInt(numbers[0]);
            int columns = Integer.parseInt(numbers[1]);
            int startRow = Integer.parseInt(numbers[2]);
            int startCol = Integer.parseInt(numbers[3]);

            String[][] grids = new String[rows][columns];
            for (int j = 0; j < rows; j++) {
                String r = input.nextLine();
                grids[j] = r.split(" ");
            }

            String[][] board = mow(grids, startRow, startCol);
            for (String[] a : board) {
                for (String b : a) {
                    System.out.print(b + " ");
                }
                System.out.println();
            }
        }
    }
}
