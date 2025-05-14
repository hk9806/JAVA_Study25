package ch02;

public class ForSumExam0514 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1~100까지의 합" + sum);
		System.out.println("------------------------");

		int sum1 = 0;
		int i =1;
		for (;i<=500;i++) {
			sum1=sum1+i;
		}
		System.out.println("1~"+(i-1)+"까지의 합: "+sum1);
	}

}
