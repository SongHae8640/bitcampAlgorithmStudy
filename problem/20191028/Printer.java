package level3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {2,1,3,2},2));
		System.out.println(solution(new int[] {1, 1, 9, 1, 1, 1},0));

	}
	public static int solution(int[] priorities, int location) {
		//문서 목록 생성
        Queue<Paper> paperList = new LinkedList<Paper>();
        for (int i = 0; i < priorities.length; i++) {
			paperList.offer(new Paper(priorities[i], i));
		}
        
        // 중요도의 역순으로 
        Arrays.sort(priorities);
        int priortiesIdx = priorities.length-1;
        int printNum = 1;
        
        while(paperList.size() !=0 ) {
        	Paper tempPaper = paperList.poll();
        	if(tempPaper.priority == priorities[priortiesIdx]) {
        		if(tempPaper.index ==location) {
        			return printNum;
        		}
        		priortiesIdx--;
        		printNum++;
        	} else {
        		paperList.offer(tempPaper);
        	}
        }
        
        return -1;
    }
	
	
	
	
}

class Paper{
	int priority;
	int index;
	
	public Paper(int priority, int index) {
		super();
		this.priority = priority;
		this.index = index;
	}
	public int getPriority() {
		return priority;
	}
	public int getIndex() {
		return index;
	}
	
}

/*
 * 출처 : https://programmers.co.kr/learn/courses/30/lessons/42587
 * 
테스트 1 〉	통과 (1.34ms, 52.1MB)
테스트 2 〉	통과 (1.66ms, 52.8MB)
테스트 3 〉	통과 (1.36ms, 50.4MB)
테스트 4 〉	통과 (1.17ms, 52.3MB)
테스트 5 〉	통과 (1.24ms, 52.4MB)
테스트 6 〉	통과 (1.43ms, 52.5MB)
테스트 7 〉	통과 (1.35ms, 50.3MB)
테스트 8 〉	통과 (1.55ms, 50MB)
테스트 9 〉	통과 (1.28ms, 52.9MB)
테스트 10 〉통과 (1.25ms, 52.4MB)
테스트 11 〉통과 (1.51ms, 52.9MB)
테스트 12 〉통과 (1.23ms, 52.4MB)
테스트 13 〉통과 (1.57ms, 52.9MB)
테스트 14 〉통과 (1.23ms, 50.5MB)
테스트 15 〉통과 (1.25ms, 52.3MB)
테스트 16 〉통과 (1.32ms, 51.9MB)
테스트 17 〉통과 (1.79ms, 50.2MB)
테스트 18 〉통과 (1.25ms, 52.3MB)
테스트 19 〉통과 (1.57ms, 52.4MB)
테스트 20 〉통과 (1.28ms, 50.8MB) 
 * 
 */