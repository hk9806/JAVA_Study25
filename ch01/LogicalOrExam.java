package ch01;

import java.util.Scanner;

public class LogicalOrExam {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("4�� ����� 5�ǹ���� Ȯ���մϴ�.");
		
		int num = input.nextInt();
		
		if ((num%4==0)||(num%5==0)) {
			System.out.println("4�� ����̰ų� 5�� ����Դϴ�.");
		} else {
			System.out.println("4�� ����̰ų� 5�� ����� �ƴմϴ�.");
		}
			
			

	}
}
