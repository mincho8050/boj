package test0531;

import java.io.*;
import java.io.*;
import java.util.StringTokenizer;

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
		 *   두번째. 예외처리를 꼭 해주어야 한다.
		 *   readLine을 할때마다 try & catch를 활용하여 예외처리를 해주어도 되지만 
		 *   대개 throws IOException을 통하여 작업합니다.
		 *   > 버퍼스트림을InputStreamReader / OutputStreamWriter를 같이 사용하여 
		 *   버퍼링을 하게 되면 입출력 스트림으로부터 미리 버퍼에 데이터를 갖다 놓기 때문에 
		 *   보다 효율적인 입출력이 가능합니다.
		 */
		
/*		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String s=bf.readLine(); //String형으로 고정
		int i=Integer.parseInt(s); //int형으로 변환
		
		//Read한 데이터 가공
		StringTokenizer st=new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
		int a=Integer.parseInt(st.nextToken()); //첫번째 호출
		int b=Integer.parseInt(st.nextToken()); //두번째 호출
		
		String array[]=s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
		
		/*
		 * BufferedWriter
		 * 출력방식
		 * BufferedWriter의 경우 버퍼를 잡아 놓았기 때문에 반드시
		 * flush()/closw()를 호출해 뒷처리를 해줘야한다.
		 * bw.write에는 System.out.println();과 같이 자동개행기능이 없기때문에 개행을 해주어야할 경우에는 
		 * \n를 통해 따로 처리
		 */
/*		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); //선언
		bw.write("안녕"+"\n");	//출력
		bw.flush(); //남아있는 데이터를 모두 출력시킴
		bw.close(); //스트림을 닫음
		
*/		
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("나이는?");
		String age=in.readLine();
		System.out.println("이름은?");
		String name=in.readLine();
		
		System.out.println("나의 이름은 "+name+"\n"+"나의 나이는 "+age);
	}//main

}//class
