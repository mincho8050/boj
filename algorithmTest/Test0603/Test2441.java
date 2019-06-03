package test0603;
import java.util.Scanner;
public class Test2441 {

	public static void main(String[] args) {
		/*
		 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
		    하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		    첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		    입력 5
		    출력
		    *****
			 ****
			  ***
			   **
			    *
		    
		 */

		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num>=1&&num<=100){
			
			for(int a=1;a<=num;a++){
				
				for(int b=1;b<=num;b++){
					if(b<=a-1){
						System.out.print(" ");
					}else{
					System.out.print("*");
					}
					
				}//for
				System.out.println();
			}//for
			
		}//if

	}//

}//
