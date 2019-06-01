package Test0601;

import java.util.Scanner;

public class Test11719 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		/*
		 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 
		 * 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
		 * 각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 
		 * 각 줄의 앞 뒤에 공백이 있을 수도 있다.
		 */
		/*
		 *     Hello

			Baekjoon     
			   Online Judge    
		 */
		String input="";
		while(sc.hasNextLine()){
			input=sc.nextLine();
			if(input.length()>100){
				continue;
			}
			System.out.println(input);
		}
		
		sc.close();
		
		
		

	}

}
