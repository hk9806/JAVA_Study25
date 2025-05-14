package ch02;

import java.util.Scanner;

public class DoWhile2Exam0514 {

	public static void main(String[] args) {
		int input = 0, answer=0;
		
		answer = (int)(Math.random()*31+1);
		Scanner scanner =new Scanner(System.in);
		
		do {
			System.out.println("1과 31사이의 정수를 입력하세요");
			input=scanner.nextInt();
			
			if(input>answer) {
				System.out.println("down");
			}else if (input<answer) {
				System.out.println("up");
			}
		}while (input!=answer);
		System.out.println("정답입니다."+answer);
	}

}
