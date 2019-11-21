package javapro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//collectionsort - ��������
/*
 * A,B���̰� �ٸ��� ª������ ����
 * 			 ������ A��� �ڸ��� �հ� B��� �ڸ��� �� ��
 * 				=> ���� ���� ����
 * 			 �ƴϸ� ������(����<���ĺ�)
 */
public class bj1431 {
//https://www.acmicpc.net/problem/1431
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] guitar = new String[N+1];//��Ÿ ��(1���̻�
		
		//�Է¹ޱ�
		for(int i=0;i<=N;i++){
			String serial = sc.nextLine();
			guitar[i] = serial;
		}
		
		
		//sort
		Arrays.sort(guitar, new Comparator<String>(){

			@Override
			public int compare(String A, String B) {
				if(A.length()<B.length()){//1. ���̺�
					return -1;
				}else if(A.length()>B.length()){
					return 1;
				}else{
					//A�� ��� �ڸ� �� ��
					int sumA =0;
					for(int i=0;i<A.length();i++){
						char result = A.substring(i, i+1).charAt(0);
						if((int)result>47 && (int)result<58){
							sumA += Integer.parseInt(Character.toString(result));
						}
					}
					//B��� �ڸ��� ��
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
					else{//3.��������(����< ���ĺ�)
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
