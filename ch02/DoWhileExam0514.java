package ch02;

import java.util.Scanner;

public class DoWhileExam0514 {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요,");
		System.out.println("프로그램을 종료하려면q를 입력하세요: ");
		
		Scanner in = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">>>");
			inputString = in.nextLine();
			System.out.println("전송값: "+inputString);
		} while (!inputString.equals("q"));
		System.out.println("---------");
		System.out.println("프로그램 종료");
		System.out.println("---------");

	}

}
