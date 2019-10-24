package level1;

public class TileDecoration2 {

	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(5));

	}
	
	public static long solution(int N) {
		
		long[] circ = new long[N+2]; // 둘레
        circ[0] = 4; // 첫번째 사각형의 둘레
        long[] tile = new long[N+1];
        tile[0]=1;
        tile[1]=1;
		
		if(N == 1)
        {
            System.out.println("타일의 변의 길이 : "+N);
            System.out.println("전체 둘레 : "+circ[N]);
        }
        else if(N == 2)
        {
            System.out.println("타일의 변의 길이 : "+tile[N-1]);
            System.out.println("전체 둘레 : "+(circ[N-2]+(tile[N-1]*2)));
            circ[N-1] = circ[N-2]+(tile[N-1]*2);
        }
        else if(N>2)
        {
            for(int i=2; i<=N; i++)
            {
                tile[i] = tile[i-1] + tile[i-2];
                circ[i-1] = circ[i-2]+(tile[i-1]*2); 
            }
            System.out.println(N+"번째 타일의 변의 길이 : "+tile[N-1]);
            System.out.println("전체 둘레 : "+circ[N-1]);
        }
		
		return circ[N-1];
	}

}


/*
 * 출처 : https://programmers.co.kr/learn/courses/30/lessons/43104
 * 
테스트 1 〉	통과 (0.86ms, 52.6MB)
테스트 2 〉	통과 (0.84ms, 52.5MB)
테스트 3 〉	통과 (0.79ms, 52.8MB)
테스트 4 〉	통과 (0.76ms, 52.7MB)
테스트 5 〉	통과 (0.81ms, 52.6MB)
테스트 6 〉	통과 (0.82ms, 52.5MB)
테스트 7 〉	통과 (0.87ms, 52.1MB)
테스트 8 〉	통과 (0.83ms, 50.4MB)
효율성  테스트
테스트 1 〉	통과 (0.52ms, 52.4MB)
테스트 2 〉	통과 (0.80ms, 52.4MB)
테스트 3 〉	통과 (0.55ms, 50.8MB)
테스트 4 〉	통과 (0.58ms, 51.2MB)
 * 
 * */