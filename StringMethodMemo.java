package Iot_Java.day11;

public class StringMethodMemo {
	public static void main(String[] args) {
		// =====================
		// String 메소드 활용해 보기
		// =====================
		// 1. 문자열 객체 만들기
		String s1 = "Welcome to Korea";
		String s2 = "Welcome to Korea";
		String s3 = s1;
		String s4 = "Welcome to" + " Korea";
		String s5 = s1 + s2;
		String s6 = new String("Welcome to Korea");
		
		byte [] bArr = { 'H', 'E', 'L', 'L', ' ', 'K', 'O', 'R', 'E', 'A' };
		String s7 = new String(bArr);
		
		// 2. 문자열 비교하기 ==, equals
		// 객체(참조주소값) 비교 : '=='     ex) s1 == null
		// 문자열의 실제값 비교 : 'equals'  ex) "hi".equals("h12");
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
