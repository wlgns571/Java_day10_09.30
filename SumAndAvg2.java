package Iot_Java.day11;

public class SumAndAvg2 {
	public static void main(String[] args) {
		int heights [] [] = new int [5] [];
		heights[0] = new int [] {170, 180, 173, 175, 177};
		heights[1] = new int [] {160, 165, 157, 186};
		heights[2] = new int [] {158, 177, 187, 176};
		heights[3] = new int [] {173, 182, 181};
		heights[4] = new int [] {170, 180, 165, 177, 172};
		double sum;
		double avg;
		for(int i = 0; i < heights.length; i++) {
			sum = 0.0;
			avg = 0.0;
			System.out.println("Class No. " + ( i + 1 ));
			for(int j = 0; j < heights[i].length; j++) {
				System.out.println(heights[i][j]);
				sum += heights[i][j];
			}
			avg = sum / heights[i].length;
			System.out.printf("Height Total %d : %5.2f\n", heights[i].length, sum);
			System.out.printf("Height Average %d : %5.2f\n", heights[i].length, avg);
			System.out.println();
		}
		
	}
}
