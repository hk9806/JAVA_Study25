package ch01;

public class CastingExam {

	public static void main(String[] args) {
		
		int intValue = 123456789;
		byte byteValue = (byte)intValue;
		
		System.out.println(intValue);//int 값
		System.out.println(byteValue);//int 값을 byte로 강제치환 (2진수)
	
		int intv1 = 100;
		byte bytev1 = (byte)intv1;
		System.out.println(intv1);
		System.out.println(bytev1);
		
		intValue = 44032;
		char charValue = (char)intValue ;
		System.out.println(charValue);
		
		double doubleValue = 3.14;//실수
		intValue = (int) doubleValue;//double실수값을 int 정수값으로 치환
		System.out.println(intValue);

		int i=128;
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
			//i의 값이 Byte의 최소값보다 작거나 s최대값보다 크면
			System.out.println("byte타입으로 변환할 수 없습니다.");
			System.out.println(Byte.MIN_VALUE+"값보다 작거나");
			System.out.println(Byte.MAX_VALUE+"값보다 큽니다");
		} else {
			byte b=(byte)i; //int를 byte로 강제타입변환
			System.out.println(b);
		}
	
		int num1=123456780;
		int num2=123456780;
		
		float num3=num2;
		num2=(int)num3;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		int result = num1-num2;
		System.out.println(result);
		
		int no1 = 123456780;
		int no2 = 123456780;
		
		double no3=no2;
		no2=(int)no3;
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		
		int res =no1-no2;
		System.out.println(res);
		
		
	}
	

}
