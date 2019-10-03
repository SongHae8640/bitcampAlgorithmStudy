package DoyAlgorism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class day1algorism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 답
		int[] answers = { 1, 2, 3, 4, 5, 3, 4 };

		int[] stuA = { 1, 2, 3, 4, 5 };
		int[] stuB = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] stuC = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] cnt = new int[3];

		
		// 답비교
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == stuA[i % 5]) {
				cnt[0]++;
			}
			if (answers[i] == stuB[i % 8]) {
				cnt[1]++;
			}
			if (answers[i] == stuC[i % 10]) {
				cnt[2]++;
			}
		}
		
		//맵에다 순번을 지정해줌
		Map<Integer , Integer> map=new HashMap<>();
		map.put(1, cnt[0]);
		map.put(2, cnt[1]);
		map.put(3, cnt[2]);
		
		//최대값이 누구인가 지정
		int max=map.get(1);
		for (int i : map.values()) {
			if(i>max){
				max=i;
			}
			System.out.println(i);
		}
		
		//최대값과 같은 것들 배열에 넣음
		ArrayList<Integer> answerList = new ArrayList<>();
		
        for (Integer key : map.keySet()) {
            if (map.get(key) == max) {
                answerList.add(key);
            }
        }
        
        //정렬 및 배열로 변환
        int[] answer = new int[answerList.size()];
        Collections.sort(answerList);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
		
		
		System.out.println(answer);
	}
}
