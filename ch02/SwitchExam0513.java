package ch02;

public class SwitchExam0513 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6 + 1);

		switch (num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		case 6:
			System.out.println("6번");
			break;
		default:
			System.out.println("프로그램을 종료합니다");
		}
		System.out.println("-----------------------------");
		int time = (int) (Math.random() * 6 + 6); // 6~12��
		System.out.println("현재시간은 " + time + "입니다");

		switch (time) {
		case 6: {
			System.out.println("a");
		}
		case 7: {
			System.out.println("b");
		}
		case 8: {
			System.out.println("c");
		}
		case 9: {
			System.out.println("d");
		}
		case 10: {
			System.out.println("e");
		}
		default:
			System.out.println("f");
		}
	}
}