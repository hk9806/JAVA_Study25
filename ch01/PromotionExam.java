package ch01;

public class PromotionExam {

	public static void main(String[] args) {
		byte byteValue =10;
		int intValue = byteValue; //�ڵ�Ÿ�Ժ�ȯ
		
		System.out.println(intValue); //10�� ���
		//byte byteValue = intValue ; ūŸ�Կ��� ����Ÿ���� ����.

		char charValue = 'k';
		int intValue1 = charValue;
		
		System.out.println("Hello: "+intValue1); //charŸ���� intŸ������ ġȯ
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		
	}

}
