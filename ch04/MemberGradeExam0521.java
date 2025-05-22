package ch04;

import java.util.Scanner;

public class MemberGradeExam0521 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] name = null;
		String[] id = null;
		String[] pw = null;
		Grade[]  grade = null;
		
		System.out.println("등록하실 회원수를 입력하세요");
		System.out.print(">>");
		int count = input.nextInt();
		name = new String[count];
		id = new String[count];
		pw = new String[count];
		grade = new Grade[count];
		
		System.out.println("회원가입 페이지입니다.");
			for(int i= 0;i<name.length;i++) {
				System.out.println("이름: ");
				name[i] = input.next();
				System.out.println("id: ");
				id[i]=input.next();
				System.out.println("pw: ");
				pw[i]=input.next();
				
				System.out.println("등급을 선택하세요");
				System.out.println("1.GUEST");
				System.out.println("2.UESR");
				System.out.println("3.VIP");
				System.out.println("4.ADMIN");
				System.out.print(">>");
				String grades=input.next();
				
				switch(grades) {
				case "1":
					grade[i] = Grade.GUEST;
				break;
				
				case "2":
					grade[i] = Grade.USER;
				break;
				
				case "3":
					grade[i] = Grade.VIP;
				break;
				
				case "4":
					grade[i] = Grade.MANAGE;
				break;
				
				default:
					System.out.println("잘못입력했습니다.");
				break;
				}//switch
				
			}//for
			System.out.println("현재 가입 내용입니다");
			for(int i =0;i<name.length;i++){
				System.out.println("이름: "+name[i]);
				System.out.println("id: "+id[i]+"|pw: "+pw[i]+"|회원 등급: "+grade[i]);
		
			}
			
	}

}
