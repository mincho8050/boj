package Test0531;

import java.util.*;


public class Test11718 {

	public static void main(String[] args) {
		// 입력 받은 대로 출력하는 프로그램을 작성하시오.
		/*
		 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 
		 * 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
		 * 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 
		 * 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
		 *  Hello
			Baekjoon
			Online Judge
		 */
		
		Scanner input=new Scanner(System.in);
		String in="";
		while(input.hasNextLine()){
			in=input.nextLine();
			System.out.println(in);
		}

		input.close();
		
		/*
		 * Scanner  
		 * > 키보드로 인해 입력된 문자열을 받아서 처리해주는 클래스
		 * 
		 * Scanner 선언
		 * > import java.util.*; 
		 * > 이건 util 안에 있는 모든 클래스를 선언.
		 * 
		 * Scanner 생성
		 * > Scanner input=new Scanner(System.in); 
		 * >키보드로 문자열을 입력받기 위해 인자를 System.in으로 설정
		 * 
		 * Scanner 확인
		 * > while(input.hasNextLine())
		 * > 행이 있다면 true, 없다면 false 리턴
		 * 
		 * Scanner로 받은 데이터 저장하지
		 * > in=input.nextLine(); 
		 * > input.nextLine(); 문자열 반환 함수,엔터만나면 종료
		 * 
		 * Scanner 종료
		 * > input.close();
		 * > 종료를 해주지 않으면 메모리 낭비
		 * 
		 */
		
		
		/*
		 * boolean형.
		 * 
		 * hasNextInt() 
		 * > 입력값이 int형이 아닐 경우 false 리턴
		 * 
		 * hasNextLine()
		 * > 행이 있다면 true, 없다면 false 리턴
		 * 
		 * hasNext()
		 * > 토큰이 있다면 true, 없다면 false 리턴
		 */
		
		/*
		 * Scanner 반환 함수
		 * 
		 * next()
		 * > 문자열 반환함수. 공백(space)를 만나면 종료
		 * 
		 * nextLine()
		 * > 문자열 반환함수. 개행(Enter)를 만나면 종료된다.
		 * > next()와 달리 띄어쓰기를 할 수 있다. 
		 * 
		 * nextInt()
		 * > int 타입 반환 함수
		 * 
		 * nextDouble()
		 * > double 타입 반환 함수
		 * 
		 * nextFloat()
		 * > float 타입 반환 함수
		 */
		
		
		
		

	}//main

}//class
