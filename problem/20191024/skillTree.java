package level2;

import java.util.*;

public class SkillTree {

	public static void main(String[] args) {
		System.out.println(solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));

	}
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        Iterator <String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }

}
/*
 * 
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/49993#fnref1
 * 
 * 풀이 참고 : https://javaking75.blog.me/220491298440(정규식)
 * [^abc] a, b, c 중 어느것도 아님
 * 
테스트 1 〉	통과 (18.49ms, 49.3MB)
테스트 2 〉	통과 (19.67ms, 46MB)
테스트 3 〉	통과 (18.99ms, 46.3MB)
테스트 4 〉	통과 (18.63ms, 49.5MB)
테스트 5 〉	통과 (25.13ms, 50.2MB)
테스트 6 〉	통과 (17.57ms, 48.4MB)
테스트 7 〉	통과 (18.86ms, 49MB)
테스트 8 〉	통과 (18.58ms, 48.1MB)
테스트 9 〉	통과 (29.19ms, 46.9MB)
테스트 10 〉	통과 (18.47ms, 48.1MB)
테스트 11 〉	통과 (19.60ms, 48.3MB)
테스트 12 〉	통과 (20.11ms, 49.3MB)
테스트 13 〉	통과 (27.50ms, 47.4MB)
테스트 14 〉	통과 (19.03ms, 48.6MB)
*/