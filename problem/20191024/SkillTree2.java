package level2;

import java.util.*;

public class SkillTree2 {

	public static void main(String[] args) {
		System.out.println(solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));

	}
	
	public static int solution(String skill, String[] skill_trees) {
		// 결과
        int answer = 0;
        
       
        for (int i = 0; i < skill_trees.length; i++) {
        	//스킬의 순서, 0 부터 차례대로 증가해야함
			int skillIdx=0;
			
			//해당 스킬 트리가 순서에 맞는지 
			boolean isFitOrder = true;
			
			//스킬 트리를 배열로
			String[] skillArr = skill_trees[i].split("");
			 
			
			for (int j = 0; j < skillArr.length; j++) {
				//해당 스킬의 선행 스킬 순서에서의 위치, 없으면 -1 
				int tempSkillIdx = skill.indexOf(skillArr[j]);
				
				
				if(tempSkillIdx == -1) {//없는 경우 패스
					
				}else if(tempSkillIdx == skillIdx) {//선행 스킬 순서와 맞는 경우
					skillIdx++;
				}else {//선행 스킬 순서와 맞지 않는경우
					isFitOrder = false;
					break;
				}
			}
			
			if(isFitOrder) answer++;        	
		}

        return answer;
    }

}

/*
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/49993#fnref1
 * 
 * 
 * 
테스트 1 〉	통과 (1.22ms, 52.6MB)
테스트 2 〉	통과 (1.26ms, 52.4MB)
테스트 3 〉	통과 (1.34ms, 52.6MB)
테스트 4 〉	통과 (1.37ms, 52.5MB)
테스트 5 〉	통과 (1.36ms, 52.2MB)
테스트 6 〉	통과 (1.31ms, 52.3MB)
테스트 7 〉	통과 (1.53ms, 51.9MB)
테스트 8 〉	통과 (1.36ms, 53.3MB)
테스트 9 〉	통과 (1.39ms, 52.6MB)
테스트 10 〉	통과 (1.43ms, 52.5MB)
테스트 11 〉	통과 (1.42ms, 54MB)
테스트 12 〉	통과 (1.53ms, 50.5MB)
테스트 13 〉	통과 (1.45ms, 50.6MB)
테스트 14 〉	통과 (1.42ms, 52.7MB)
 * */
