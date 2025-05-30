package ch04.Member;

import java.util.Scanner;

public class MemberObjectExam0521 {

	public static void main(String[] args) {
		// Member 클래스를 호출하여 작업
		Scanner inputStr = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Member[] members = null;
		System.out.println("가입할 회원수를 입력하세요");// 입력값으로 배열 생성
		System.out.print(">>");
		int count = input.nextInt();
		members = new Member[count];

		System.out.println("회원가입 프로그램을 시작합니다.");
		boolean run = true;
		while (run) {
			System.out.println("1.회원가입|2.전체회원 조회|3.로그인|4.회원수정|5.회원탈퇴");
			System.out.println("1~5까지만 입력하세요 다른 키 입력시 종료됩니다.");
			System.out.print(">>");
			int select = input.nextInt();
			switch (select) {
			case 1: 
				Member member1 = new Member();
				for(int i=0;i<members.length;i++) {
					member1=member1.memberAdd(input);
					members[i] = member1;
				}
				break;
			case 2: 
				Member member2 = new Member();
				member2.memberAllList(members);
				
				break;
			case 3: 
				Member member3 = new Member();
				member3.memberLogin(input, members);
				break;
			case 4: 
				Member member4 = new Member();
				member4.memberUpdate(input,members);
				break;
			case 5: 
				Member member5 = new Member();
				member5.memberDelete(input,members);
				break;
			default:
				run = false;
				break;
				

			}// switch
			
		} // while

	}// main

}// class
