package ch04;

public class CalExam0522 {

	public static void main(String[] args) {
		Cal  myCal= new Cal();
		
		int intresult = myCal.plus(10, 20);
		System.out.println("정수 더하기 값 결과: "+intresult);
		
		double doubleresult = myCal.plus(10.5, 11.4);
		System.out.println("실수 더하기 값 결과: "+doubleresult);
		
	}

}
