package ch01;

public class IntLongDoubleFloatBooleanExam {

	public static void main(String[] args) {
		
		int var1=10; //10����
		int var2=012; //8����
		int var3=0xA; //16����
		int var4=0b0010; //2����
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		long ver1=10;
		long ver2=20L;
		//long ver3 = 12345678912345; ���̻�L �ٿ��� ó������
		long ver4 = 12345678912345L;
		
		System.out.println(ver1);
		System.out.println(ver2);
		System.out.println(ver4);
		
		
		double val1 = 3.14;
		//floatŸ���� ���̻�F �Է�
		float val2=3.14F;
		
		double val3 = 0.123456789123456789;	
		float val4 =0.123456789123456789F;
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		
		boolean stop = true;
		
		if(stop) {
			System.out.println("�����մϴ�");
		}	else {System.out.println("����մϴ�");
		}
		
	}

}
