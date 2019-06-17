package test0617;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test10817 {

	public static void main(String[] args) throws IOException{
		/*
		 * 세 정수 A, B, C가 주어진다. 
		 * 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. 
		 * (1 ≤ A, B, C ≤ 100) 
		 * 
		 * 한 줄에 여러개의 입력을 받는 경우 StringTokenizer
		 */

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(in.readLine());
		int num1=Integer.parseInt(st.nextToken());
		int num2=Integer.parseInt(st.nextToken());
		int num3=Integer.parseInt(st.nextToken());
		
		int[] num={num1,num2,num3};
		
		Arrays.sort(num);
		
		System.out.println(num[1]);

		
	}//main

}//class
