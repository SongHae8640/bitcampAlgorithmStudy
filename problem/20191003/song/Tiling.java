package level3;

public class Tiling {

	public static void main(String[] args) {
		System.out.println(solution(4));
		System.out.println(solution(7));

	}
	
	public static int solution(int n) {
		int[] answer = new int[n+1];
		answer[0] = 1;
		answer[1] = 1;
		for(int i =2 ; i <=n; i++) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		return answer[n];
	}

}

/*
 * n   answer
 * ------
 * 1 > 1
 * 2 > 2
 * 3 > 3
 * 4 > 5
 * 5 > 8
 * 
 * => solution(n) = solution(n-1) + solution(n-2)
 * 
 * 이전에 했을때 재귀 보다 행렬로 했을때 이런 문제가 빨리 풀렸음
 * 
정확성  테스트
테스트 1 〉	통과 (1.03ms, 52.7MB)
테스트 2 〉	통과 (0.86ms, 50.3MB)
테스트 3 〉	통과 (0.96ms, 51.9MB)
테스트 4 〉	통과 (1.17ms, 50.4MB)
테스트 5 〉	통과 (0.89ms, 52.3MB)
테스트 6 〉	통과 (1.01ms, 51.7MB)
테스트 7 〉	통과 (0.85ms, 52.4MB)
테스트 8 〉	통과 (1.01ms, 52.2MB)
테스트 9 〉	통과 (0.99ms, 52.8MB)
테스트 10 〉	통과 (0.94ms, 53.2MB)
테스트 11 〉	통과 (0.93ms, 50.7MB)
테스트 12 〉	통과 (0.90ms, 52.2MB)
테스트 13 〉	통과 (0.92ms, 50.2MB)
테스트 14 〉	통과 (0.93ms, 54.3MB)
효율성  테스트
테스트 1 〉	통과 (1.34ms, 50.2MB)
테스트 2 〉	통과 (1.62ms, 50.2MB)
테스트 3 〉	통과 (1.36ms, 52.1MB)
테스트 4 〉	통과 (1.40ms, 50.3MB)
테스트 5 〉	통과 (1.84ms, 50.8MB)
테스트 6 〉	통과 (2.07ms, 52.2MB)
 * */
