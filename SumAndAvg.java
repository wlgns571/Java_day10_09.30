package Iot_Java.day11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumAndAvg {
	// �л� 5���� ������ �Է�(Ű�����Է�) �޾� 
	// �հ�� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	// �Է�
	// ���� : 20, 30, 50, 60, 80
	// 1��° �Է� : 30
	// 2��° �Է� : 30
	// ���
	// ���� : 20, 30, 50, 60, 80
	// �հ� : 000
	// ��� : 000
	public static void main(String[] args) {
		// �л� 5���� ������ ������ ���� ����
		final int SIZE = 5;
		int [] scores = new int [SIZE]; // 50 21 31 2
		int [] rank = new int[SIZE];
		
		// Ű���� �Է� ��ġ �غ�
		Scanner sc = new Scanner(System.in);
		
		// �Է½���
		// �հ� �� ��� ���ϱ�
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < SIZE; i++) {
			System.out.printf("%d��° ���� �Է� :", i + 1);
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
			//rank[rnk] scores[i]; // ������ �ش��ϴ� ���� ����
			rank[rnk] = i; // ������ �ش��ϴ� ���ȣ(�ε���)�� ����
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
		System.out.printf("����: " + sum);
		System.out.printf("���: " + avg);
	}
}
