package ch04.Member;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import ch04.marioKart.DTO.MemberDTO;

public class Member {
	// 회원용 객체로 main()메서드는 exam에서 진행.
	// 클래스의 기본속성은 3가지(필드, 생성자, 메서드)

	// 필드: 객체가 가지고 있어야 할 값(변수)
	// ex)회원번호, id, 성명, pw, 주소, 번호

	public int num;
	public String id;
	public String pw;

	// 생성자: Exam클래스에서 main메서드에서 new로 호출할떄 동작
	public Member() {
		// 기본 생성자: 클래스명과 같은 메서드
		// Member member = newMember();

	}

	// 메서드 : Member클래스에서 행해지는 동작 CRUD
	public Member memberAdd(Scanner input) {
		Member member = new Member();// 리턴용 객체
		System.out.println("회원가입 항목");
		System.out.println("회원번호를 입력하세요");
		System.out.print(">>");
		member.num = input.nextInt();

		System.out.println("회원 id를 입력하세요");
		System.out.print(">>");
		member.id = input.next();

		System.out.println("회원 암호를 입력하세요");
		System.out.print(">>");
		member.pw = input.next();

		return member;

	}// member Add

	public void memberAllList(Member[] members) {
		System.out.println("전체회원 조회 항목");
		for (int i = 0; i < members.length; i++) {
			System.out.print("회원번호 :" + members[i].num);
			System.out.print("|회원id :" + members[i].id);
			System.out.println("|회원pw :" + members[i].pw);
			System.out.println("-----------------------");

		}
	}// memberAll List

	public void memberLogin(Scanner input,Member[] members) {
		
		System.out.println("로그인 항목");
		System.out.print("id를 입력하세요: ");
		String id = input.next();
		
		System.out.print("pw를 입력하세요: ");
		String pw = input.next();
		
		Member loginmember = new Member();
		
		loginmember.id = id;
		loginmember.pw = pw;
		
		for (int i =0;i<members.length;i++) {
			if (members[i] != null && members[i].id.equals(loginmember.id)&&
					members[i].pw.equals(loginmember.pw)) {
				System.out.println("로그인 성공");
				
			}else {
				System.out.println("로그인 실패 id/pw를 확인하세요");
			}
		}//for
		

	}// member Login

	public void memberUpdate(Scanner input,Member[] members) {

		System.out.println("회원수정 항목");
		System.out.print("회원 번호를 입력하세요: ");
		int num = input.nextInt();
		
		System.out.print("id를 입력하세요: ");
		String id = input.next();
		
		
		Member updatemember =new Member();
		
		updatemember.num = num;
		updatemember.id = id;
		
		for (int i = 0; i < members.length; i++) {
			if(members[i] !=null&&members[i].num==updatemember.num&&
					members[i].id.equals(members[i].id)) {
				
				System.out.println("수정할 pw를 입력하세요: ");
			members[i].pw = input.next();
			}
			
		}
		
		
	}// memberUpdate

	public void memberDelete(Scanner input,Member[] members) {
		System.out.println("회원탈퇴 항목");
		System.out.println("삭제할 회원번호를 입력하세요: ");
		int num = input.nextInt();
		
		// 키보드로 입력 완료->빈 객체 생성 후 삽입
	
		Member deleteMember = new Member();
		deleteMember.num = num;
		for(int i =0;i<members.length;i++) {
			if(members[i] != null && members[i].num==(deleteMember.num)) {
				members[i] =null;
				System.out.println("삭제되었습니다.");
			}
		}
		
	}// member Delete
}