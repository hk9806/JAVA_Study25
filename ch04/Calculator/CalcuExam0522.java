package ch04.Calculator;

public class CalcuExam0522 {

	public static void main(String[] args) {
	Calcu myCalc = new Calcu();
	
	//정사각형 넓이 구하기
	double result1 = myCalc.areaRectangle(10);
	
	double result2 = myCalc.areaRectangle(10, 20);
	
	System.out.println("정사각혀의 넓이: "+ result1);
	System.out.println("정사각혀의 넓이: "+ result2);

	}

}
