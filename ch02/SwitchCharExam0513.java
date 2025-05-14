package ch02;

import java.util.Scanner;

public class SwitchCharExam0513 {

	public static void main(String[] args) {

		Scanner inchar = new Scanner(System.in);

		System.out.print("회원등급을 입력하세요(A~C): ");

		char gradechastr = inchar.next().charAt(0);

		switch (gradechastr) {
		case 'a':
		case 'A':
			System.out.println("우수회원입니다.");
			break;
		case 'b':
		case 'B':
			System.out.println("일반회원입니다.");
		case 'c':
		case 'C':
			System.out.println("관리자회원입니다.");

		default:
			System.out.println("처음입니까?");
			System.out.println("회원가입을 원하시면 yes를 입력해주세요");
			String newmember = inchar.next();

			if (newmember.equalsIgnoreCase("yes")) {
				System.out.println("회원가입을 진행합니다");
				System.out.println("id를 입력해주세요");
				System.out.print("ID: ");
				String id = inchar.next();
				System.out.println("패스워드를 입력해주세요");
				String pw = inchar.next();
				System.out.println(id + "님 반갑습니다");
				System.out.println("입력하신 비밀번호는 " + pw + "입니다");
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			} // ȸ������if��
		}// switch��

	}// ���θ޼���

}// Ŭ����
