package Test0531;

import java.util.*;

public class Test1001 {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a<10&&b<10){
			System.out.println(a-b);
		}
		
		sc.close();

	}

}
