package ch01;

public class StringExam {

	public static void main(String[] args) {
		String str1="ȫ����";
		String str2="ȫ����";
		String str3= new String("ȫ����");
		System.out.println(str1==str2);
		System.out.println(str1==str3);//������ ����
		System.out.println("-------------");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));//���� ��
		

	}

}
