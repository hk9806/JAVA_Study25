package ch02;

public class BreakOutterExam0514 {

	public static void main(String[] args) {
		// break문에 라벨을 붙이면 반복코드 종료시점을 정할 수 있음.
		Outter: for(char upper='A';upper<='Z';upper++) {
		 for(char lower='a';lower<='z';lower++) {
				
				System.out.println(upper+"-"+lower);
				if(lower=='c') {
					break Outter;
				}
			}
		}

	}

}
