package test0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Test11721 {

	public static void main(String[] args) throws IOException {
		/*
		 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
		 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 
		 * 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.
		 * 입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다. 
		 * 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.
		 * 
		 * 단어길이 100 안 넘어가기. +
		 * 10줄씩 끊어서 출력
		 * 마지막 줄에는 10개미만의 글자를 출력해도됨.
		 */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] line=br.readLine().split(""); //입력받은 문자열을 한 글자씩 배열에 저장.!!!
												//이게 중요하다. 이렇게 받으면 한글자씩 
												//String 값으로 배열에 저장된다.
		
		for(int i=0;i<line.length;i++){
			//10번째 글자를 출력한 뒤 줄바꿈(0번째 인덱스 예외처리 안해주면 출력 형식 오류 뜸)
			if(i%10==0&&!(i==0)){
				System.out.print("\n"+line[i]);
			}else{
				//그 외에는 계속 이어붙이기
				System.out.print(line[i]);
			}
		}//for
		
		/*
		 * ex) BaekjoonOnlineJudge
		 * String[] line={"B","a","e","k","j","o","o","n","O","n","l","i","n","e","J","u","d","g","e"};
		 * line.length=19
		 * 
		 * i=0	
		 * 		0%10==0 && !(0==0) > 틀림
		 * 			> line[0] > "B"출력
		 * i=1
		 * 		1%10==0 && !(1==0) > 틀림
		 * 			>"a" 출력 > Ba
		 * i=2 ~ i=9 > BaekjoonOn > if안의 조건이 틀려서 그대로 하나씩 출력
		 * 
		 * i=10 10%10==0 && !(10==0) > 맞음
		 * 			> "\n"+line[10] > 엔터를 하고 글자를 잇는 표시.
		 * 			>	BaekjoonOn
		 * 				l
		 * ~이렇게 하면됨. 10의 단위로 끊어 주는 조건 10%10==0과 
		 * 				!(10==0) 이건 맨처음 0의 인덱스는 나머지값이 0이 나오기때문에
		 * 				엔터가 쳐진다. 그걸 방지하기 위해 !(10==0) 조건을 넣어 0 인덱스가 
		 * 				조건에 걸리지 않게 했다.
		 */
		
		
		
		
		
	
	
	}//main

}//class
