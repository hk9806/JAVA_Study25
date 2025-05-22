package ch04;

public class Calculator {// 계산기 프로그램
	// 메소드

	void poweron() {
		System.out.println("계산기의 전원을 켭니다.");

	}
	int plus(int x,int y) {//덧셈
		
		int result = x+y;
		return result;
	}
	int minus (int x,int y) {//뺄셈
		int result = x-y;
		return result;
	}
	int multuply (int x,int y) {//곱셈
		int result = x*y;
		return result;
	}
	double divide (int x,int y) {//나눗셈
		double result = (double)x/(double)y;
		return result;
	}
	int remainder (int x,int y) {//곱셈
		int result = x%y;
		return result;
	}
	void poweroff() {
		System.out.println("전원을 끕니다.");
	}
	
}
	
