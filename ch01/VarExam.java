package ch01;

public class VarExam {

	public static void main(String[] args) {
		
		int x=1;
		char y=65;
		char z='A';
		
		System.out.println("int x="+x);
		System.out.println("char y="+y);
		System.out.println("char z="+z);
		
		int x1;
		x1 = 10;
		char z1='b'; //문자로 치환
		
		System.out.println(x1);
		System.out.println(z1);
		
		int kor, mat, eng, total; //int 정수
		double avg; //double 실수
		kor = 90;
		eng = 87;
		mat = 91;
		total = kor+eng+mat;
		avg = total/3;
		
		System.out.print("국어"+kor);
		System.out.print(" 수학"+mat);
		System.out.print(" 영어"+eng);
		System.out.print(" 총점"+total);
		System.out.println(" 평균"+avg); 
		//print만 입력시 같은행에서 출력 println입력시 행 나누어 출력
		
		char firstname = '자';
		char firstName = '바';
		
		System.out.print("성 : "+firstname);
		System.out.println(", 이름 :  "+firstName); 
		//동일 한 변수이름은 사용불가 단, 대소문자 구분하여 기재시 사용 가능
		//예약어는 변수선언으로 사용불가능 (ex. class ,public 등과 같이 자바에서 사용중인 언어)
		
		
		int literal1 = 75; //10진수
		int literal2 = 075; //8진수
		int literal3 = 0x0011; //2진수
		int literal4 = 0xA; //16진수
				//literal=직접입력된 값
		
		System.out.println("10진수 : "+literal1);
		System.out.println("8진수 : "+literal2);
		System.out.println("2진수 : "+literal3);
		System.out.println("16진수 : "+literal4);

		
	}

}
