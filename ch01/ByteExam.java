package ch01;

public class ByteExam {

	public static void main(String[] args) {
		byte var1 =-128;
		byte var2 =-30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; byte변수는 -128부터 0을 포함한 127까지 표기가능.
		//127을 초과하는 값은 출력x
		
		System.out.println("var1의 값: "+var1);
		System.out.println("var2의 값: "+var2);
		System.out.println("var3의 값: "+var3);
		System.out.println("var4의 값: "+var4);
		System.out.println("var5의 값: "+var5);
		
		byte num1=-125;
		int num2=-125;
		for(int i=0 ; i<7 ;i++) {//변수 i를 0~7까지 반복문
			num1--; //byte타입의 변수 125를 1씩 증가
			num2--; //int 타입의 변수 125를 1씩 증가
			System.out.println("num1: "+num1+ "                num2: "+num2);
		}
		
	}

}
