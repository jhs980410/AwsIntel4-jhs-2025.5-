package four64;

public class StringBasic {

	public static void main(String[] args) {
		
		String name = "정현식";
		name = name.concat("은 매우졸림"); // concat
		
		String name2 = name; 
		System.out.println(name);
		System.out.println(name.equals("정현식은 매우졸림"));
		System.out.println(name.equals("정현식은 매우졸림2")); // eqluas()
		
		System.out.println(name2.equalsIgnoreCase("정현식은 매우졸림.")); // 문자열 대소문자 상관없이 비교 , 한글이라불가 / 
		int num = name2.indexOf('식'); // 문자열 인덱스의 위치를 알려줌 // 
		System.out.println(num);
		
		String name3 = "풀스택 자바 AWS ";
		name3 = name3.replace("자", "파");
		System.out.println(name3);  //  원하는 글자를 , 새로운글자로  /
		String name4 = "풀풀풀택택택택스스스스 자자자자자바바바바바";
		name4 = name4.replace("스","택");
		System.out.println(name4);
		
		
		boolean f = true;
		Boolean f2 = true;
		

		
	}

}
