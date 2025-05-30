package ch04.Calculator;

public class Cal {//계산기 프로그램 연습2
	//메서드 오버로딩 실습
	int plus (int x, int y) {
		int result = x+y;
		return result;
	}//정수의 값을 입력 받아 정수로 리턴.
	double plus (double x,double y)	{
		double result = x+y;
		return result;
	}//실수값을 입력 받아 실수값으로 리턴한다.

	
}
