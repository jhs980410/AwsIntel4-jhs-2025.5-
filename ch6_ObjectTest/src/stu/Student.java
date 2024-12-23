package stu;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student() {

	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		int total;
		total = kor + eng + math;
		return total;
	}

	double getAverage() {
		double average;
		average = (int) (((kor + eng + math) / 3.0) * 100 + 0.5) / 100.0;

		return average;
	}

	void studentInformation() {
		System.out.println("이름: " + name + " / 반:" + ban + " / 번호: " + no);
		System.out.println("국어: " + kor + " / 영어:" + eng + " / 수학: " + math);
		System.out.println("총점: " + getTotal());
		System.out.println("평균: " + getAverage());
		
	}

}
