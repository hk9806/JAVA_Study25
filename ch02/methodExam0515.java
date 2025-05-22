package ch02;

import java.util.Scanner;

public class methodExam0515 {
	public static void main(String[] args) {
		// 성적처리용 프로그램을 메서드로 재구현
		// 메인 메서드에서는 주 메뉴 구현
		// 사용자 지정 메뉴는 서브메뉴 구현

		Scanner inputint = new Scanner(System.in);

		boolean run = true;
		String id = "kh";
		String pw = "1234";
		boolean session = false; // 로그인 상태 저장용
		while (run) {
			System.out.println("======test======");
			System.out.println("1.로그인");
			System.out.println("2.교사관리");
			System.out.println("3.학생관리");
			System.out.println("4.성적관리");
			System.out.println("0.프로그램 종료");
			System.out.print(">>");
			int select = inputint.nextInt();

			switch (select) {
			case 1:
				System.out.println("로그인 메뉴입니다.");
				session = loginOK(id, pw, session);
				if(session == true) {
					System.out.println(id+"님 환영합니다");
					System.out.println("(2~4)메뉴를 선택해주세요");
				}else {
					System.out.println("로그인 실패, id와 pw를 다시 확인해주세요");
				}
				break;
			case 2:
				System.out.println("교사관리 메뉴입니다.");
				break;
			case 3:
				System.out.println("학생관리 메뉴입니다.");
				break;
			case 4:
				System.out.println("성적관리 메뉴입니다.");
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			}// switch end

		} // while end

	}// main method end

	static boolean loginOK(String id, String pw, boolean session) {
		// login여부를 결정하는 메서드
		Scanner inputLogin = new Scanner(System.in);
		System.out.println("로그인 할 id를 입력해주세요");
		System.out.print(">>");
		String inputId = inputLogin.next();

		System.out.println("로그인 할 pw를 입력해주세요");
		System.out.print(">>");
		String inputPw = inputLogin.next();

		if (id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println(id+"kh와 pw가 일치합니다.");
			System.out.println("로그인 성공");
			session = true;

		} else {
			System.out.println("id와 pw가 불일치합니다.");
			System.out.println("로그인실패");
			session = false;
		} // id, pw일치 판단문 종료
		return session; // 로그인 판단 결과 리턴
	}// loginOK method end

}// class end

