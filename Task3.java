
public class Task3 {
	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }
			};

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
		}

		int average = sum / (arr.length * arr[0].length);
		
		System.out.println("The Sum is: " + sum +'\n' +
				"The average is: " + average );
	}
}
