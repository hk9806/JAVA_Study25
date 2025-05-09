package ch01;

public class 문자열연결 {

	public static void main(String[] args) {
	
	String str1="JDK"+6.0;
	String str2=str1+"특징";
	System.out.println(str1);
	System.out.println(str2);
	System.out.println("--------------");
	
	String str3="jdk"+3+3.0;
	String str4=3+3.0+"jdk";
	System.out.println(str3);//왼쪽이 문자로 시작하면 문자열로 결합
	System.out.println(str4);//왼쪽이 숫자로 시작하면 계산 후 문자열로 진행
	
	
			
		
	}

}
