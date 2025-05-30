package ch04.CarExam;

public class Car2 {
	String company = "볼보";// 제작사
	String model;// 모델
	String color ;// 색상
	int maxSpeed ;// 최고속도
	int productionYear = 2025;// 제작년도
	int CurrentSpeed = 100;// 주행속도
	boolean engineStart = true;// 시동 상태

	// 상태

	int speed;// 현재 속도
	int rpm; // 엔진 회전수

	Car2() {
		speed = 0;
	}

	Car2(String model) {
		this.model = model;
	}

	Car2(String model, String color) {
		this.model = model;
		this.color = color;

	}

	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
	}

	void methodName() {
		speed = 10;
	}
}
