package test0603;

import java.util.Scanner;

public class Test2839 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		  if(num%5 == 0 ) {
              
	            System.out.println(num/5);
	            return;
	                
	        }else{    
	            
	            int quotient = num/5;
	                
	            for(int i=quotient; i>0; i--) {
	                        
	                int temp = num-(i*5);
	                        
	                if(temp%3==0) {
	                            
	                    System.out.println(i+(temp/3));
	                        
	                    return;
	                }
	            }
	                
	        }          
		  /*
		   * 분석
		   * 
		   * 값 : 17
		   * quotient=17/5 > 3
		   * i=3
		   * temp=17-(3*5) > 2
		   * 2%3==0 아님 > 다시for문
		   * i=2
		   * temp=17-(2*5) > 7
		   * 7%3==0 아님
		   * i=1
		   * temp=17-(1*5) > 12
		   * 12%3==0 맞음
		   * 1+(12/3) > 5
		   * 
		   * 값 : 11  
		   * quotient=11/5 > 2
		   * i=2
		   * temp=11-(2*5) > 1
		   * 1%3==0 아님
		   * 
		   * i=1
		   * temp=11-(1*5) > 6
		   * 6%3==0 맞음
		   * 1+(6/3) > 3  
		   * 
		   * 값 : 7
		   * quotient=7/5 > 1
		   * i=1
		   * temp=7-(1*5) > 1
		   * 1%3==0 아님
		   * > i>0이기 때문에 이 반복문은 끝나서  밑에 있는 두식을 확인. 3의 나머지도 0이 아니기 때문에
		   * > -1값을 출력.
		   * 
		   */
	            
	        if(num%3==0) {
	                    
	            System.out.println(num/3); 
	                                
	        }else {
	                
	            System.out.println(-1);
	                    
	        }
	            
	        return;
	        

	 /*
	  * return; 은 결과값을 최종적으로 반환하게 하는 역할을 한다 !!
		이 코드에서는 return을 써주지 않으면 결과값이 두 개 이상 나올 수 있다.
	  */

		
		

	}//

}//
