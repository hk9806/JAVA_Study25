package ch04;

public class Car {
	// 필드

	public String company;
	public String model;
	public String color;
	public final int maxspeed=300;
	public final int minspeed=0;
	public String oilType;
	// ----상태----
	public int speed;
	public int rpm;
	public int oil;

	// 기본 생성자
	public Car() {
		speed = 0;
		rpm = 50;
		oil = (int) (Math.random() * 100 + 1);
	
	}

	// 사용자 지정 생성자
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
		
		
	}

	// 메소드
	public void start() {
		System.out.println(this.model + "이(가) 주행을 시작합니다.");
		System.out.println("현재 속도" + this.speed);
		System.out.println("현재 rpm" + this.rpm);
		System.out.println("현재 주유량" + this.oil);
	}
}
