package Basic;

public class Study_escapeCharacter {

	public static void main(String[] args) {
		/*
		 * 특정문자들은 백슬래시와 함께 결합하여 씌여야 한다.
		 * 
		 */
		
//		System.out.println('''); > 에러
		System.out.println('\''); // > ' 출력
//		System.out.println('\'); > 에러
		System.out.println('\\'); // > \ 출력
//		System.out.println("""); > 에러
		System.out.println("\""); // " 출력
		System.out.println("#\n#"); //  \n은 엔터.뉴라인, 개행, 줄바꾸기임.

	}

}
