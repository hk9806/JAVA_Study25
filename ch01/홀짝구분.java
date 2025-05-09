package ch01;

import java.util.Scanner;

public class 홀짝구분 {

	public static void main(String[] args) {
		
		Scanner res = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int num=res.nextInt();
		System.out.println(num%2==0? "짝수입니다":"홀수입니다");
		

	}

}
