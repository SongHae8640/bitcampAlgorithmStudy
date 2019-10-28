package level2;

import java.util.*;

public class SkillTree2 {

	public static void main(String[] args) {
		System.out.println(solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));

	}
	
	public static int solution(String skill, String[] skill_trees) {
		// ���
        int answer = 0;
        for(int i=0; i<skill_trees.length; i++)
        {
            String temp= "";
            for(int j=0; j<skill_trees[i].length(); j++)
            {
                if(skill.contains(""+ skill_trees[i].charAt(j)))
                    temp+=skill_trees[i].charAt(j);
            }
            if(skill.startsWith(temp)) //���λ� Ȯ�� �޼ҵ�
                answer++;
        }

        return answer;
    }

}

/*
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/49993#fnref1
 * 
 * 
 * 
�׽�Ʈ 1 ��	��� (1.22ms, 52.6MB)
�׽�Ʈ 2 ��	��� (1.26ms, 52.4MB)
�׽�Ʈ 3 ��	��� (1.34ms, 52.6MB)
�׽�Ʈ 4 ��	��� (1.37ms, 52.5MB)
�׽�Ʈ 5 ��	��� (1.36ms, 52.2MB)
�׽�Ʈ 6 ��	��� (1.31ms, 52.3MB)
�׽�Ʈ 7 ��	��� (1.53ms, 51.9MB)
�׽�Ʈ 8 ��	��� (1.36ms, 53.3MB)
�׽�Ʈ 9 ��	��� (1.39ms, 52.6MB)
�׽�Ʈ 10 ��	��� (1.43ms, 52.5MB)
�׽�Ʈ 11 ��	��� (1.42ms, 54MB)
�׽�Ʈ 12 ��	��� (1.53ms, 50.5MB)
�׽�Ʈ 13 ��	��� (1.45ms, 50.6MB)
�׽�Ʈ 14 ��	��� (1.42ms, 52.7MB)
 * */