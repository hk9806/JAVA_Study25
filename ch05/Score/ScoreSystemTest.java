package ch05.Score;

import java.util.Scanner;

import ch05.Score.DTO.ScoresDTO;
import ch05.Score.DTO.StAccountDTO;
import ch05.Score.DTO.totalDTO;
import ch05.Score.SV.studentSV;

public class ScoreSystemTest {

	public static Scanner scanner = new Scanner(System.in);

	public static StAccountDTO[] staccount;
	public static ScoresDTO[] scores;
	public static totalDTO totalscores = new totalDTO();

	public static void main(String[] args) {
		System.out.println("------MBC성적 관리TEST-----");
		System.out.print("학생 수를 입력하세요: ");
		int count = scanner.nextInt();
		staccount = new StAccountDTO[count];
		scores = new ScoresDTO[count];
		boolean run = true;
		while (run) {

			System.out.println("메뉴를 선택하세요");
			System.out.println("1.학생관리|2.성적관리|3.통계|0.종료");
			String select = scanner.next();
			switch (select) {
			case "1":
				studentSV studentsv = new studentSV();
				studentsv.menu(scanner, staccount);
				break;
			case "2":
				break;
			case "3":
				break;
			case "0":
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			default:
				System.out.println("0~3사이 숫자만 입력해주세요");
				break;
			}

		}

	}

}