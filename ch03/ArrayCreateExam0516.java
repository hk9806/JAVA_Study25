package ch03;

public class ArrayCreateExam0516 {

	public static void main(String[] args) {
		int[] scores= {83,90,87};
		
		System.out.println("scores[0]: "+scores[0]);
		System.out.println("scores[1]: "+scores[1]);
		System.out.println("scores[2]: "+scores[2]);
		
		int sum =0;
		for(int i = 0;i<scores.length;i++) {
			sum+=scores[i]; 
			//System.out.println(sum); 총점 구하는 법
		}
		System.out.println("총점: "+sum);
		double avg=(double)sum/3;
		System.out.println("평균: "+(double)avg);

	}

}
