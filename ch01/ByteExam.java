package ch01;

public class ByteExam {

	public static void main(String[] args) {
		byte var1 =-128;
		byte var2 =-30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; byte������ -128���� 0�� ������ 127���� ǥ�Ⱑ��.
		//127�� �ʰ��ϴ� ���� ���x
		
		System.out.println("var1�� ��: "+var1);
		System.out.println("var2�� ��: "+var2);
		System.out.println("var3�� ��: "+var3);
		System.out.println("var4�� ��: "+var4);
		System.out.println("var5�� ��: "+var5);
		
		byte num1=-125;
		int num2=-125;
		for(int i=0 ; i<7 ;i++) {//���� i�� 0~7���� �ݺ���
			num1--; //byteŸ���� ���� 125�� 1�� ����
			num2--; //int Ÿ���� ���� 125�� 1�� ����
			System.out.println("num1: "+num1+ "                num2: "+num2);
		}
		
	}

}
