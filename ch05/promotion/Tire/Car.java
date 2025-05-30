package ch05.promotion.Tire;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞으론쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽",4);
	//자동차 부품인 타이어 4개 객체 생성(위치, 마일리지)
	//생성자
	//메소드 roll소환하여 주행여부 판단
	int run() {//자동차 주행 여부
		if(frontLeftTire.roll()==false) {stop();return 1;}
		if(frontRightTire.roll()==false){stop();return 2;}
		if(backLeftTire.roll()==false){stop();return 3;}
		if(backRightTire.roll()==false){stop();return 4;}
		return 0;
	}//정상주행이면 0 리턴/퍼크기 1~4까지 위치 정보 리턴
	private void stop() {
		System.out.println("자동차가 멈춥니다.");//펑크났을때
		
		
	}
}
