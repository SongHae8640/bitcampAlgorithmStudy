package level2;

import java.util.*;

public class SkillTree2 {

	public static void main(String[] args) {
		System.out.println(solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));

	}
	
	public static int solution(String skill, String[] skill_trees) {
		// 결과
        int answer = 0;
        for(int i=0; i<skill_trees.length; i++)
        {
            String temp= "";
            for(int j=0; j<skill_trees[i].length(); j++)
            {
                if(skill.contains(""+ skill_trees[i].charAt(j)))
                    temp+=skill_trees[i].charAt(j);
            }
            if(skill.startsWith(temp)) //접두사 확인 메소드
                answer++;
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
