package Iot_Java.day11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumAndAvg {
	// 학생 5명의 점수를 입력(키보드입력) 받아 
	// 합계와 평균을 구하는 프로그램을 작성하시오.
	
	// 입력
	// 점수 : 20, 30, 50, 60, 80
	// 1번째 입력 : 30
	// 2번째 입력 : 30
	// 출력
	// 점수 : 20, 30, 50, 60, 80
	// 합계 : 000
	// 평균 : 000
	public static void main(String[] args) {
		// 학생 5명의 점수를 저장할 공간 생성
		final int SIZE = 5;
		int [] scores = new int [SIZE]; // 50 21 31 2
		int [] rank = new int[SIZE];
		
		// 키보드 입력 장치 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력시작
		// 합계 및 평균 구하기
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < SIZE; i++) {
			System.out.printf("%d번째 점수 입력 :", i + 1);
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		for(int i = 0; i < SIZE; i++) {
			int rnk = 1;
			for ( int j = 0; j < i; j++) {
				if ( scores[i] < scores[j] ) {
					rnk++;
				}
			}
			//rank[rnk] scores[i]; // 순위에 해당하는 값을 저장
			rank[rnk] = i; // 순위에 해당하는 방번호(인덱스)를 저장
		}
		System.out.println(Arrays.toString(scores));
//		System.out.println(Arrays.toString(rank));
		for(int i = 0; i < SIZE; i++) {
			System.out.printf("%d, ", scores[i]);
		}
		System.out.println();
		for(int i = 0; i < SIZE; i++) {
			System.out.printf("%d, ", scores[rank[i]]);
		}
		
		avg = (double)sum / SIZE;
		System.out.printf("총점: " + sum);
		System.out.printf("평균: " + avg);
	}
}
