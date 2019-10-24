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
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/49993#fnref1
 * 
 * Ǯ�� ���� : https://javaking75.blog.me/220491298440(���Խ�)
 * [^abc] a, b, c �� ����͵� �ƴ�
 * 
�׽�Ʈ 1 ��	��� (18.49ms, 49.3MB)
�׽�Ʈ 2 ��	��� (19.67ms, 46MB)
�׽�Ʈ 3 ��	��� (18.99ms, 46.3MB)
�׽�Ʈ 4 ��	��� (18.63ms, 49.5MB)
�׽�Ʈ 5 ��	��� (25.13ms, 50.2MB)
�׽�Ʈ 6 ��	��� (17.57ms, 48.4MB)
�׽�Ʈ 7 ��	��� (18.86ms, 49MB)
�׽�Ʈ 8 ��	��� (18.58ms, 48.1MB)
�׽�Ʈ 9 ��	��� (29.19ms, 46.9MB)
�׽�Ʈ 10 ��	��� (18.47ms, 48.1MB)
�׽�Ʈ 11 ��	��� (19.60ms, 48.3MB)
�׽�Ʈ 12 ��	��� (20.11ms, 49.3MB)
�׽�Ʈ 13 ��	��� (27.50ms, 47.4MB)
�׽�Ʈ 14 ��	��� (19.03ms, 48.6MB)
*/