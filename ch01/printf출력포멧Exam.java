package ch01;

import java.util.Scanner;

public class printfÃâ·ÂÆ÷¸äExam {

	public static void main(String[] args) {

		int a = 97;
		String s = "JAVA";
		double f = 3.14f;

		System.out.printf("%d\n", a);
		System.out.printf("%o\n", a);
		System.out.printf("%x\n", a);
		System.out.printf("%c\n", a);
		System.out.printf("%5d\n", a);
		System.out.printf("%05d\n", a);
		System.out.printf("%s\n", s);
		System.out.printf("%5s\n", s);
		System.out.printf("%-5s\n", s);
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%4.1f\n", f);
		System.out.printf("%04.1f\n", f);
		System.out.printf("%-4.1f\n", f);

	}

}
