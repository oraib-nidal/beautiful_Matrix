import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] beautiful_matrix  = new  int [5][5];
        int col = -1, row = -1 ;
        for (int i = 0; i < beautiful_matrix.length; i++) {
            for (int j = 0; j < beautiful_matrix[i].length; j++) {
                beautiful_matrix[i][j] = scanner.nextInt();
                if (beautiful_matrix[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        int moves = Math.abs(row - 2) + Math.abs(col - 2);
        System.out.println(moves);
    }
}