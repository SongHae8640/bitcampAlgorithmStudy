package DoyAlgorism;

import java.util.ArrayList;

public class TileDecoration {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long answer = 0;
		
//		int n=4;
//		int m=6;
//		int N=5;
//		int sum=0;
//		
//		for (int i = 3; i <= N; i++) {
//			sum=n+m;
//			n=m;
//			m=sum;
//			System.out.println("n:"+n);
//			System.out.println("m:"+m);
//			System.out.println(sum);
//				
//		}
//		System.out.println(sum);
//		answer=sum;
		
		
		//An=An-1+An-2; if(n>=3)
		//a1=1,a2=1
		
		int N=5;
		
		long[] arr=new long[30];
		System.out.println(arr.length);
		// 롱안의 숫자를 N으로 햇을때 오류 왜날까
		arr[1]=4;
		arr[2]=6;
		for (int i = 3; i <= arr.length; i++) {
			arr[i]=arr[i-1]+arr[i-2];
			
			System.out.println(i+"번째 " +arr[i]);
		}
		System.out.println(arr[N]);
		
	}

}


//lev.1 https://programmers.co.kr/learn/courses/30/lessons/43104
