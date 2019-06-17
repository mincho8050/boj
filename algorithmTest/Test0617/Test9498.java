package test0617;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test9498 {

	public static void main(String[] args) throws IOException {
		/*
		 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 
		 * 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 시험 점수가 주어진다. 
		 * 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 */

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int score=Integer.parseInt(in.readLine());
		
		if(score>=0&&score<=100){
			switch(score/10){
			case 10:
			case 9:System.out.println("A"); break;
			case 8:System.out.println("B"); break;
			case 7:System.out.println("C"); break;
			case 6:System.out.println("D"); break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:System.out.println("F"); break;
			}//switch
		}//if
		
		
		
		
	}//main

}//class
