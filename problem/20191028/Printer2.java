package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Printer2 {
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {2,1,3,2},2));
		System.out.println(solution(new int[] {1, 1, 9, 1, 1, 1},0));

	}
	public static int solution(int[] priorities, int location) {
		//문서 목록 생성
        Queue<Paper> paperList = new LinkedList<Paper>();
        ArrayList<Integer> priorityList = new ArrayList<Integer>();
        for (int i = 0; i < priorities.length; i++) {
			paperList.offer(new Paper(priorities[i], i));
			priorityList.add(priorities[i]);
		}
        
        //우선 순위를 내림차순으로 정렬 - 처리해야할 우선 순위 순서
        priorityList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
        
        //우선순위 index
        int priortyListIdx = 0;
        
        //출력되는 순서
        int printNum = 1;
        
        //모든 문서가 다 출력 될때 까지
        while(paperList.size() !=0 ) {
        	Paper tempPaper = paperList.poll();
        	
        	//문서의 우선순위가 처리해야할 우선순위 인 경우
        	if(tempPaper.priority == priorityList.get(priortyListIdx)) {
        		//처리한 문서가 알고 싶은 문서 일때
        		if(tempPaper.index ==location) {
        			//순서 출력
        			return printNum;
        		}
        		
        		//처리해야할 우선순위 index 증가
        		priortyListIdx++;
        		
        		//출력 순서 증가
        		printNum++;
        	} else {//문서의 순서가 처리해야할 우선순위가 아닌 경우
        		//맨뒤로 보냄
        		paperList.offer(tempPaper);
        	}
        }
        
        return -1;
    }
	
	
	
	
}


/*
 * 출처 : https://programmers.co.kr/learn/courses/30/lessons/42587
 * 
 * ArrayList를 사용하기 때문에 전체적으로 시간 증가, 
 * but 우선 순위를 내림 차순으로 정렬하는게 이해 하는데 더 편할 듯 하여 만들어 봄
 * 
테스트 1 〉	통과 (1.49ms, 52.4MB)
테스트 2 〉	통과 (1.98ms, 52.9MB)
테스트 3 〉	통과 (1.72ms, 52.5MB)
테스트 4 〉	통과 (1.60ms, 52.5MB)
테스트 5 〉	통과 (1.35ms, 50.4MB)
테스트 6 〉	통과 (1.51ms, 52.7MB)
테스트 7 〉	통과 (1.73ms, 50.1MB)
테스트 8 〉	통과 (1.86ms, 52.1MB)
테스트 9 〉	통과 (1.35ms, 52.5MB)
테스트 10 〉	통과 (1.67ms, 52.6MB)
테스트 11 〉	통과 (1.92ms, 50.5MB)
테스트 12 〉	통과 (1.51ms, 50.5MB)
테스트 13 〉	통과 (1.92ms, 52.2MB)
테스트 14 〉	통과 (1.26ms, 52.2MB)
테스트 15 〉	통과 (1.51ms, 50.3MB)
테스트 16 〉	통과 (1.57ms, 50.2MB)
테스트 17 〉	통과 (2.02ms, 52.5MB)
테스트 18 〉	통과 (1.31ms, 50.2MB)
테스트 19 〉	통과 (1.93ms, 52.6MB)
테스트 20 〉	통과 (1.79ms, 50.4MB)
 * 
 */