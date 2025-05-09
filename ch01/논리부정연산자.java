package ch01;

public class 논리부정연산자 {

	public static void main(String[] args) {
		
		boolean play= true;
				System.out.println(play);
				
				play = !play;
				System.out.println(play);
				
				play = !play;
				System.out.println(play); 
				//부정연산자 !는 번갈아가면서 변경되는 토글방식 기능구현에도 사용
	}

}
