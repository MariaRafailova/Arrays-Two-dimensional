
public class Task5 {
public static void main(String[] args) {
	
	int[][] arr = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
	};
	
	int sumR = 0;
	int maxSumR = 0;
	int sumC = 0;
	int maxSumC = 0;
	
	for (int r = 0; r < arr.length; r++) {
		for (int c = 0; c < arr.length; c++) {
			sumR += arr[r][c];
		}
		if (sumR > maxSumR) {
			maxSumR = sumR;
		}
		sumR = 0;
	}
	
	for (int c = 0; c < arr.length; c++) {
		for (int r = 0; r < arr.length; r++) {
			sumC += arr[r][c];
		}
		if (sumC > maxSumC) {
			maxSumC = sumC;
		}
		sumC = 0;
	}
	
	System.out.println("най-голяма сума по редове " + maxSumR);
	System.out.println("най-голяма сума по колони " + maxSumC);
	System.out.println(maxSumR > maxSumC ? 
			"Максималната сума по редове е > от максималната сума по колони" :
			"Максималната сума по редове е < от максималната сума по колони");
}
}
