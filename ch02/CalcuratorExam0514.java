package ch02;

import java.util.Scanner;

public class CalcuratorExam0514 {
	// 계산기 프로그램
	// 입력:숫자>연산자>숫자
	// 연산자별 메서드에 숫자 입력

	static int plus(int x1, int x3) {
		int x4 = 0;
		x4 = x1 + x3;
		return x4;
	}// plus M end

	static int minus(int x1, int x3) {
		int x4 = 0;
		x4 = x1 - x3;
		return x4;
	}// minus M end

	static int times(int x1, int x3) {
		int x4 = 0;
		x4 = x1 * x3;
		return x4;
	}// times M end

	static int divide(int x1, int x3) {
		int x4 = 0;
		x4 = x1 / x3;
		return x4;
	}// divide M end

	public static void main(String[] args) {

		int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0;

		boolean run = true, run2 = true;// while문 boolean

		String y1 = "연산기호"; // 정답표시용

		Scanner scInt = new Scanner(System.in);

		while (run) {
			if (x1 == 0) {
				System.out.print("**&정수계산기**/n숫자를 입력해주세요(int 범위 내에서만)\n>");
				x1 = scInt.nextInt();
			}
			System.out.println("부호를 선택해주세요\n1.+(더하기)\t2.-(빼기)\n3.x(곱하기)\t4.÷(나누기)\n");

			x2 = scInt.nextInt();

			System.out.print("숫자를 입력해주세요(int범위 내에서만)\n>>");

			x3 = scInt.nextInt();
			run2 = true;

			switch (x2) {
			case 1:
				x4 = plus(x1, x3);
				y1 = "+";
				break;
			case 2:
				x4 = minus(x1, x3);
				y1 = "-";
				break;
			case 3:
				x4 = times(x1, x3);
				y1 = "x";
				break;
			case 4:
				x4 = divide(x1, x3);
				y1 = "÷";
				break;
			// default는 생략
			}// switch(x2) end
			System.out.println("계산결과: " + x1 + " " + y1 + " " + x3 + " = " + x4);

			while (run2) {
				if (x4 != 0) {
					System.out.print("1.종료하기\n2.다시하기\n3.이어서계산하기\n>>");
				} else {
					System.out.println("1.종료하기\n2.다시하기\n>>");
				}
				x5 = scInt.nextInt();
				switch (x5) {
				case 2:
					x1 = 0;
					x2 = 0;
					x3 = 0;

					run2 = false;
					break;
				case 3:
					x1 = x4;
					x2 = 0;
					x3 = 3;
					run2 = false;
					break;
				case 1:
					run = false;
					run2 = false;
					break;
				default:
					System.out.println("숫자를 잘못 선택하셨습니다 \n다시 입력해주세요\n");
				}// switch end
			} // (while run2)
		} // while (run1)

	}// main end

} // class end
