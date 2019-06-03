package test0603;

import java.util.Scanner;

public class Test2438 {

	public static void main(String[] args) {
		/*
		 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		 * 
		 * 입력 5
		 * 출력
		 *  *
			**
			***
			****
			*****
		 */

		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num>=1&&num<=100){
			
			for(int a=1;a<=num;a++){
				for(int b=1;b<=a;b++){
					System.out.print("*");
				}
				System.out.println();
			}
			
			
		}
		
		
		
		
		
	}//

}//
