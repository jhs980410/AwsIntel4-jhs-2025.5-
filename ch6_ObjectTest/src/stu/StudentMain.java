package stu;

public class StudentMain {
	public static void main(String[] args) {
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;

		name = "홍길동";
		ban = 2;
		no = 3;
		kor = 60;
		eng = 13;
		math = 43;

		Student student = new Student(name, ban, no, kor, eng, math);
		student.studentInformation();

	}
}
