package ch05.extended.car;

public class SportCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}//스포츠카는 속도가 10씩 증가
	
	
	
//	public void stop() {
//		System.out.println("스포츠카 멈춤");
//		speed = 0;
//	}//final 메소드는 오버라이딩이 안됨.
}
