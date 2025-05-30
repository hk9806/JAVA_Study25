package ch05.promotion.vehicle;

public class Taxi extends vehicle{

	@Override
	public void run() {
		super.run();
		System.out.println("택시가 달립니다.");
	}
	
}
