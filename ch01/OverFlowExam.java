package ch01;

public class OverFlowExam {

	public static void main(String[] args) {

		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z); // 276447232

		long x1 = 10000000;
		long y1 = 10000000;
		long z1 = x1 * y1;
		System.out.println(z1);

		try { //����ó����
			int result = safeadd(35, 80); //���� ���� ��� ����
			System.out.println(result);//���� ������� ���� ���
		} catch (ArithmeticException e) { //������ ������ ���� ó��
			System.out.println("�����÷ο� �߻�: ó���� �� ����");
		}

	}
	public static int safeadd(int left, int right) {
		if(right>0) {
			if(left>(Integer.MAX_VALUE-right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}else {
			if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		return left+right;
	}	
}
