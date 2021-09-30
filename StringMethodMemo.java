package Iot_Java.day11;

public class StringMethodMemo {
	public static void main(String[] args) {
		// =====================
		// String �޼ҵ� Ȱ���� ����
		// =====================
		// 1. ���ڿ� ��ü �����
		String s1 = "Welcome to Korea";
		String s2 = "Welcome to Korea";
		String s3 = s1;
		String s4 = "Welcome to" + " Korea";
		String s5 = s1 + s2;
		String s6 = new String("Welcome to Korea");
		
		byte [] bArr = { 'H', 'E', 'L', 'L', ' ', 'K', 'O', 'R', 'E', 'A' };
		String s7 = new String(bArr);
		
		// 2. ���ڿ� ���ϱ� ==, equals
		// ��ü(�����ּҰ�) �� : '=='     ex) s1 == null
		// ���ڿ��� ������ �� : 'equals'  ex) "hi".equals("h12");
		System.out.println("s1 == s2 = " + (s1 == s2));
		System.out.println("s1 == s3 = " + (s1 == s3));
		System.out.println("s1 == s4 = " + (s1 == s4));
		System.out.println("s1 == s6 = " + (s1 == s6));
		
		String s8 = "Hi 2 Korea";
		String s9 = "Hi 2 Korea";
		String s10 = "Hi 2 Korea";
		System.out.println(s1.equals(s8));
		System.out.println(s8.equals(s10));
	}
}
