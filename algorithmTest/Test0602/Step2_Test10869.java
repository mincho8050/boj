package Test0602;

import java.util.Scanner;

public class Step2_Test10869 {

	public static void main(String[] args) {
		/*
		 * 두 자연수 A와 B가 주어진다. 
		 * 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		 * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
		 * 
		 * 예제
		 * 7 3
		 * 출력값
		 *  10
			4
			21
			2
			1
		 */

		
		
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a>=1&&b<=10000){
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		}
		
		sc.close();
		
		
		
		
		
		
		
	}//

}//
