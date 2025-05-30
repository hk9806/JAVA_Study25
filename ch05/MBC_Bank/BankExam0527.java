package ch05.MBC_Bank;

import java.util.Scanner;

import ch05.MBC_Bank.DTO.AccountDTO;
import ch05.MBC_Bank.SV.HanaBankSV;
import ch05.MBC_Bank.SV.NHBankSV;
import ch05.MBC_Bank.SV.WooriBankSV;

public class BankExam0527 {
	// 필드
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);

	public static AccountDTO[] hanabank = new AccountDTO[10];
	public static AccountDTO[] wooribank = new AccountDTO[10];
	public static AccountDTO[] nhbank = new AccountDTO[10];
	public static AccountDTO session = null;

	// 생성자
	static {
		AccountDTO accountDTO0 = new AccountDTO("1234", "aaa", 10000, "하나");
		hanabank[0] = accountDTO0;

		AccountDTO accountDTO1 = new AccountDTO("5678", "bbb", 30000, "우리");
		wooribank[0] = accountDTO1;

		AccountDTO accountDTO2 = new AccountDTO("9876", "ccc", 50000, "농협");
		nhbank[0] = accountDTO2;
	}

	public static void main(String[] args) {
		System.out.println("------------------------");
		System.out.println("------MBC은행계좌 관리------");
		System.out.println("------------------------");
		System.out.println("1.하나은행|2.우리은행|3.농협은행|0.종료");

		boolean run = true;
		while (run) {
			String select = inputStr.next();
			switch (select) {
			case "1":
				System.out.println("하나은행 메뉴");
				HanaBankSV hanabankservice = new HanaBankSV();
				hanabankservice.menu(inputInt, inputStr, hanabank);
				break;
			case "2":
				System.out.println("우리은행 메뉴");
				WooriBankSV wooribankservice = new WooriBankSV();
				wooribankservice.menu(inputInt, inputStr, wooribank);
				break;
			case "3":
				System.out.println("농협은행 메뉴");
				NHBankSV nhbankservice = new NHBankSV();
				nhbankservice.menu(inputInt, inputStr, nhbank);
				break;
			case "0":
				System.out.println("종료");
				run = false;
				break;
			default:
				System.out.println("0~3까지만 입력해주세요");
			}// switch
		} // while

	}// main

}// class
