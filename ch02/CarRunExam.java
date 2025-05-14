package ch02;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean run = true ; //시동을 켠다.
		
		int speed = 0; //차량속도
		
		final int MAXSPEED = 300;//최고속도 상수(변경x)
		
		final int MINSPEED = 0;//최저속도 상수(변경x)
		
		System.out.println("차량이 입고 되었습니다");
		System.out.println("시동을 켭니다.");
		System.out.println("현재 속도: "+speed+"km/h");
		
		while (run) {
			System.out.println("----------------");
			System.out.println("0.종료");
			System.out.println("1.액셀");
			System.out.println("2.브레이크");
			System.out.println("3.멀티미디어");
			System.out.println("4.주유");
			System.out.println("-----------");
			System.out.print("(0~4)숫자입력>>");
			
			int select = input.nextInt();
			
			switch(select) {
			case 0:
				System.out.println("시동을 종료합니다.");
				run =false; //while문 종료
				break;
				
			case 1:
				System.out.println("가속을 진행합니다");
				speed +=30;
				if(speed>=MAXSPEED) {//현재 속도가 최고속도보가 크거나 같으면
					speed=MAXSPEED; //300초과값 출력 안됨 (현재 속도값과 최고속도 값을 동등하게 유지)
				}System.out.println("현재 속도: "+speed+"km/h");
				break;
				
			case 2:
				System.out.println("감속을 진행합니다");
				speed -=10;
				if (speed<=MINSPEED) {
					speed = MINSPEED; //현재속도가 0미만값 출력안됨 (현재속도값과 최저속도 값을 동등하게 유지)
				}System.out.println("현재속도: "+speed+"km/h");
				break;
			case 3:
				System.out.println("멀티미디어를 실행합니다.");
				break;
			case 4:
				System.out.println("주유를 진행합니다");
				
				break;
			}//switch종료
					
		}//while 종료
System.out.println("프로그램이 종료됩니다.");
		
	}//main종료

}//class종료
