package ch04;

public class This {
	String company = "볼보";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자(객체 생성시 초기화 역할 담
	This(String model){
		this.model = model; this.color = "은색";this.maxSpeed = 250;
		
	}
	This(String model,String color){
		this.model = model; this.color = color; this.maxSpeed =250;
		
	}
	This(String model, String color, int maxSpeed){
		this.model =model; this.color = color;this.maxSpeed=maxSpeed;
	}
}
