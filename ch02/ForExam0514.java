package ch02;

import java.util.Scanner;

public class ForExam0514 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10 ; i++) {
			System.out.println("1~10까지 출력: "+i);
		}
System.out.println("--------------");
		for(int m=2; m<=20 ; m=m+2) {
			System.out.println("1~20까지 짝수만 출력:"+m);
		}
		System.out.println("-----------------");
		
		Scanner bbq = new Scanner(System.in);
		System.out.println("최소값을 입력하세요");
		System.out.print(">");
		
		int min = bbq.nextInt();
		System.out.println("최대값을 입력하세요");
		System.out.print(">");
		
		int max = bbq.nextInt();
		System.out.println("증가값을 입력하세요");
		System.out.print(">");
		
		int add = bbq.nextInt();
		System.out.println(min+"부터"+max+"까지의"+add+"만큼의 증가값 순차출력");
		
		int total = 0;
		
		for (total = min; total<=max;total+=add) {
			System.out.println("Test: "+total);
		}
		
		
			}
			
				
				
		
	}


