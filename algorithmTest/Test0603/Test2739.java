package test0603;

import java.util.Scanner;

public class Test2739 {

	public static void main(String[] args) {
		/*
		 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		 * 출력형식과 같게 N*1부터 N*9까지 출력한다.
		 * 
		 * 입력 2
		 * 출력
		 *  2 * 1 = 2
			2 * 2 = 4
			2 * 3 = 6
			2 * 4 = 8
			2 * 5 = 10
			2 * 6 = 12
			2 * 7 = 14
			2 * 8 = 16
			2 * 9 = 18
		 */
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num>=1&&num<=9){
			
			for(int a=1;a<=9;a++){
				System.out.println(num+" * "+a+" = "+(num*a));
			}
			
			
		}//if

		
		
		
		
	}//

}//
