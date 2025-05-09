package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		int mach;
		int distance;
		mach=340;
		distance=60*60*mach; //음속 m/s로 계산
		
		System.out.println("소리가 한시간동안 가는거리 : "+distance+'m');
	
		double radius; //소수점을 표기하지 않는 정수는 int 사용
		double area; //소수점이 나타나는 실수는 double 사용

		radius = 10; // 초기값이 정수이나 실수로 표기됨
		area = radius*radius*3.14; //원의 넓이 구하는 공식
				
		System.out.println("반지름이"+radius+"인 원의 넓이: "+area);
		
	}

}
