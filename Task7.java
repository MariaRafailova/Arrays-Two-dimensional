
public class Task7 {
public static void main(String[] args) {
	
	int[][] arr = {
			{11,12,13,14,15,16},
			{21,22,23,24,25,26},
			{31,32,33,34,35,36},
			{41,42,43,44,45,46},
			{51,52,53,54,55,56},
			{61,62,63,64,65,66}
	};
	
	int sumR = 0;
	int totalSum = 0;
	
	for (int r = 0; r < arr.length; r++) {		
		for (int c = 0; c < arr.length; c++) {	
			if((r+c)%2 == 0){
				sumR += arr[r][c];				
				System.out.print(arr[r][c] + ",");				
			}		
		}
		System.out.println(" сума от елементите за реда: " + sumR);
		totalSum += sumR;		
		sumR = 0;
	}
	
	System.out.println("Сума на елементите: " + totalSum);
}
}
