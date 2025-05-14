package ch01;

public class 정수연산Exam {

	public static void main(String[] args) {

		byte byteValue=10;
		byte byteValue2=20;
		
		int intValue1=byteValue+byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		int intValue2 = charValue1+charValue2;
		System.out.println("유니코드="+intValue2);
		System.out.println("출력문자="+(char)intValue2);
		
		int intValues=10;
		double doubleValue=intValues / 4.0;
		System.out.println(doubleValue);
		

	}

}
