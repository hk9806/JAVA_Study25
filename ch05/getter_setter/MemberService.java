package ch05.getter_setter;

import java.util.Scanner;

public class MemberService {
	// 부메뉴 DTO에 접근하여 CRUD 작성
	MemberDTO memberDTO = new MemberDTO();

	// 필드
	public void menu() {
//	memberDTO.name ="aaa"; | getter_setter를 사용하지 않는 기존방식
//	memberDTO.age = "23";
//	memberDTO.admin = true;

	}// menu 메서드 종료

	// 생성자

	// 메소드
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = input.next();
		
		System.out.print("나이를 입력하세요: ");
		String age = input.next();
		
		System.out.print("관리자 여부를 판단해주세요: ");
		boolean admin = input.nextBoolean();
		
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setName(name);
		memberDTO.setAge(age);
		memberDTO.setAdmin(admin);
		
		System.out.println("객체에 저장된 이름: "+memberDTO.getName());
		System.out.println("객체에 저장된 이름: "+memberDTO.getAge());
		System.out.println("객체에 저장된 이름: "+memberDTO.isAdmin());
	}
}
