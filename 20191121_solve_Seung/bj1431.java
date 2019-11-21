package javapro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//collectionsort - 오름차순
/*
 * A,B길이가 다르면 짧은것이 먼저
 * 			 같으면 A모든 자리수 합과 B모든 자리수 합 비교
 * 				=> 작은 합이 먼저
 * 			 아니면 사전순(숫자<알파벳)
 */
public class bj1431 {
//https://www.acmicpc.net/problem/1431
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] guitar = new String[N+1];//기타 수(1개이상
		
		//입력받기
		for(int i=0;i<=N;i++){
			String serial = sc.nextLine();
			guitar[i] = serial;
		}
		
		
		//sort
		Arrays.sort(guitar, new Comparator<String>(){

			@Override
			public int compare(String A, String B) {
				if(A.length()<B.length()){//1. 길이비교
					return -1;
				}else if(A.length()>B.length()){
					return 1;
				}else{
					//A의 모든 자리 수 합
					int sumA =0;
					for(int i=0;i<A.length();i++){
						char result = A.substring(i, i+1).charAt(0);
						if((int)result>47 && (int)result<58){
							sumA += Integer.parseInt(Character.toString(result));
						}
					}
					//B모든 자리수 합
					int sumB=0;
					for(int j=0;j<B.length();j++){
						char result = B.substring(j,j+1).charAt(0);
						if((int)result > 47 && (int)result < 58){
							sumB+=Integer.parseInt(Character.toString(result));
						}
					}
					
					if(sumA>sumB){
						return 1;
					}
					else if(sumA < sumB){
						return -1;
					}
					else{//3.사전순비교(숫자< 알파벳)
						return A.compareTo(B);
					}
				}
			}
			
		});
		
		for(int i=1;i<guitar.length;i++){
			System.out.println(guitar[i]);
		}
	}
}
