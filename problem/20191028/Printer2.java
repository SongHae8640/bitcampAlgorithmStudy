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
		//���� ��� ����
        Queue<Paper> paperList = new LinkedList<Paper>();
        ArrayList<Integer> priorityList = new ArrayList<Integer>();
        for (int i = 0; i < priorities.length; i++) {
			paperList.offer(new Paper(priorities[i], i));
			priorityList.add(priorities[i]);
		}
        
        //�켱 ������ ������������ ���� - ó���ؾ��� �켱 ���� ����
        priorityList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
        
        //�켱���� index
        int priortyListIdx = 0;
        
        //��µǴ� ����
        int printNum = 1;
        
        //��� ������ �� ��� �ɶ� ����
        while(paperList.size() !=0 ) {
        	Paper tempPaper = paperList.poll();
        	
        	//������ �켱������ ó���ؾ��� �켱���� �� ���
        	if(tempPaper.priority == priorityList.get(priortyListIdx)) {
        		//ó���� ������ �˰� ���� ���� �϶�
        		if(tempPaper.index ==location) {
        			//���� ���
        			return printNum;
        		}
        		
        		//ó���ؾ��� �켱���� index ����
        		priortyListIdx++;
        		
        		//��� ���� ����
        		printNum++;
        	} else {//������ ������ ó���ؾ��� �켱������ �ƴ� ���
        		//�ǵڷ� ����
        		paperList.offer(tempPaper);
        	}
        }
        
        return -1;
    }
	
	
	
	
}


/*
 * ��ó : https://programmers.co.kr/learn/courses/30/lessons/42587
 * 
 * ArrayList�� ����ϱ� ������ ��ü������ �ð� ����, 
 * but �켱 ������ ���� �������� �����ϴ°� ���� �ϴµ� �� ���� �� �Ͽ� ����� ��
 * 
�׽�Ʈ 1 ��	��� (1.49ms, 52.4MB)
�׽�Ʈ 2 ��	��� (1.98ms, 52.9MB)
�׽�Ʈ 3 ��	��� (1.72ms, 52.5MB)
�׽�Ʈ 4 ��	��� (1.60ms, 52.5MB)
�׽�Ʈ 5 ��	��� (1.35ms, 50.4MB)
�׽�Ʈ 6 ��	��� (1.51ms, 52.7MB)
�׽�Ʈ 7 ��	��� (1.73ms, 50.1MB)
�׽�Ʈ 8 ��	��� (1.86ms, 52.1MB)
�׽�Ʈ 9 ��	��� (1.35ms, 52.5MB)
�׽�Ʈ 10 ��	��� (1.67ms, 52.6MB)
�׽�Ʈ 11 ��	��� (1.92ms, 50.5MB)
�׽�Ʈ 12 ��	��� (1.51ms, 50.5MB)
�׽�Ʈ 13 ��	��� (1.92ms, 52.2MB)
�׽�Ʈ 14 ��	��� (1.26ms, 52.2MB)
�׽�Ʈ 15 ��	��� (1.51ms, 50.3MB)
�׽�Ʈ 16 ��	��� (1.57ms, 50.2MB)
�׽�Ʈ 17 ��	��� (2.02ms, 52.5MB)
�׽�Ʈ 18 ��	��� (1.31ms, 50.2MB)
�׽�Ʈ 19 ��	��� (1.93ms, 52.6MB)
�׽�Ʈ 20 ��	��� (1.79ms, 50.4MB)
 * 
 */