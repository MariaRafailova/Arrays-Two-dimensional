import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the matrix length");
	int mLength = sc.nextInt();
	
	int[][] matrix = new int[mLength][mLength];
	
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			System.out.println("Please enter element matrix["+(i)+"]["+(j)+"]");
			matrix[i][j] = sc.nextInt();
		}
	}
		
	for (int r = 0, c=0; r < matrix.length; r++, c++) {
		System.out.print(matrix[r][c] + " ");
	}
	System.out.println();
	
	for (int r = 0, c=mLength-1; r < matrix.length; r++, c--) {
		System.out.print(matrix[r][c] + " ");
	}
}
}
