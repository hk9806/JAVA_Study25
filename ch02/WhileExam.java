package ch02;

public class WhileExam {

	public static void main(String[] args) throws Exception {
		boolean run=true;//실행여부 판단
		int speed =100; //현재 속도는 100km/h
		int keyCode = 0;
		
		while(run) {//run에 초기값이 true이기 때문에 주행중 이라는 의미
			if (keyCode!=13&&keyCode!=10) {//엔터가 아니면
				System.out.println("----------------------");
				System.out.println("1.액셀 | 2.브레이크 | 3.중지");
				System.out.println("----------------------");
				System.out.println("선택: ");
			}
			keyCode = System.in.read();
			//System.out.println(keyCode);
			
			if (keyCode ==49) {
				speed+=5;
				System.out.println("현재 속도: "+speed);
			}else if (keyCode ==50) {
				speed -=5;
			}else if (keyCode==51) {
				run=false;
				System.out.println("크루즈 기능이 종료됩니다.");
				System.out.println("현재 속도: "+speed);
				System.out.println("안전운전 하세요");
			}//if문 종료
			
			
		}//while문 종료
		System.out.println("프로그램 종료");
	}//class종료
	

}//메서드 종료

