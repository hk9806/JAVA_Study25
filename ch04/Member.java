package ch04;

import java.util.Scanner;

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

	public void memberLogin() {
		
		System.out.println("로그인 항목");

	}// member Login

	public void memberUpdate() {

		System.out.println("회원수정 항목");
		System.out.println("수정할 회원 번호를 입력하세요");

	}// memberUpdate

	public void memberDelete() {
		System.out.println("회원탈퇴 항목");
	}// member Delete
}