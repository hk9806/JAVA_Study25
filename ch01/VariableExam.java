package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		int mach;
		int distance;
		mach=340;
		distance=60*60*mach; //���� m/s�� ���
		
		System.out.println("�Ҹ��� �ѽð����� ���°Ÿ� : "+distance+'m');
	
		double radius; //�Ҽ����� ǥ������ �ʴ� ������ int ���
		double area; //�Ҽ����� ��Ÿ���� �Ǽ��� double ���

		radius = 10; // �ʱⰪ�� �����̳� �Ǽ��� ǥ���
		area = radius*radius*3.14; //���� ���� ���ϴ� ����
				
		System.out.println("��������"+radius+"�� ���� ����: "+area);
		
	}

}
