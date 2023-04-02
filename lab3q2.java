public class lab3q2 {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Print the original array
        System.out.println("Original array:");
        for (int[] row : arr) {
            for (int element : row) 
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Reverse the elements in each row
        for (int[] row : arr) 
        {
            for (int i = 0; i < row.length / 2; i++) 
            {
                int temp = row[i];
                row[i] = row[row.length - i - 1];
                row[row.length - i - 1] = temp;
            }
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
