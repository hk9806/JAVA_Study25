package ch04;

import java.util.Scanner;

public class CalculaterExam0522 {

	public static void main(String[] args) {
	Calculator myCalc = new Calculator();
		
	myCalc.poweron();

		int result1= myCalc.plus(10,20);
		System.out.println("10+20= "+result1);
		
		int x = 40;
		int y = 20;
		int result2= myCalc.minus(x, y);
		System.out.println(x+"-"+y+"="+result2);
		
		Scanner in =new Scanner(System.in);
		
		int a= in.nextInt()	;
		int b =in.nextInt();
		int result3= myCalc.multuply(a, b);
		System.out.println(a+"x"+b+"="+result3);
		
		myCalc.poweroff();
	}

}
