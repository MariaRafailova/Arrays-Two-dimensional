import java.util.Arrays;

public class MoreTasks4 {
public static void main(String[] args) {
	
//	проверка на ст-стите на матрицата [1..30] ? и N,K -[3..10] ?
	
	int[][] matr = {
			{11, 17, 4, 10},
			{29, 4, 18, 18},
			{22, 14, 5, 5},
			{1, 27, 1, 11},
			{25, 2, 27, 6},
			{21, 24, 2, 3}
		};
	
	int n = matr.length;
	int k = matr[0].length;
	int newL = 0;
	
	if (n > k) {		
		newL = n;		
	}
	else {
		newL = k;
	}
			
	int[][] newMatr = new int[newL][newL];	
	
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < k; c++) {
				newMatr[r][c] =matr[r][c];
			}
		}
		
		for (int i = 0; i < newMatr.length; i++) {
			for (int j = 0; j < newMatr.length; j++) {
				System.out.print(newMatr[i][j] + " ");
			}
			System.out.println();
		}	
	
}
}
