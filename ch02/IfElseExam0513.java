package ch02;

import java.util.Scanner;

public class IfElseExam0513 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자릉입력해주세요");

		int num = in.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수");

		} else {
			System.out.println("홀수");

		}
		System.out.println("종료");

	}

}
