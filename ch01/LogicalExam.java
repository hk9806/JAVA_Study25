package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {

		String loginid = "dn";
		String loginpw = "wf";

		Scanner input = new Scanner(System.in);

		System.out.print("id를 입력하세요:");
		String id = input.nextLine();
		System.out.println("입력하신 아이디는" + id + "입니다");

		System.out.println("로그인할 암호를 입력하세요:");
		String pw = input.nextLine();
		System.out.println("---로그인중---");

		if ((loginid.equals(id) & (loginpw.equals(pw)))) {
			System.out.println("확인중입니다.");
			System.out.println("로그인되었습니다.");
		} else {
			System.out.println("id나 비밀번호를 다시 확인해주세요");
			System.out.println("로그인실패");
		}
	}

}