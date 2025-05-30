package ch05.extended.car;

public class Car {
 //부모 클래스
	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed+=1;
	}//speedup 메소드를 호출하면 속도가 1씩 증가
	public final void stop() {
		System.out.println("자동차가 멈춥니다.");
		speed = 0;
	}
}
