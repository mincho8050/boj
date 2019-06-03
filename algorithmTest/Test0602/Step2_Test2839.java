package Test0602;

import java.util.Scanner;

public class Step2_Test2839 {

	public static void main(String[] args) {
		/*
		 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 
		 * 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
		 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 
		 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
  		      상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
  		      예를 들어, 18킬로그램 설탕을 배달해야 할 때, 
  		   3킬로그램 봉지 6개를 가져가도 되지만, 
  		   5킬로그램 3개와 3킬로그램 1개를 배달하면, 
  		      더 적은 개수의 봉지를 배달할 수 있다.
		      상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 
		      봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
		      
		      첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)    
		   상근이가 배달하는 봉지의 최소 개수를 출력한다. 
		   만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.   
		 */
		/*
		 * 상근이 봉지적게.
		 * 5kg,3kg
		 * 봉지최소갯수구하기.
		 * 예)18kg > 5kg 3개, 3kg 1개
		 * 만약 n킬로그램을 딱 나눌수 없으면 -1
		 */
		
		/* 최소봉지를 만들려면 일단 5가 제일 크니까 이걸로 먼저 나누고 나머지를 3으로 나누는게
		 * 제일 좋지않을까?
		 * 그렇다면 먼저 첫번째 가정을
		 * (3 ≤ N ≤ 5000) 와 5로 나누고 그 나머지값을 3으로 나눈 뭐.. 그런거?
		 */
		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int divi1=n/5;
		int divi2=n/3;
		int qu1=n%5;
		int qu2=n%3;
		
/*		if(n>=3&&n<=5000){
			if(qu1==0){
				System.out.println(divi1);
			}else if(qu2==0){
				System.out.println(divi2);
			}else if(qu1!=0){
				if(qu1%3!=0){
					System.out.println("-1");
				}else if(qu1%3==0){
					int hap=0;
					hap=divi1;
					hap+=qu1/3;
					System.out.println(hap);
				}
			}
		}//
		*/
		/*
		 * n을 5로 나눴을때 나머지가 0
		 *  > 5의 몫만 구함.
		 * n을 5로 나눴을때 나머지가 0이 아님.
		 *  > 몇가지경우.
		 *    > 1.5의 나머지가 3으로 나눠졌을때(3의나머지0)
		 *    > 2.5의 나머지가 3으로 나눠지지 않았을때.
		 *         > 3으로 나눠보기.
		 *    
		 */
		
		int hap=0;
		
		if(n>=3&&n<=5000){
			
			if(qu1==0){
				System.out.println(divi1);
			}else if(qu1!=0){
				if(qu1%3==0){
					hap=divi1;
					hap+=qu1/3;
					System.out.println(hap);
				}else if(qu1%3!=0){
					
				} //3
			}//else if 2
			
		}//1
		
		
		
		
		
		sc.close();

	}//

}//
