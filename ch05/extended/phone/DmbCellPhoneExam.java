package ch05.extended.phone;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		DmbCellPhone dmbPhone = new DmbCellPhone("디엠비폰", "빨강", 10);
		// 생성자를 초기값으로 전달(모델명, 색상, 채널번호)
		System.out.println("모델: " + dmbPhone.model);
		System.out.println("색상: " + dmbPhone.color);
		// 부모로부터 받은 필드를 활용하여 출력
		System.out.println("채널번호: " + dmbPhone.channel);
		System.out.println("-----------------");
		//전화에 대한 부모 메소드 활용
		
		dmbPhone.powerOn(); //전원을 켭니다
		dmbPhone.bell(); //전화벨이 울립니다
		dmbPhone.sendVoice("여보세요");
		dmbPhone.receiveVoice("안녕하세요---입니다");
		dmbPhone.sendVoice("반갑습니다");
		dmbPhone.receiveVoice("테스트 종료");
		dmbPhone.hangup(); //전화종료
		System.out.println("--------------------");
		
		//dmb에 대한 자식 메소드 활용
		dmbPhone.turnOnDmb();//dmb전원
		dmbPhone.changeChannelDMB(12);//채널변경
		dmbPhone.turnOffDmb();//dmb전원 off
	}

}
