package ch05.getter_setter;

public class CarExam0526 {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		
		//잘못된 속도 제공
		myCar.setSpeed(-50);
		System.out.println("현재속도: "+myCar.getSpeed());
		//값을 입력할때 = setter
		//값을 출력할떄 = getter

	}

}
