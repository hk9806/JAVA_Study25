package ch01;

public class AccuracyExam {

	public static void main(String[] args) {
		
		int app=1;//사과 수 
		double piece=0.1;//사과 10조각 중 1
		int num=6; //조각개수
		System.out.println(piece*num);
		
		int totalpiece=app*10;
		int temp =totalpiece-num;
		
		double apple=temp;
		
		System.out.println("사과 1개중 0.6조각을 빼면 "+(int)apple+" 조각이 남는다");
		
	}

}
