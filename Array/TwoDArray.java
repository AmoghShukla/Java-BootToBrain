package Array;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements
        System.out.println("Element at (0, 0): " + array[0][0]);
        System.out.println("Element at (1, 1): " + array[1][1]);
        System.out.println("Element at (2, 2): " + array[2][2]);

        // Modifying elements
        array[0][0] = 10;
        System.out.println("Modified Element at (0, 0): " + array[0][0]);
    }
}
