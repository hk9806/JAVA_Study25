package ch05.extended.override;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle()실행");
		return Math.PI*r*r;
	}
	
}
