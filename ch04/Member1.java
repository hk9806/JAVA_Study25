package ch04;

import java.util.Scanner;

public class Member1 {//회원에 대한  CRUD
	//필드 ->멤버 변수
	
	String id;
	String pw;
	String nickName;
	String email;
	
	//생성자-> new로 객체 생성시 사용(생략시 기본 생성자가 자동으로 생성)
	
	//Member1 member = new Member1();
	

	//메서드->동작 (CRUD)
	public Member1 register(Scanner input) {
		//새로운 Member1 객체를 생성하여 키보드로 넣은 필드값을 삽입 후 객체로 리턴
		
		Member1 newMember = new Member1();
		System.out.print("아이디를 입력하세요: ");
		newMember.id = input.next();
		
		System.out.print("암호를 입력하세요: ");
		newMember.pw = input.next();
		
		System.out.println("닉네임을 입력하세요");
		newMember.nickName = input.next();
		
		System.out.println("이메일을 입력하세요");
		newMember.email = input.next();
		
		return newMember;
		
	}//register
	
	public Member1 login(Scanner input,Member1[] members) {
		 //		매개값		키보드입력,			회원배열
		System.out.println("로그인을 시작합니다");
		
		Member1 loginMember = new Member1(); //키보드로 입력한 객체 생성
		
		System.out.print("아이디를 입력하세요: ");
		loginMember.id=input.next();//키보드로 입력받은 id를 새로만든 객체에 입력
		
		System.out.print("비밀번호를 입력하세요: ");
		loginMember.pw = input.next();//키보드로 입력받은 pw를 새로만든 객체에 입력
		
		
		//배열에 있는 객체와 새로만든 객체 비교 시작
		for(int i=0; i<members.length;i++) {//배열에 빈칸인지 구분
			if(members[i]!=null) {
			if(members[i].id.equals(loginMember.id)&&members[i].pw.equals(loginMember.pw)){
			loginMember = members[i];
			}//id pw 인증 if문
			}else {
				 System.out.println("회원정보가 없습니다");
				 System.out.println("id/pw를 확인해주세요");
				 break;
			}//if
		}//for
		 return loginMember;
		
	}
	
	public void modify() {
		System.out.println("회원정보 수정을 시작합니다.");
	}
	
	public void delete() {
		System.out.println("회원 탈퇴를 시작합니다.");
	}
	
	public void menu(Scanner input, Member1[] members) {
		//매개값 스케너 멤버배열
		System.out.println("---회원 전용 메뉴입니다---");
		
		boolean run =true;
		while (run) {
			System.out.println("1.가입|2.로그인|3.수정|4.탈퇴|0.종료");
			System.out.print(">>");
			int select = input.nextInt();
			switch(select) {
			case 1:
				System.out.println("회원가입을 진행합니다.");
				//키보드로 입력받을 필드 완성후 객체로 받음
				Member1 newMember = register(input);
				//멤버 배열 null을 찾아 삽입
				for(int i=0;i<members.length;i++) {
					if(members[i] ==null) {
						members[i] = newMember;
						System.out.println(newMember.nickName+"객체가 배열에 저장됨.");
						break;
					}//if
				}//for
				break;
				
			case 2: 
				System.out.println("로그인을 진행합니다.");
				Member1 loginMember = login(input,members);
				//호출시 스케너와 배열 객체 전달
				System.out.println(loginMember.nickName+"님 환영합니다.");
				break;
				
			case 3:
				System.out.println("회원수정을 진행합니다.");
				modify();
				break;
				
			case 4:
				System.out.println("탈퇴를 진행합니다.");
				delete();
				break;
			case 0:
				System.out.println("회원전용 메뉴를 종료 합니다.");
				run =false;
				break;
				default:
					System.out.println("0~4사이 값만 입력하세요");
			}//switch
		}//while
	}//menu
	
}//class
