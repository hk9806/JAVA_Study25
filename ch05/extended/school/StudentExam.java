package ch05.extended.school;

public class StudentExam {

	public static void main(String[] args) {

		Student stu1 = new Student("aaa", 180, 80, 50, "12345", 3, 4);
		Student stu2 = new Student("bbb", 210, 90, 45, "12332", 2, 5);

		stu1.show();
		stu2.show();
	}

}
