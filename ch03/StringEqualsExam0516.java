package ch03;

public class StringEqualsExam0516 {

	public static void main(String[] args) {
		String StrVar1 = "돌고래";
		String StrVar2 = "돌고래";
		String StrVar3 = "돌고래";
		String StrVar4 = "돌고래";

		if (StrVar1 == StrVar2) {
			System.out.println("StVal과 StrVar2는 참조가 같습니다.");
		} else {
			System.out.println("StrVal1과 StrVar2는 참조가 다릅니다.");
		}
		if (StrVar1.equals(StrVar2)) {
			System.out.println("StVal과 StrVar2는 문자열이 같습니다.");
		} else {
			System.out.println("StrVal1과 StrVar2는 문자열이 다릅니다.");
		}
		if (StrVar1.equals(StrVar3)) {
			System.out.println("StVal과 StrVar3는 문자열이 같습니다.");
		} else {
			System.out.println("StrVal1과 StrVar3는 문자열이 다릅니다.");
		}
		if (StrVar1.equals(StrVar4)) {
			System.out.println("StVal과 StrVar4는 문자열이 같습니다.");
		} else {
			System.out.println("StrVal1과 StrVar4는 문자열이 다릅니다.");

		}
	}
}