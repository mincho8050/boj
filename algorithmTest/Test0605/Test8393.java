package test0605;

import java.util.Scanner;

public class Test8393 {

	public static void main(String[] args) {
		/*
		 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		 * 1부터 n까지 합을 출력한다.
		 */

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		
		if(num>=1&&num<=10000){
			for(int a=0;a<=num;a++){
				sum+=a;
			}
		}
		
		System.out.println(sum);
		
		
		
	}//main

}//class
