package Iot_Java.day11;

public class CheckDigit {
	public static void main(String[] args) {
		// ���ڿ��� �Է¹޾�("780102-123456")
		// "-"�� ��������
		// �ش� ���ڿ��� ��� ���ڷ� �����Ǿ� �ִ��� Ȯ���ϱ�
		// �Է�: "780102-123456" : "780102-))123456"
		// �Ǻ�: true, false
		// ���: "�����Դϴ�"       : "���ڰ� �ƴմϴ�"
		
		final int ZERO = 0;
		final int NINE = 9;
		String numStr = "780102-123456";
		numStr = numStr.replace("-", "");
		char [] numChr = numStr.toCharArray();
		boolean isNumber = true;
		System.out.println('0' - 48); // 48 - 48�̶� ������.
		
		for( int i = 0; i < numChr.length; i++ ) {
			
			// '7' ������ ���� ��������
			if( numChr[i] < '0' || numChr[i] > '9') {
				isNumber = false;
				break;
			}
		}
		System.out.println(numStr);
		if(isNumber) {
			System.out.println("���� �Դϴ�.");
		}	else {
			System.out.println("���ڰ� �ƴմϴ�.");
		}
	}
}

