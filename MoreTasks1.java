import java.util.Scanner;

public class MoreTasks1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
//	System.out.println("Моля въведете размер на матрицата:");
//	int matrLength = sc.nextInt();
	
//	int[][] matr = new int[matrLength][matrLength];
	
//	for (int i = 0; i < matr.length; i++) {
//		for (int j = 0; j < matr.length; j++) {
//			System.out.println("Въведете стойност от 1 до 20 на елемент matr["+i+"]["+j+"]");
//			matr[i][j] = sc.nextInt();
//			if (matr[i][j]<1 || matr[i][j]>20) {
//				System.out.println("Въведената стойност не е между 1 и 20.");
//				break;
//			}
//		}
//	}
	
	int [][] matr = {
			{16,3,2,13},
			{5,10,11,8},
			{9,6,7,12},
			{4,15,14,1}
	};
	
	boolean magic = true;
	int sum = 0;
	int checkSum = 0;
	
//	1 row sum
	for (int c = 0; c < matr.length; c++) {
		sum += matr[0][c];
	}
	
//	check rows sum
	for (int r = 0; r < matr.length; r++) {	
		checkSum = 0;
		for (int c = 0; c < matr.length; c++) {
			checkSum += matr[r][c];
		}
		
		if (checkSum != sum) {
			magic = false;
			break;
		}		
	}
	
//	check columns sum
	for (int c = 0; c < matr.length; c++) {
		checkSum = 0;
		for (int r = 0; r < matr.length; r++) {
			checkSum += matr[r][c];
		}
		
		if (checkSum != sum) {
			magic = false;
			break;
		}		
	}
	
//	D1 sum
	checkSum = 0;
	for (int r = 0, c=0; r < matr.length; r++, c++) {
		checkSum += matr[r][c];
	}
	if (checkSum != sum) {
		magic = false;		
	}	
	
//	 D2 sum
	checkSum = 0;
	for (int r = 0, c=matr.length-1; r < matr.length; r++, c--) {
		checkSum += matr[r][c];
	}
	if (checkSum != sum) {
		magic = false;		
	}	
	
	System.out.println(magic ? "магически квадрат, сума по редове и колони " + sum :
								"не е магически квадрат");
}
}
