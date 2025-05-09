package ch01;

public class OverFlowExam {

	public static void main(String[] args) {

		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z); // 276447232

		long x1 = 10000000;
		long y1 = 10000000;
		long z1 = x1 * y1;
		System.out.println(z1);

		try { //예외처리문
			int result = safeadd(35, 80); //오류 없을 경우 실행
			System.out.println(result);//오류 없을경우 정상 출력
		} catch (ArithmeticException e) { //검증시 오류에 대한 처리
			System.out.println("오버플로우 발생: 처리할 수 없음");
		}

	}
	public static int safeadd(int left, int right) {
		if(right>0) {
			if(left>(Integer.MAX_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}else {
			if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left+right;
	}	
}
