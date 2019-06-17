package test0617;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test10871 {

	public static void main(String[] args) throws IOException {
		/*
		 * X보다 작은 수
		 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
		 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
		 * 주어지는 정수는 모두 1보다 크거나 같고, 
		 * 10,000보다 작거나 같은 정수이다.
		 */
		/*
		 * BufferedReader를 통해 입력 받을 때 String변수로 값을 받아야 
		 * 엔터키로 다음 줄로 넘어갈 수 있다.
		 * 즉 int형으로 값을 받고 엔터키를 누르면 오류다.
		 */
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));

		
		String x=in.readLine();	//ex)2 4 
		int idx=x.indexOf(" ");	//공백의 index값을 알아보기
								//" "의 index값은 1
		int n1 = Integer.parseInt(x.substring(0, idx));//공백을 기준으로 앞이 n1 > int 저장
		int n2 = Integer.parseInt(x.substring(idx+1,x.length()));//뒤가 n2 > int 저장
		
		String y = in.readLine(); //다음줄.String값으로 받아야만 엔터로 다음줄 나눌 수 있다
		String[] a=y.split(" ");  //그 줄을 " "을 기준으로 나눠 String 1차원 배열에 넣는다
								  //ex)1 3 4 5 > String[] a={"1","3","4","5"};
		
		for(int i=0;i<n1;i++){//두번째 수열은 n1갯수만큼만 나와야 하니까 범위를 n1보다 작게 한다.
			if(n2>Integer.parseInt(a[i])){//int형으로 변환해서 n2랑 비교해 작은 수만 출력
				System.out.print(a[i]+" ");
			}//if
		}//for
		

		
	}//main

}//class
