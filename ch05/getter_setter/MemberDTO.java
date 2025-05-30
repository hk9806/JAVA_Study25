package ch05.getter_setter;

public class MemberDTO {
	// 필드
	private String name;
	private String age;
	private boolean admin;

	public String getName() {
		return name + "님";
	}

	public void setName(String name) {
		System.out.println("이름엔 숫자가 불가능합니다");
		this.name = name;
	}

	public String getAge() {
		return age + "세";
	}

	public void setAge(String age) {
		System.out.println("나이는 19세 이상만 가능합니다");
		this.age = age;
	}

	public String isAdmin() {
		String adminString = null;
		if (admin == true) {
			adminString = "관리자";

		}
		return adminString;
	}

	public void setAdmin(boolean admin) {
		System.out.println("관리자일 경우 true를 입력해주세요");
		this.admin = admin;
	}
}
