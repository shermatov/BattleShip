import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();
        System.out.println(row(matrix, k));
    }
    public static int row(int[][] matrix, int k) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if(matrix[i][j] == 0 && matrix[i][j+1] == 0) {
                    counter++;
                } 
                if(matrix[i][j] == 0 && matrix[i][j+1] == 1) {
                    counter = 0;
                } 
                if(counter  == k - 1) {
                    return i + 1;
                }
            }
            counter = 0;
        }
        return 0;
    }
}
