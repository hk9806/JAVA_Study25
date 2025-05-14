package ch02;

import java.util.Scanner;

public class Switch2Exam0513 {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
		case"부장":
			System.out.println(position+"성과급은_1000만원");
			break;
		case"과장":
			System.out.println(position+"성과급은_1500만원");
			break;
		case"대리":
			System.out.println(position+"성과급은_2000만원");
			break;
			default:
				System.out.println("������_X");
				break;
				
		}
		System.out.println("---------------------------");
		System.out.println("당신의 주민번호를 입력하세요('-'포함.)");
		Scanner in = new Scanner(System.in);//Ű����� �Է¹��� ��ü
		
		String regNo = in.nextLine();//��Ʈ�� Ÿ���� ��
		char gender = regNo.charAt(7);//8��° ���� ����
	
		
		switch(gender) {
		case'1':case'3':case'5':case'7':
			System.out.println("당신은 남자입니다");
			break;
		case'2':case'4':case'6':case'8':
			System.out.println("당신은 여자입니다");
			break;
			default:
				System.out.println("성별을 식별할 수 없습니다.");
				System.out.println("프로그램을 종료합니다.");
		}
	}

}
