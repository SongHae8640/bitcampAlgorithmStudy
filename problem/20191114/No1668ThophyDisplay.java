

import java.util.Scanner;

public class No1668ThophyDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] trophys = new int[n];
		int maxHeight;
		int visibleTrophyNum; 
		
		for (int i = 0; i < n; i++) {
			trophys[i] = sc.nextInt();
		}
		
		
		//왼쪽에서 보기
		maxHeight = 0;
		visibleTrophyNum = 0;
		for (int i = 0; i < trophys.length; i++) {
			if(trophys[i] > maxHeight) {
				visibleTrophyNum++;
				maxHeight = trophys[i];
			}
		}
		System.out.println(visibleTrophyNum);
		
		
		//오른쪽에서 보기
		maxHeight = 0;
		visibleTrophyNum = 0;
		for (int i = trophys.length-1; i >=0 ; i--) {
			if(trophys[i] > maxHeight) {
				visibleTrophyNum++;
				maxHeight = trophys[i];
			}
		}
		System.out.println(visibleTrophyNum);
	}

}

/*
 * 출처 : https://www.acmicpc.net/problem/1668
 * 
 * 메모리 : 14292KB
 * 시간 : 108ms
 * */
