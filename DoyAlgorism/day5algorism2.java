package DoyAlgorism;

public class day5algorism2 {

	static boolean[][] link;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		
//		int[][] computers = { {1, 1, 0}, {1, 1, 0}, {0, 0, 1} };
//		int[][] computers = { {1, 1, 0}, {1, 1, 1}, {0, 1, 1} };
		int[][] computers = { { 1, 1, 0, 0 }, { 1, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 0, 0, 1 } };

		int n=computers.length;
		
		link = new boolean[n][n];
		
		
		for (int i = 0; i < n; i++) {
			if(!link[i][i]) {
				//연결 되어있지 않을경우 증가
        		dfs(computers, i, n);
        		answer++;
        	}
		}
		System.out.println(answer);
	}
	
	public static void dfs(int[][] computers, int idx, int n) {
		for(int i = 0; i < n; i++) {			
			if(computers[idx][i] == 1 && !link[idx][i]) {
				link[idx][i] = link[i][idx] = true;
				dfs(computers, i, n);
			}
		}
	}

}

/*
 * lv3 https://programmers.co.kr/learn/courses/30/lessons/43162
 * 테스트 1 〉	통과 (0.86ms, 50.4MB)
테스트 2 〉	통과 (0.79ms, 50.6MB)
테스트 3 〉	통과 (0.86ms, 50.8MB)
테스트 4 〉	통과 (0.90ms, 52.8MB)
테스트 5 〉	통과 (0.81ms, 52MB)
테스트 6 〉	통과 (1.03ms, 52.4MB)
테스트 7 〉	통과 (0.82ms, 52.4MB)
테스트 8 〉	통과 (1.04ms, 53.2MB)
테스트 9 〉	통과 (0.86ms, 50.7MB)
테스트 10 〉	통과 (0.95ms, 52.1MB)
테스트 11 〉	통과 (2.00ms, 52MB)
테스트 12 〉	통과 (1.95ms, 52MB)
테스트 13 〉	통과 (1.14ms, 52.4MB)
 */
