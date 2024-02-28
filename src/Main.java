import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        fillArray(matrix);
        printArray(matrix);
        sumArray(matrix);
    }

    public static void fillArray(int[][] list) {
        for (int row = 0; row < list.length; row++)
            for (int col = 0; col < list[row].length; col++) {
                System.out.println("Enter value of [" + (row + 1) + ']' + '[' + (col + 1) + ']');
                list[row][col] = input.nextInt();
            }
        System.out.println("Your array is filled");
    }

    public static void printArray(int[][] list) {
        System.out.println("Your array will printed");
        for (int row = 0; row < list.length; row++) {
            System.out.println();
            for (int col = 0; col < list[row].length; col++) {
                System.out.print(list[row][col] + "\t");
            }
        }
        System.out.println();
    }

    public static void sumArray(int[][] list) {
        int sum = 0;
        for (int row = 0; row < list.length; row++)
            for (int col = 0; col < list[row].length; col++) {
                sum += list[row][col];
            }
        System.out.println("Summation of array is " + sum);
    }
}