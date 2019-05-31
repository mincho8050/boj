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
		
		
		
	}

}
