package ch01;

public class 비트반전연산자 {

	public static void main(String[] args) {
		
		int v1 =10; //int v1에 10
		int v2= ~v1; //int v2에 10 비트 반전
		int v3 =~v1+1; //int v2값에 +1
		
		System.out.println(toBinaryString(v1)+"(십진수 : "+v1+")");
		System.out.println(toBinaryString(v2)+"(십진수 : "+v2+")");
		System.out.println(toBinaryString(v3)+"(십진수 : "+v3+")");
		
		int v4=-10;
		int v5=~v4;
		int v6=~v4+1;
		
		System.out.println(toBinaryString(v4)+"(십진수 : "+v4+")");
		System.out.println(toBinaryString(v4)+"(십진수 : "+v5+")");
		System.out.println(toBinaryString(v4)+"(십진수 : "+v6+")");
		
	}

	private static String toBinaryString(int value) {
		//9번줄에 있는 v1값을 입력받아 2진 32개의 숫자로 출력하기 위한 메소드
		String str = Integer.toBinaryString(value); //정수를 2진으로 반환 메소드
		while (str.length()<32) { //str에 글자 길이가 32이하 인지를 반복
			str = "0" + str; //32글자 이하일때 글자앞에 0을 붙힘
		}
		return str; //결과값 반환
	}

	
	}


