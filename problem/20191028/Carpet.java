package level1;

import java.util.ArrayList;

public class Carpet {
	public static void main(String[] args) {
		solution(10,2);
		solution(8,1);
		solution(24, 24);

	}
	public static int[] solution(int brown, int red) {
		ArrayList<Integer> divisorList = new ArrayList<Integer>();
		//약수 찾기
		for(int i = 1 ; i <= red/2 ; i++) {
			if(red%i == 0) divisorList.add(i);
		}
		
		//하나씩 돌려가며 
		for(int i =0 ; i < divisorList.size() ; i++) {
			//brown의 수와 맞는지 비교 
			int tempDivisor = divisorList.get(i);
			if(brown == (tempDivisor+2 + red/tempDivisor)*2) {
				//맞으면 return
				System.out.println(Integer.max(tempDivisor, red/tempDivisor)+2 +", "+(Integer.min(tempDivisor, red/tempDivisor)+2));
				return new int [] {Integer.max(tempDivisor, red/tempDivisor)+2 , Integer.min(tempDivisor, red/tempDivisor)+2 };
			}
			
			
		}
        return null;
	}
	
	
	
}

/*
 *문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42842 
 *
 *red가 1일때도 해야하지만 그냥 패쓰!
 *
테스트 1 〉	통과 (1.68ms, 53.3MB)
테스트 2 〉	통과 (1.52ms, 52MB)
테스트 3 〉	통과 (9.68ms, 52.2MB)
테스트 4 〉	통과 (1.65ms, 52.8MB)
테스트 5 〉	통과 (1.61ms, 50.4MB)
테스트 6 〉	통과 (5.06ms, 52.3MB)
테스트 7 〉	통과 (12.06ms, 50.3MB)
테스트 8 〉	통과 (10.39ms, 50.2MB)
테스트 9 〉	통과 (11.89ms, 53.1MB)
테스트 10 〉통과 (12.83ms, 52.7MB)
 */