package ch01;

public class 단항연산Exam {

	public static void main(String[] args) {
		
	int x=-100;//움수 100을x에 삽입
	int result1 = +x; //음수에 +부호가 붙어서 부호 유지.
	int result2 = -x; //음수에 -부호가 붙어서 부호 변경.
	System.out.println(result1);
	System.out.println(result2);
	
	short s=100;
	//short result3=-s; 계산에 기본 타입은 int이기 때문에 오류
	int result3 = -s;
	System.out.println(result3);
	
	System.out.println("-------단항연산---------");
	int a=10;
	a++;
	++a;
	System.out.println("a="+a);
	
	int b=20;
	--b;
	b--;
	System.out.println("b="+b);
	int k;
	k=--b;
	System.out.println("b="+b);
	System.out.println("k="+k);
	

	}

}
