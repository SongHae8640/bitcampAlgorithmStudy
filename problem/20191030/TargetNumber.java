package level2;
/*
 * 깊이/너비 우선 탐색(DFS/BFS)
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 * 
 * 전수 조사인데 이걸 이렇게 하는게 낫나?
테스트 1 〉	통과 (29.94ms, 52.5MB)
테스트 2 〉	통과 (28.43ms, 52.6MB)
테스트 3 〉	통과 (1.45ms, 53.9MB)
테스트 4 〉	통과 (1.64ms, 54MB)
테스트 5 〉	통과 (3.97ms, 54.3MB)
테스트 6 〉	통과 (1.96ms, 54.1MB)
테스트 7 〉	통과 (1.39ms, 54.5MB)
테스트 8 〉	통과 (2.17ms, 53.6MB)
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
테스트 1 〉	통과 (32.10ms, 52.5MB)
테스트 2 〉	통과 (29.80ms, 50.5MB)
테스트 3 〉	통과 (1.25ms, 52.3MB)
테스트 4 〉	통과 (1.54ms, 53MB)
테스트 5 〉	통과 (3.24ms, 52.6MB)
테스트 6 〉	통과 (1.47ms, 53MB)
테스트 7 〉	통과 (1.26ms, 52.7MB)
테스트 8 〉	통과 (1.99ms, 52.5MB)
 * */
