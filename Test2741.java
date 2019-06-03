package test0603;

import java.util.Scanner;

public class Test2741 {

	public static void main(String[] args) {
		/*
		 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
		 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
		 * 
		 * 입력 5
		 * 출력
		 *  1
			2
			3
			4
			5
		 */

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num<=100000){
		for(int a=num-1;a>-1;a--){
			System.out.println(num-a);
		}
		}
		
		
		
	}//

}//
