package ch01;

import java.util.Scanner;

public class NextDoubleExam {

	public static void main(String[] args) {
		
		double w, h, area;
		Scanner input = new Scanner(System.in);
		System.out.println("직사각형의 가로 길이를 입력하세요");
		w=input.nextDouble();
		System.out.println("직사각형의 세로 길이를 입력하세요");
		h=input.nextDouble();
		area=w*h;
		System.out.println("직사각형의 넓이는 "+area+" 입니다");
		
	}

}
