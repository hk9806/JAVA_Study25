package ch04.marioKart.Service;

import java.util.Scanner;

import ch04.marioKart.DTO.MemberDTO;

public class MemberSV {
//회원 관리용 클래스
	// 회원 관리에 해당하는 모든 서비스 제공
	// 필드

	// MemberDTO memberDTO;//사용x->MemberDTO();

	// 생성자-> new 객체 생성(생략시 기본 생성자 자동생성)

	// 메서드
	public MemberDTO menu(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		System.out.println("---회원관리 메뉴---");
		boolean run = true;
		while (run) {
			System.out.println("1.가입|2.로그인|3.수정|4.삭제|0.메인메뉴");
			System.out.print(">>");
			String select = input.next();
			switch (select) {
			case "1":
				System.out.println("계정을 생성합니다.");
				create(input, memberDTOs);
				break;

			case "2":
				System.out.println("로그인을 진행합니다.");
				loginState = login(input, memberDTOs, loginState);
				break;

			case "3":
				System.out.println("계정을 수정합니다.");
				modify(input, memberDTOs, loginState);
				break;

			case "4":
				System.out.println("계정을 삭제합니다.");
				delete(input, memberDTOs, loginState);
				break;

			case "0":
				System.out.println("메인메뉴로 돌아갑니다.");
				run = false;
				break;

			case "99":
				System.out.println("관리자 페이지입니다");
			}// switch
		} // while
		return loginState;
	}

	public void delete(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 회원 삭제				
		System.out.println("삭제할id를 입력하세요: ");
		String id = input.next();
		
		// 키보드로 입력 완료->빈 객체 생성 후 삽입
	
		MemberDTO deleteMember = new MemberDTO();
		deleteMember.id = id;
		for(int i =0;i<memberDTOs.length;i++) {
			if(memberDTOs[i] != null && memberDTOs[i].id.equals(deleteMember.id)) {
				memberDTOs[i] =null;
				System.out.println("삭제되었습니다.");
			}
		}
		
	}

	public void modify(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 수정
		System.out.print("id를 입력하세요: ");
		String id = input.next();

		System.out.print("pw를 입력하세요: ");
		String pw = input.next();

		MemberDTO modifyMember = new MemberDTO();
		modifyMember.id = id;
		modifyMember.pw = pw;// 키보드로 입력받은 객체

		if (loginState.id.equals(modifyMember.id)// 키보드로 입력받은 값과 기존 값 비교(id)
				&& loginState.pw.equals(modifyMember.pw)) {// 키보드로 입력받은 값과 기존 값 비교(pw)

			System.out.println("변경할 pw를 입력하세요: ");
			loginState.pw = input.next();
			

		} // if
	}

	public MemberDTO login(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		// 로그인
		System.out.println("id를 입력하세요: ");
		String id = input.next();

		System.out.println("pw를 입력하세요: ");
		String pw = input.next();
		// 키보드로 입력 완료->빈 객체 생성 후 삽입

		MemberDTO loginMember = new MemberDTO();

		loginMember.id = id;
		loginMember.pw = pw;

		// 배열에 있는 객체와 키보드로 입력한 객체 비교
		for (int i = 0; i < memberDTOs.length; i++) {
			if (memberDTOs[i] != null && memberDTOs[i].id.equals(loginMember.id)
					&& memberDTOs[i].pw.equals(loginMember.pw)) {
				System.out.println("로그인 성공");
				loginState = memberDTOs[i];// 배열에 있는 정보가login상태 객체에 삽입
				System.out.println(loginState.nickName + "님 인증되었습니다");
			}else {
				System.out.println("id,pw를 다시 확인하세요");
				break;
			}
			
		} // for
		
		
		return loginState; // 로그인 성공 객체를 리턴함.
	}// login

	public void create(Scanner input, MemberDTO[] memberDTOs) {
		// 계정 생성
		System.out.println("사용할id를 입력하세요: ");
		String id = input.next();

		System.out.println("사용할pw를 입력하세요: ");
		String pw = input.next();

		System.out.println("사용할 닉네임을 입력하세요: ");
		String nickName = input.next();

		System.out.println("사용할 이메일을 입력하세요: ");
		String email = input.next();
		// 입력받은 값을 객체에 삽입

		MemberDTO memberDTO = new MemberDTO();// 빈 객체 생성

		memberDTO.id = id;
		memberDTO.pw = pw;
		memberDTO.nickName = nickName;
		memberDTO.email = email;
		// 객체 생성

		// 배열에 0 ~ null 값이면 삽입(exam)
		for (int i = 0; i < memberDTOs.length; i++) {
			if (memberDTOs[i] == null) { // null이면 값이 있음
				memberDTOs[i] = memberDTO;
				break;
			} // if
		} // for
		System.out.println(memberDTO.nickName + "님 가입을 환영합니다");
	}// create
}
