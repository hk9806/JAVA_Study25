package ch01;

public class CastingExam {

	public static void main(String[] args) {
		
		int intValue = 123456789;
		byte byteValue = (byte)intValue;
		
		System.out.println(intValue);//int ��
		System.out.println(byteValue);//int ���� byte�� ����ġȯ (2����)
	
		int intv1 = 100;
		byte bytev1 = (byte)intv1;
		System.out.println(intv1);
		System.out.println(bytev1);
		
		intValue = 44032;
		char charValue = (char)intValue ;
		System.out.println(charValue);
		
		double doubleValue = 3.14;//�Ǽ�
		intValue = (int) doubleValue;//double�Ǽ����� int ���������� ġȯ
		System.out.println(intValue);

		int i=128;
		if((i<Byte.MIN_VALUE)||(i>Byte.MAX_VALUE)) {
			//i�� ���� Byte�� �ּҰ����� �۰ų� s�ִ밪���� ũ��
			System.out.println("byteŸ������ ��ȯ�� �� �����ϴ�.");
			System.out.println(Byte.MIN_VALUE+"������ �۰ų�");
			System.out.println(Byte.MAX_VALUE+"������ Ů�ϴ�");
		} else {
			byte b=(byte)i; //int�� byte�� ����Ÿ�Ժ�ȯ
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
