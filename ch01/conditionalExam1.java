package ch01;

public class conditionalExam1 {

	public static void main(String[] args) {
		
	int x=-100;//��� 100��x�� ����
	int result1 = +x; //������ +��ȣ�� �پ ��ȣ ����.
	int result2 = -x; //������ -��ȣ�� �پ ��ȣ ����.
	System.out.println(result1);
	System.out.println(result2);
	
	short s=100;
	//short result3=-s; ��꿡 �⺻ Ÿ���� int�̱� ������ ����
	int result3 = -s;
	System.out.println(result3);
	
	System.out.println("-------���׿���---------");
	int a=10;
	a++;
	++a;
	System.out.println("a="+a);
	
	int b=20;
	--b;
	b--;
	System.out.println("b="+b);
	int k;
	k=--b;
	System.out.println("b="+b);
	System.out.println("k="+k);
	

	}

}
