package ch03;

public class ArrayCreate2Exam0516 {

	public static void main(String[] args) {
		int sum = add(new int[] { 70, 80, 90 });
		System.out.println("총합: " + sum);
System.out.println("-------------------------");
	int total1 = add1(new int[] {70,80,90});
	int total2 = add1(new int[] {60,70,80});
	int total3 = add1(new int[] {90,80,50});
	System.out.println("1번의 총합: "+total1);
	System.out.println("2번의 총합: "+total2);
	System.out.println("3번의 총합: "+total3);
	}

	private static int add1(int[] is) {
		int sum = 0;
		for (int i=0; i<3;i++) {
			sum+=is[i];
		}
		
		return sum;
	}

	private static int add(int[] score) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += score[i];
		}
		return sum;

	}

}