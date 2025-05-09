package ch01;

public class LocalVairableExam {

	public static void main(String[] args) {
		
		int v1=15;
		int v2=0;
		if (v1>10) { 
		//if함수 조건블록 내에서 변수선언 가능x 변수선언 작업은 if 함수 작업 전 상단에서 작업
			v2=v1+10;
		}
		int v3 = v1+v2+5;
		
		System.out.println("v1의 값: "+v1);
		System.out.println("v1의 값: "+v2);
		System.out.println("v1의 값: "+v3);
	
	}

}
