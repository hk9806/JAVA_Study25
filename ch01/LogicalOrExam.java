package ch01;

import java.util.Scanner;

public class LogicalOrExam {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("4의 배수나 5의배수를 확인합니다.");
		
		int num = input.nextInt();
		
		if ((num%4==0)||(num%5==0)) {
			System.out.println("4의 배수이거나 5의 배수입니다.");
		} else {
			System.out.println("4의 배수이거나 5의 배수가 아닙니다.");
		}
			
			

	}
}
