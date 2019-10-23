package tileDecoration;

public class TileDecoration {

	public static void main(String[] args) {
		int N=80;
		Solution sol=new Solution();
		long result=sol.solution(N);
		System.out.println(result);
		
	}

}

class Solution {
    public long solution(int N) {
        long answer = 0;
        
        long[] fib=new long[N];
        fib[0]=1;
        fib[1]=2;
        
        for(int i=2;i<N;i++){
        	
        	fib[i]=fib[i-1]+fib[i-2];
        	
        }
        
        answer=fib[N-1]*2+fib[N-2]*2;
        
        return answer;
    }
}

----------------------------------------------------
테스트 1 〉	통과 (0.84ms, 52.5MB)
테스트 2 〉	통과 (0.76ms, 50.5MB)
테스트 3 〉	통과 (0.79ms, 52.7MB)
테스트 4 〉	통과 (0.73ms, 52.3MB)
테스트 5 〉	통과 (0.89ms, 52.6MB)
테스트 6 〉	통과 (0.77ms, 50.4MB)
테스트 7 〉	통과 (0.82ms, 52.2MB)
테스트 8 〉	통과 (0.72ms, 52.5MB)
효율성  테스트
테스트 1 〉	통과 (0.49ms, 52.4MB)
테스트 2 〉	통과 (0.56ms, 52.6MB)
테스트 3 〉	통과 (0.56ms, 52.4MB)
테스트 4 〉	통과 (0.60ms, 53MB)
