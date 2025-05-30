package ch05.promotion.vehicle;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver();
		//Driver 객체를 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		//bus,taxi객체 생성
		
		//drive() 메소드를 호출 할 떄 Bus객체와 Taxi 객체를 제공
		driver.drive(bus);
		//자동타입 변환 vehicle vehicle = bus;
		driver.drive(taxi);
		//자동타입 변환 vehicle vehicle = taxi;

	}

}
