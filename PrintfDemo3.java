package Iot_Java.day11;

public class PrintfDemo3 {
	public static void main(String[] args) {
		String s1 = "Hello", s2 = "World", s3 = "Java";
		String hello = "Hello, World, Java";
		String jva = "Java";
		System.out.printf("%1$s -> [%%s] %1$s\n", hello); // 소문자 출력
		System.out.printf("%1$s -> [%%s] %1$S\n", hello); // 대문자 출력
		
		// "Java" -> [      Java]
		// "Java" -> [Java      ]
		System.out.println("ABCDEFGHIJKLMNN");
		System.out.printf("%1$s -> [%%10s] \n%1$10s", jva);
		System.out.println();
		System.out.printf("%1$s -> [%%-10s] \n%1$-10s", jva);
		
		// "Hello World" -> "Hell"
		System.out.printf("\n%1.4s", "Hello World");
		
		// 100      ->   100
		System.out.printf("\n%d", 100);
		
		// 123.456  ->   123.456000
		System.out.printf("\n%f", 123.456f);
		
		// 123.456  ->   123.46
		System.out.printf("\n%f", 123.456);
		
		// 123.456  ->   1.23e+02
		System.out.printf("\n%5.2f", 123456.456f);
		System.out.printf("\n%5.2e", 23456.456d); // 2.35e+04
		
	}
}
