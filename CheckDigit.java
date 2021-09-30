package Iot_Java.day11;

public class CheckDigit {
	public static void main(String[] args) {
		// 문자열을 입력받아("780102-123456")
		// "-"를 제거한후
		// 해당 문자열이 모두 숫자로 구성되어 있는지 확인하기
		// 입력: "780102-123456" : "780102-))123456"
		// 판별: true, false
		// 출력: "숫자입니다"       : "숫자가 아닙니다"
		
		final int ZERO = 0;
		final int NINE = 9;
		String numStr = "780102-123456";
		numStr = numStr.replace("-", "");
		char [] numChr = numStr.toCharArray();
		boolean isNumber = true;
		System.out.println('0' - 48); // 48 - 48이랑 같은말.
		
		for( int i = 0; i < numChr.length; i++ ) {
			
			// '7' 숫자형 문자 가져오기
			if( numChr[i] < '0' || numChr[i] > '9') {
				isNumber = false;
				break;
			}
		}
		System.out.println(numStr);
		if(isNumber) {
			System.out.println("숫자 입니다.");
		}	else {
			System.out.println("숫자가 아닙니다.");
		}
	}
}

