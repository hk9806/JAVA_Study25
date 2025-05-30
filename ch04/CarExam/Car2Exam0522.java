package ch04.CarExam;

public class Car2Exam0522 {

	public static void main(String[] args) {

		// Car2 객체 생성
		Car2 mycar = new Car2();
		// 필드 사용
		mycar.speed = 60;
		System.out.println("나의 자동차 속도는 현재 : " + mycar.speed);
		// 필드 값 읽기
		System.out.println("제작회사 : " + mycar.company);
		System.out.println("모델명: " + mycar.model);
		System.out.println("색깔: " + mycar.color);
		System.out.println("최고속도: " + mycar.maxSpeed);
		System.out.println("생산년도: " + mycar.productionYear);
		System.out.println("주행속도: " + mycar.CurrentSpeed);
		System.out.println("시동상태: " + mycar.engineStart);
		
		System.out.println();
		Car2 mycar1 = new Car2();
		System.out.print("(기본생성자)차량정보: "+mycar1.model);
		System.out.println();
		
		Car2 mycar2 = new Car2("SUV");
		System.out.print("차량정보: "+mycar2.model);
		System.out.print(mycar2.company+mycar2.color+mycar2.maxSpeed);
		System.out.println();
		
		Car2 mycar3 = new Car2("SUV","빨강");
		System.out.print("차량정보: "+mycar3.model);
		System.out.print(mycar3.company+mycar3.color+mycar3.maxSpeed);
		System.out.println();
		
		Car2 mycar4 = new Car2("세단","파랑",200);
		System.out.print("차량정보: "+mycar4.model);
		System.out.print(mycar.company+mycar4.color+mycar4.maxSpeed);
		System.out.println();
		
		
		
		
	}

}
