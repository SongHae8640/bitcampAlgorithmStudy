package level2;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

	public static void main(String[] args) {
		solution(new String[][] {{"yellow_hat", "headgear"}, 
								{"blue_sunglasses", "eyewear"}, 
								{"green_turban", "headgear"}});
		
		solution(new String[][] {{"crow_mask", "face"}, 
								{"blue_sunglasses", "face"}, 
								{"smoky_makeup", "face"}});

	}
	
	
    public static int solution(String[][] clothes) {
    	int clothesCount = 1;
    	
    	//옷 종류와 갯수 구하기
    	HashMap<String, Integer> clothAndCount = new HashMap<String, Integer>();
    	for (int i = 0; i < clothes.length; i++) {
    		if(clothAndCount.containsKey(clothes[i][1])) {
    			clothAndCount.put(clothes[i][1], clothAndCount.get(clothes[i][1]) +1);
    		}else {
    			clothAndCount.put(clothes[i][1], 1);
    		}
		}
    	
    		
		for (Map.Entry<String, Integer> entry : clothAndCount.entrySet()) {
			clothesCount *= (entry.getValue()+1);
		}
    	
		//아무것도 안입은 경우 제외
        return clothesCount -1;
    }
}


/*
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/42578
 * 위장 level 2
 * 
 * 풀이
 * step1 각 의상 종류와 그 의상의 갯수를 구한다.
 * step2 (각 의상 갯수 +1)*(각 의상 갯수 +1) ...
 * step3 아무것도 입지 않은 경우가 있기 때문에 -1 해준다
 * 
 * 예를 들어 머리3 얼굴 2, 상의1 인 경우 총 가능한 갯수는
 * (3+1)*(2+1)*(1+1) -1= 13이다.
 * 각 의상 수에 +1 을 해준 것은 착용하지 않은 경우가 추가 된것이고
 * 맨 마지막에 -1 한 것은 모든 부위의 옷을 입지 않은 경우를 뺀 것이다.
 * 
 * 
 * 채점 결과
테스트 1 〉	통과 (0.84ms, 52.2MB)
테스트 2 〉	통과 (0.88ms, 52.3MB)
테스트 3 〉	통과 (0.83ms, 50.9MB)
테스트 4 〉	통과 (0.87ms, 52.3MB)
테스트 5 〉	통과 (0.85ms, 52.4MB)
테스트 6 〉	통과 (0.76ms, 50.8MB)
테스트 7 〉	통과 (0.90ms, 52.9MB)
테스트 8 〉	통과 (0.85ms, 52.5MB)
테스트 9 〉	통과 (0.78ms, 52.2MB)
테스트 10 〉	통과 (0.85ms, 52MB)
테스트 11 〉	통과 (0.84ms, 52.3MB)
테스트 12 〉	통과 (0.85ms, 52.8MB)
테스트 13 〉	통과 (0.59ms, 52.3MB)
테스트 14 〉	통과 (0.78ms, 52.1MB)
테스트 15 〉	통과 (0.79ms, 52.8MB)
테스트 16 〉	통과 (0.85ms, 50.4MB)
테스트 17 〉	통과 (0.85ms, 52.4MB)
테스트 18 〉	통과 (0.89ms, 52.4MB)
테스트 19 〉	통과 (0.81ms, 52.5MB)
테스트 20 〉	통과 (0.87ms, 52.8MB)
테스트 21 〉	통과 (0.90ms, 50.7MB)
테스트 22 〉	통과 (0.71ms, 50.5MB)
테스트 23 〉	통과 (0.90ms, 50.8MB)
테스트 24 〉	통과 (0.91ms, 50.1MB)
테스트 25 〉	통과 (0.92ms, 52.1MB)
테스트 26 〉	통과 (0.90ms, 53.4MB)
테스트 27 〉	통과 (0.78ms, 52.1MB)
테스트 28 〉	통과 (0.87ms, 52.4MB)
 * */