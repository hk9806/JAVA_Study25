package ch03;

import java.util.Scanner;

public class ArrayScoresExam0516 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("---성적표---");
		System.out.println("학생수를 입력하세요");
		System.out.print(">>");

		int count = input.nextInt();

		int[] scores = new int[count];

		System.out.println("학생 수 : " + scores.length);

		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력하세요");
			scores[i] = input.nextInt();
		}
		System.out.println("입력된 점수 확인");

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + " ");
		}
		System.out.println();
		System.out.println("---수정할 번호 입력---");

		int select = input.nextInt();
		System.out.println("---수정할 점수 입력---");

		int score = input.nextInt();

	

		System.out.println("수정결과 확인");

		System.out.println(select + "번의 점수: " + score + "로 수정완료");

		int sum = total(scores);
		System.out.println("총점: " + sum);
		double avg = average(sum, count);
		System.out.println("평균: " + avg);

	}// main

	private static double average(int sum, int count) {
		double avg = 0;
		avg = sum / count;
		return avg;
	}

	private static int total(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}// class