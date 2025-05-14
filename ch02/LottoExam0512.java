package ch02;

import java.util.Scanner;

public class LottoExam0512 {

	public static void main(String[] args) {
		// �ζ� ��÷ ���α׷�

		// ���������� 1~45 ���� ���߱�

		Scanner in = new Scanner(System.in);
		System.out.println("로또 1부터 45까지 번호중 6개를 입력해주세요");

		int mynum1 = in.nextInt();
		System.out.println("첫번째: " + mynum1);

		int mynum2 = in.nextInt();
		System.out.println("두번째: " + mynum2);

		int mynum3 = in.nextInt();
		System.out.println("세번째: " + mynum3);

		int mynum4 = in.nextInt();
		System.out.println("네번째" + mynum4);

		int mynum5 = in.nextInt();
		System.out.println("다섯번째: " + mynum5);

		int mynum6 = in.nextInt();
		System.out.println("여섯번째: " + mynum6);

		int num1 = (int) (Math.random() * 45) + 1;//1~45���� ��
		int num2 = (int) (Math.random() * 45) + 1;
		int num3 = (int) (Math.random() * 45) + 1;
		int num4 = (int) (Math.random() * 45) + 1;
		int num5 = (int) (Math.random() * 45) + 1;
		int num6 = (int) (Math.random() * 45) + 1;

		int x = 0;//num1~6���� ���� ���� ��

		if (mynum1 == num1 || mynum1 == num2 || mynum1 == num3 || mynum1 == num4 || mynum1 == num5 || mynum1 == num6) {
			++x;
		}
		if (mynum2 == num1 || mynum2 == num2 || mynum2 == num3 || mynum2 == num4 || mynum2 == num5 || mynum2 == num6) {
			++x;
		}
		if (mynum3 == num1 || mynum3 == num2 || mynum3 == num3 || mynum3 == num4 || mynum3 == num5 || mynum3 == num6) {
			++x;
		}
		if (mynum4 == num1 || mynum4 == num2 || mynum4 == num3 || mynum4 == num4 || mynum4 == num5 || mynum4 == num6) {
			++x;
		}
		if (mynum5 == num1 || mynum5 == num2 || mynum5 == num3 || mynum5 == num4 || mynum5 == num5 || mynum5 == num6) {
			++x;
		}
		if (mynum6 == num1 || mynum6 == num2 || mynum6 == num3 || mynum6 == num4 || mynum6 == num5 || mynum6 == num6) {
			++x;
		}
		System.out.println("======================");
		System.out.println("당청번호입니다.");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
		System.out.println("=============================");

		if (x == 0) {
			System.out.println("맞춘번호가 없습니다");
		}
		if (x == 1) {
			System.out.println("1개 맞추셨습니다");
		} else if (x == 2) {
			System.out.println("2개 맞추셨습니다");
		} else if (x == 3) {
			System.out.println("3개 맞추셨습니다");
		} else if (x == 4) {
			System.out.println("4개 맞추셨습니다");
		} else if (x == 5) {
			System.out.println("5개 맞추셨습니다");
		} else if (x == 6) {
			System.out.println("6개 맞추셨습니다");
		} else
			System.out.println("에러입니다 프로그램을 종료합니다");

	}

}
