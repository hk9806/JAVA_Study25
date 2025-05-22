package ch03;

public class ArrayExam0516 {

	public static void main(String[] args) {
		int[] score = { 83, 90, 87 };

		System.out.println("test1-" + score[0]);
		System.out.println("test2-" + score[1]);
		System.out.println("test3-" + score[2]);
		int sum =0;
		double avg = 0.0;
		for (int i = 0; i <score.length; i++) {
			sum = sum+score[i];
		}
		System.out.println("total: "+(double)sum);
		System.out.println("학생수: "+score.length+"명");
		System.out.println("평균: "+(avg= sum/score.length));
	}
}