package ch01;

public class PromotionExam {

	public static void main(String[] args) {
		byte byteValue =10;
		int intValue = byteValue; //자동타입변환
		
		System.out.println(intValue); //10이 출력
		//byte byteValue = intValue ; 큰타입에서 작은타입은 오류.

		char charValue = '가';
		int intValue1 = charValue;
		
		System.out.println("가의 유니코드 값: "+intValue1); //char타입을 int타입으로 치환
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		
	}

}
