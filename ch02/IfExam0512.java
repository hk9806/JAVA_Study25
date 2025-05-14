package ch02;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class IfExam0512 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("이름을 입력해주세요");
		System.out.print(">>>");
		String name = input.nextLine();

		System.out.println("성적을입력하세요");
		System.out.print("kor: ");
		int kor = input.nextInt();
		if (kor < 0 || kor >= 100) {
			System.out.println("다시입력해주세요");
		}
		System.out.print("mat: ");
		int mat = input.nextInt();
		if (mat < 0 || mat > 100) {
			System.out.println("다시입력해주세요");
		}
		System.out.print("eng: ");
		int eng = input.nextInt();
		if (eng < 0 || eng > 100) {
			System.out.println("다시입력해주세요");

		}
		int total = kor + mat + eng;
		double avg = (double) total / 3;
		System.out.println("확인");
		System.out.println("평균을 계산하시겠습니까?");

		String ans = input.next();
		if (ans.equalsIgnoreCase("yes")) {
			System.out.println("진행중입니다");
			System.out.println("평균: " + avg);
		} else if (ans.equalsIgnoreCase("no")) {
			System.out.println("취소중");
			System.out.println("프로그램을 종료합니다");
		}

	}

}
