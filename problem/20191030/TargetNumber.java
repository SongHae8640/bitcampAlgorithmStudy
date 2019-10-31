package level2;
/*
 * ����/�ʺ� �켱 Ž��(DFS/BFS)
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 * 
 * ���� �����ε� �̰� �̷��� �ϴ°� ����?
�׽�Ʈ 1 ��	��� (29.94ms, 52.5MB)
�׽�Ʈ 2 ��	��� (28.43ms, 52.6MB)
�׽�Ʈ 3 ��	��� (1.45ms, 53.9MB)
�׽�Ʈ 4 ��	��� (1.64ms, 54MB)
�׽�Ʈ 5 ��	��� (3.97ms, 54.3MB)
�׽�Ʈ 6 ��	��� (1.96ms, 54.1MB)
�׽�Ʈ 7 ��	��� (1.39ms, 54.5MB)
�׽�Ʈ 8 ��	��� (2.17ms, 53.6MB)
 * */

import java.util.Arrays;

public class TargetNumber {
	static int answer = 0;
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 1, 1, 1, 1}, 3));

	}
	
    public static int solution(int[] numbers, int target) {
        
        dfs(numbers,target, 0);
        return answer;
    }
    
    public static void dfs(int[] numbers, int target, int n) {
    	if(n == numbers.length) {
    		int sum = 0;
    		for(int i=0 ; i<numbers.length; i++) {
    			sum +=numbers[i];
    		}
    		
    		if(sum == target) {
    			answer++;
    		}
    	}else {
    		numbers[n] *=1;
    		dfs(numbers, target, n+1);
    		
    		numbers[n] *=-1;
    		dfs(numbers, target, n+1);
    	}
    }
}


/*
�׽�Ʈ 1 ��	��� (32.10ms, 52.5MB)
�׽�Ʈ 2 ��	��� (29.80ms, 50.5MB)
�׽�Ʈ 3 ��	��� (1.25ms, 52.3MB)
�׽�Ʈ 4 ��	��� (1.54ms, 53MB)
�׽�Ʈ 5 ��	��� (3.24ms, 52.6MB)
�׽�Ʈ 6 ��	��� (1.47ms, 53MB)
�׽�Ʈ 7 ��	��� (1.26ms, 52.7MB)
�׽�Ʈ 8 ��	��� (1.99ms, 52.5MB)
 * */
