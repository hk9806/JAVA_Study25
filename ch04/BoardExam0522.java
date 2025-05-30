package ch04;

import java.util.Scanner;

public class BoardExam0522 {
	public static Scanner input = new Scanner(System.in);
	public static Member1[] members = new Member1[100];
	public static Board[] boards = new Board[1000];

	public static void main(String[] args) {
		// 게시판 구현
		// 객체는 2개 (Member,Board)
		// 회원제용 게시판 구현
		System.out.println("---회원제 게시판---");
		boolean run = true;
		while(run) {
			System.out.println("1.회원관리|2.게시판|0.종료");
			System.out.print(">>");
			int select = input.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("회원관리 메뉴입니다.");
				
				Member1 member = new Member1();
				member.menu(input, members);
				break;
				
			case 2:
				System.out.println("게시판 관리 메뉴입니다");
				break;
			case 0:
				System.out.println("종료");
				run = false;
				break;
				default:
					System.out.println("0~2값만 입력하세요");
			}//switch
		}//while

	}// method

}// class
