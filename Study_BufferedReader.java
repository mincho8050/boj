package test0531;

import java.io.*;
import java.io.*;

public class Study_BufferedReader {

	
	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader
		 * > 입력방식
		 * 
		 * > Scanner를 통해 입력받을 경우 Space, Enter를 모두 경계로
		 *   인식하기에 입력받은 데이터를 가공하기 매우 편리하다.
		 * > 하지만 그에비해 BufferedReader는 Enter만 경계로 인식하고
		 *   받은 데이터가 String으로 고정. > 데이터 가공 작업이 필요.
		 *   Scanner에 비해 다소 사용이 불편하다 많은 양의 데이터에서는 효율이 좋음. 
		 */
		
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("나이");
		String name=br.readLine();
		
		
		/*
		 * 빠른 출력을 위해 StringBuilder 사용,
		 * 
		 */

	}//main

}//class
