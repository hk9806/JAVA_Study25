package ch02;

import java.util.Scanner;

public class Dowhile3Exam0514 {

	public static void main(String[] args) {
		int answer =(int)(Math.random()*50)+1;//랜덤 숫자 생성
		
		Scanner input = new Scanner(System.in);//키보드로 입력받는 객체 생성
		
		int qus = 0; //사용자가 입력하는 값
		int hits =0;//회수 카운트
		System.out.println("---------------------");
		System.out.println("업다운게임에 오신것을 환영합니다");
		System.out.println("기회는 3번입니다");
		System.out.println("---------------------");
		
		do {
			System.out.println("1부터 50사이의 숫자를 입력하세요");
			
			qus = input.nextInt(); //사용자가 키보드로 숫자를 입력
			hits++;
			
			if(qus>answer) {
				System.out.println("down");//사용자가 기재한 값이 클 경우
			}else if (qus<answer) {
				System.out.println("up");//사용자가 기재한 값이 작을 경우
			}
				
			
		} while (qus!=answer); // do~While문 종료
		//랜덤 숫자는 사용자가 입력한 숫자와 같지않으면 do문으로 다시 올라감
		//랜덤 숫자와 사용자가 입력한 숫자가 같으면 아래로 내려옴
		System.out.println("정답입니다"+answer);
		System.out.println("회원님이 맞춘 회수는"+hits+"번째 입니다");
		
		if(hits<=3) { 
			System.out.println("3회안에 맞추셨습니다 축하드립니다");
		}else {
			System.out.println("기회가 3번을 초과하여 해당 게임은 무효처리 됩니다.");
		}


	}

}
