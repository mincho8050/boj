package test0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 
		 * 둘째 줄에 숫자 N개가 공백없이 주어진다.
		 * 입력으로 주어진 숫자 N개의 합을 출력한다.
		 */

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		String inputNumber=br.readLine();
		
		if(inputNumber.length()==n){ 	//입력한 길이까지 제한을 둠.
										//조건에 맞는 길이가 되어야만 계산에 들어가고 그렇지 않으면 계산이 되지 않음.
			
			int sum=0;
			for(int i=0;i<inputNumber.length();i++){
				sum += Character.getNumericValue(inputNumber.charAt(i)); // 문자 하나하나씩
			}//for
			System.out.println(sum);
			
		}//if
		
		/*
		 * scanner를 이용한 방법
		 
		 import java.util.Scanner;
 
			class Main {
			  public static void main(String[] args) {
			    Scanner scan = new Scanner(System.in);
			    int a = scan.nextInt();
			    String sum = scan.next();
			    int result = 0;
			    if(!((1<=a)&&(a<=100))) {
			      System.exit(0);
			    }
			    for(int i = 0; i < a; i++) {
			      result += (sum.charAt(i)-'0'); //char > int 변환
			    }
			    System.out.println(result);   
			  }// end of main
			}
		 
		 */
		
		
		
		
	}//main

}//class
