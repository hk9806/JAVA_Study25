package ch05.extended.override;

public class SuperSonicExam {
	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();//이륙
		sa.fly();//일반비행
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		//supersonic 모드로 변경
		
		sa.fly();//초음속 비행
		sa.flyMode =SuperSonicAirplane.NORMAL;
		sa.fly();//일반비행
		sa.land();//착륙
	}
}
