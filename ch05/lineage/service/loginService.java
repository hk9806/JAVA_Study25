package ch05.lineage.service;

import java.util.Scanner;

import ch05.lineage.DTO.Account;

public class loginService {
	// 로그인 관련 부메뉴

	public static Account menu(Scanner scanner, Account[] accounts, Account loginAccount) {
		System.out.println("1.로그인|2.회원가입|3.회원수정|0.메인메뉴");
		System.out.print(">>");

		String select = scanner.next();
		switch (select) {
		case "1":
			System.out.println("로그인을 시작합니다.");
			System.out.print("id: ");
			String id = scanner.next();

			System.out.print("pw: ");
			String pw = scanner.next();
			Account account = new Account();

			account.setId(id);
			account.setPw(pw);

			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null) {
					if (accounts[i].getId().equals(account.getId())) {
						System.out.println("해당하는 id가 있습니다");
						if (accounts[i].getPw().equals(account.getPw())) {
							System.out.println("해당하는 pw가 있습니다.");
							loginAccount = accounts[i];
							System.out.println("로그인 성공");
							break;
						} else {
							System.out.println("해당하는 pw가 없습니다.");
						}
					} else {
						System.out.println("해당하는 id가 없습니다.");
					}
				} else {
					System.out.println("해당하는 정보가 없습니다");
					break;
				} // 빈객체 비교
			} // for
			break;
		case "2":
			memberAdd(scanner, accounts, loginAccount);
			break;
		} // switch
		return loginAccount;
	}// menu method

	private static void memberAdd(Scanner scanner, Account[] accounts, Account loginAccount) {
		Account account = new Account();
		System.out.println("회원가입 메뉴로 진입합니다.");
		System.out.print("사용할 id를 입력하세요: ");
		String id = scanner.next();

		System.out.print("사용할 pw를 입력하세요: ");
		String pw = scanner.next();

		System.out.print("사용할 닉네임을 입력하세요: ");
		String nickName = scanner.next();

		account.setId(id);
		account.setPw(pw);
		account.setNickName(nickName);

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				break;
			}
		}
		System.out.println(account.getNickName() + "님 환영합니다.");

	}

}// class