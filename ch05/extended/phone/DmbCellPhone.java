package ch05.extended.phone;

public class DmbCellPhone extends CellPhone {// 자식 라이브러리 클래스
	int channel;// 자식 필드 추가 (dmb폰은 방송을 볼 수 있는 기능이 추가)

	// 생성자
	public DmbCellPhone(String model, String color, int channel) {
		super();//부모 기본 생성자 호출
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드-> 자식 클래스 추가 된 기능
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다");
	}//DMB방송 시작
	void changeChannelDMB(int channel) {
		this.channel = channel;	//채널 번호를 입력받아 채널 변경진행
		System.out.println("채널을"+channel+"번으로 변경합니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 중지합니다.");
	}
}
