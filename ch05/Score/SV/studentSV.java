package ch05.Score.SV;

import java.util.Scanner;

import ch05.Score.DTO.StAccountDTO;

public class studentSV {
	// 필드

	// 생성자

	public void menu(Scanner scanner, StAccountDTO[] staccount) {

		boolean run = true;
		while (run) {
			System.out.println("----학생관리 메뉴입니다----");
			System.out.println("1.등록|2.보기|3.수정|4.삭제|0.종료");
			System.out.print(">>");
			String select = scanner.next();
			switch (select) {
			case "1":
				creat(scanner, staccount);
				break;

			case "2":
				read(scanner, staccount);
				break;

			case "3":
				modify(scanner, staccount);
				break;

			case "4":
				delete(scanner, staccount);
				break;

			case "0":
				System.out.println("메인메뉴로 돌아갑니다");
				run = false;
				break;
			default:
				System.out.println("0~4까지만 입력하세요");
			}
		}

	}

	private void delete(Scanner scanner, StAccountDTO[] staccount) {
		System.out.println("삭제할 학생 번호를 입력하세요");
		StAccountDTO delaccount = new StAccountDTO();
		delaccount.num = scanner.nextInt();
		for (int i = 0; i < staccount.length; i++) {
			if (staccount[i] != null && staccount[i].num == delaccount.num) {
				staccount[i] = null;
				System.out.println("삭제 완료되었습니다");
			}
		}

	}

	private void modify(Scanner scanner, StAccountDTO[] staccount) {
		System.out.println("학생 번호를 입력하세요");
		StAccountDTO modaccount = new StAccountDTO();
		modaccount.num = scanner.nextInt();
		for (int i = 0; i < staccount.length; i++) {
			if (staccount[i] != null&&staccount[i].num==modaccount.num) {
				System.out.println("수정할 이름을 이름을 입력하세요");
				modaccount.name = scanner.next();
				System.out.println("수정할 학년을 입력하세요");
				modaccount.grade = scanner.nextInt();

				staccount[i] = modaccount;

			}
		}

	}

	private void read(Scanner scanner, StAccountDTO[] staccount) {
		System.out.println("전체학생 조회 항목");
		for (int i = 0; i < staccount.length; i++) {
			if(staccount[i]!=null) {
			System.out.print("학생번호 :" + staccount[i].num);
			System.out.print(" 학년 :" + staccount[i].grade);
			System.out.println(" 이름 :" + staccount[i].name);
			break;
			}else {
				System.out.println("조회되는 학생이 없습니다");
			}
				
		}

	}

	private void creat(Scanner scanner, StAccountDTO[] staccount) {
		System.out.println("학생등록을 시작합니다.");
		System.out.println("학번을 입력해주세요");
		StAccountDTO stadd = new StAccountDTO();
		stadd.num = scanner.nextInt();

		System.out.println("학년을 입력해주세요");
		stadd.grade = scanner.nextInt();

		System.out.println("학생 이름을 입력해주세요");
		stadd.name = scanner.next();

		for (int i = 0; i < staccount.length; i++) {
			if (staccount[i] == null) {
				staccount[i] = stadd;
				break;
			}
		}
		System.out.println(stadd.name + "학생 등록완료");
		return;
	}
}
