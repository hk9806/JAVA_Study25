package ch01;

public class StringconcatExam {

	public static void main(String[] args) {
	
	String str1="JDK"+6.0;
	String str2=str1+"Ư¡";
	System.out.println(str1);
	System.out.println(str2);
	System.out.println("--------------");
	
	String str3="jdk"+3+3.0;
	String str4=3+3.0+"jdk";
	System.out.println(str3);//������ ���ڷ� �����ϸ� ���ڿ��� ����
	System.out.println(str4);//������ ���ڷ� �����ϸ� ��� �� ���ڿ��� ����
	
	
			
		
	}

}
