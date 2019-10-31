package javapro;

import java.util.*;

public class targetNum {
	static int answer=0;
	public static void main(String[] args) {
		int[] number = {1,1,1,1,1};
		int target1 = 3;
		System.out.println(solution(number, target1));
	}
	public static int solution(int[] numbers, int target){
		dfs(target,numbers,0);
		return answer;
	}	
	public static void dfs(int target, int[] numbers, int k){
		 if(k == numbers.length){
			int sum=0;
			for(int i=0;i<numbers.length;i++){
				sum+=numbers[i];
			}
			if(sum == target)
				answer++;
			return;
		}else{
			numbers[k]*=1;
			dfs(target, numbers, k+1);
			
			numbers[k]*=-1;
			dfs(target, numbers, k+1);
		}
	}
}
/*
 * �׽�Ʈ 1 ��	��� (31.50ms, 52.6MB)
�׽�Ʈ 2 ��	��� (31.65ms, 50.7MB)
�׽�Ʈ 3 ��	��� (1.33ms, 54.5MB)
�׽�Ʈ 4 ��	��� (1.59ms, 50.2MB)
�׽�Ʈ 5 ��	��� (3.99ms, 52.7MB)
�׽�Ʈ 6 ��	��� (1.48ms, 53.9MB)
�׽�Ʈ 7 ��	��� (1.41ms, 52.4MB)
�׽�Ʈ 8 ��	��� (1.98ms, 51.8MB)
 */