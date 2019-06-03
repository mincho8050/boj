package test0603;

import java.util.Scanner;

public class Test2742 {

	public static void main(String[] args) {
		/*
		 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
		 * 입력 5
		 *  5
			4
			3
			2
			1
		 */

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
		if(num<=100000){
			for(int a=0;a<num;a++){
				System.out.println(num-a);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}//

}//
