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
		//���� ��� ����
        Queue<Paper> paperList = new LinkedList<Paper>();
        for (int i = 0; i < priorities.length; i++) {
			paperList.offer(new Paper(priorities[i], i));
		}
        
        // �߿䵵�� �������� 
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
 * ��ó : https://programmers.co.kr/learn/courses/30/lessons/42587
 * 
�׽�Ʈ 1 ��	��� (1.34ms, 52.1MB)
�׽�Ʈ 2 ��	��� (1.66ms, 52.8MB)
�׽�Ʈ 3 ��	��� (1.36ms, 50.4MB)
�׽�Ʈ 4 ��	��� (1.17ms, 52.3MB)
�׽�Ʈ 5 ��	��� (1.24ms, 52.4MB)
�׽�Ʈ 6 ��	��� (1.43ms, 52.5MB)
�׽�Ʈ 7 ��	��� (1.35ms, 50.3MB)
�׽�Ʈ 8 ��	��� (1.55ms, 50MB)
�׽�Ʈ 9 ��	��� (1.28ms, 52.9MB)
�׽�Ʈ 10 ����� (1.25ms, 52.4MB)
�׽�Ʈ 11 ����� (1.51ms, 52.9MB)
�׽�Ʈ 12 ����� (1.23ms, 52.4MB)
�׽�Ʈ 13 ����� (1.57ms, 52.9MB)
�׽�Ʈ 14 ����� (1.23ms, 50.5MB)
�׽�Ʈ 15 ����� (1.25ms, 52.3MB)
�׽�Ʈ 16 ����� (1.32ms, 51.9MB)
�׽�Ʈ 17 ����� (1.79ms, 50.2MB)
�׽�Ʈ 18 ����� (1.25ms, 52.3MB)
�׽�Ʈ 19 ����� (1.57ms, 52.4MB)
�׽�Ʈ 20 ����� (1.28ms, 50.8MB) 
 * 
 */