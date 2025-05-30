package ch05.lineage.service;

import java.util.Scanner;

import ch05.lineage.DTO.Account;
import ch05.lineage.DTO.ElfDTO;
import ch05.lineage.DTO.KnightDTO;

public class CharacterService {
	public static void menu(Scanner scanner,
			Account loginAccount, KnightDTO knightDTO,ElfDTO elfDTO) {
		System.out.println("1.기사|2.요정|0.메인메뉴");
		System.out.println(">>");
		String select = scanner.next();
		switch(select)	{
		case "1":
			System.out.println("기사를 선택하셨습니다.");
			loginAccount.setKnightDTO(knightDTO);
			System.out.println(loginAccount.getNickName()+"님");
			break;
		case"2":
			System.out.println("요정을 선택하셨습니다.");
			loginAccount.setElfDTO(elfDTO);
			System.out.println(loginAccount.getNickName()+"님");
		case"0":
			System.out.println("종료");
			break;
			default:
				System.out.println("0~2사이 값만 입력하세요");
		}
	}
}
