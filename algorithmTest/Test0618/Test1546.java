package test0618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test1546 {

	public static void main(String[] args) throws IOException {
		/*
		 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
		 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
		 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
		 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		 각각 점수에 최댓값을 나눈다음 100을 곱한다. 그렇게 한 다음 계산된 점수들을 다 더해서 평균을 구한다.
		 입력
		 > 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 
		 둘째 줄에 세준이의 현재 성적이 주어진다. 
		 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
		 
		 출력
		 >첫째 줄에 새로운 평균을 출력한다. 정답과의 절대/상대 오차는 10-2까지 허용한다.
		 */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String m=br.readLine(); //시험 본 과목의 개수
		int mi=Integer.parseInt(m); //정수형으로 변환		
		String x=br.readLine(); //시험 점수. String값으로 받아야 엔터로 나눌 수 있음	
		String[] score=x.split(" "); //공백을 기준으로 나눠서 배열에 넣음 
		int[] scorei=new int[mi]; //String형을 int형으로 변환시켜서 넣은 배열
		int sum=0;
		
		if(score.length==mi){
		
			for(int a=0;a<mi;a++){
				scorei[a]=Integer.parseInt(score[a]);//형변환		
			}//for
			
			Arrays.sort(scorei); //오름차순으로 정렬 , 맨마지막이 제일 큰 수
			//맨 마지막이 mi-1
//			System.out.print(scorei[mi-1]); //맨마지막수 그러니까 최댓값.
			int max=scorei[mi-1];
			
			for(int idx=0;idx<mi;idx++){
				sum+=scorei[idx];
			}

			//형변환이 중요하다. 이게 그냥 double형으로 하면 소수점 자리가 00으로 처리되서 쓰레기값이 나옴
			double last=(double)(sum)/(double)(max);
			last=last*100.0/(double)mi;
			
			System.out.println(last);
			
		}//if > 공백을 제외한 점수의 갯수가 처음 받은 정수와 같을 때 계산
		

		
	}//main

}//class
