package ch04.CarExam;

import java.util.Scanner;

public class CarExan0522 {

	public static void main(String[] args) {
		// 차량 주행 시스템
		Scanner input = new Scanner(System.in);
		boolean run = true;
		boolean run1 = true;
		System.out.println("--차량정보입력--");
		Car mycar = new Car();// 기본 생성자로 객체 생성

		System.out.println("제조회사: ");
		mycar.company = input.next();
		System.out.println("모델명: ");
		mycar.model = input.next();
		System.out.println("색상: ");
		mycar.color = input.next();

		while (run) {
			System.out.println("1.차량정보조회");
			System.out.println("2.차량 시동");
			System.out.println("3.차량 주행시작");
			System.out.println("0.차량 시동종료");
			String select = input.next();
			switch (select) {
			case "1":
				System.out.println("제조회사: " + mycar.company);
				System.out.println("모델명: " + mycar.model);
				System.out.println("색상: " + mycar.color);
				System.out.println("-----------------");
				break;
			case "2":
				mycar.start();
				if (mycar.oil != 0) {
					System.out.println("차량시동");

				} else {
					System.out.println("연료량이 부족합니다.");
					System.out.println("시동을 종료합니다");
					run = false;
				}
				System.out.println("----------------");
				break;
			case "3":
				System.out.println("주행 시작");
				while (run1) {

					System.out.println("1.가속|2.감속|0.이전메뉴");
					int choice = input.nextInt();
					switch (choice) {
					case 1:
						System.out.println("가속합니다");
						if (mycar.speed >= mycar.maxspeed) {
							mycar.speed = mycar.maxspeed;
						} else {
							mycar.speed += 30;
							mycar.rpm += 5;
						}
						mycar.oil--;
						System.out.println("현재속도: " + mycar.speed);
						System.out.println("현재 rpm:" + mycar.rpm);
						System.out.println("현재 오일량: " + mycar.oil);

						break;
					case 2:
						System.out.println("감속합니다");
						if (mycar.speed <= mycar.minspeed) {
							mycar.speed = mycar.minspeed;
						} else {
							mycar.speed -= 30;
							mycar.rpm -= 5;
						}
						mycar.oil--;
						System.out.println("현재속도: " + mycar.speed);
						System.out.println("현재 rpm:" + mycar.rpm);
						System.out.println("현재 오일량: " + mycar.oil);

						break;
					case 0:
						System.out.println("이전메뉴");
						run1 = false;
						break;
					}// switch
				} // while

				break;
			case "0":
				System.out.println("차량 시동종료");
				run = false;
				break;
			default:
				System.out.println("1~4까지만 입력해주세요");
			}
		}
	}
}
