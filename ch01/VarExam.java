package ch01;

public class VarExam {

	public static void main(String[] args) {
		
		int x=1;
		char y=65;
		char z='A';
		
		System.out.println("int x="+x);
		System.out.println("char y="+y);
		System.out.println("char z="+z);
		
		int x1;
		x1 = 10;
		char z1='b'; //���ڷ� ġȯ
		
		System.out.println(x1);
		System.out.println(z1);
		
		int kor, mat, eng, total; //int ����
		double avg; //double �Ǽ�
		kor = 90;
		eng = 87;
		mat = 91;
		total = kor+eng+mat;
		avg = total/3;
		
		System.out.print("����"+kor);
		System.out.print(" ����"+mat);
		System.out.print(" ����"+eng);
		System.out.print(" ����"+total);
		System.out.println(" ���"+avg); 
		//print�� �Է½� �����࿡�� ��� println�Է½� �� ������ ���
		
		char firstname = 'a';
		char firstName = 'a';
		
		System.out.print("�� : "+firstname);
		System.out.println(", �̸� :  "+firstName); 
		//���� �� �����̸��� ���Ұ� ��, ��ҹ��� �����Ͽ� ����� ��� ����
		//������ ������������ ���Ұ��� (ex. class ,public ��� ���� �ڹٿ��� ������� ���)
		
		
		int literal1 = 75; //10����
		int literal2 = 075; //8����
		int literal3 = 0x0011; //2����
		int literal4 = 0xA; //16����
				//literal=�����Էµ� ��
		
		System.out.println("10���� : "+literal1);
		System.out.println("8���� : "+literal2);
		System.out.println("2���� : "+literal3);
		System.out.println("16���� : "+literal4);

		
	}

}
