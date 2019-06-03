package test0531;

import java.util.Scanner;
//import java.lang.*;

public class Study_Scanner {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		
		String name;
		int Math;
		
		System.out.print("이름?");
		name=sc.next();//nextLine()은 한줄을 다 읽어옴
		
		System.out.print("수학?");
		Math=sc.nextInt();
		
		sc.close(); // 코드 뒤쪽에 sc.close();라는 명령문을 쓰지 않으면 sc에 경고가 뜸. 별 상관은 없다고 함.
		            //Scanner가 쓸데없이 계속 입력을 받는 것을 방지하기 위함.
		
		System.out.println(name+":"+Math);
		

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
		
		
		
		
	}

}
