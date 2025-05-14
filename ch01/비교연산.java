package ch01;

public class 비교연산 {

	public static void main(String[] args) {
	int num =10;
	int num1=20;
	boolean re=(num==num1);
	boolean re1=(num!=num1);
	boolean re2=(num<=num1);
	
	System.out.println(re);
	System.out.println(re1);
	System.out.println(re2);
	
	char ch1='a'; //97
	char ch2='b'; //98
	boolean res=(ch1<ch2); //true
	
	System.out.println("res= "+res);

	int v2=1;
	double v3=1.0;
	System.out.println(v2==v3);
	
	double v4=0.1;
	float v5=0.1F;
	System.out.println(v4==v5);
	System.out.println((float)v4==v5);
	System.out.println((int)(v4*10)==(int)(v5*10));
	}

}
