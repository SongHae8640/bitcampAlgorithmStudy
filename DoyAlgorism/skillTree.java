package DoyAlgorism;

public class skillTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };

		int answer = 0;
		int treeLength = skill_trees.length;
		for (int i = 0; i < treeLength; i++) {
			int skillIndex = 0;
			boolean flag = true;

			// skilltree 의 길이만큼 검사
			int treeIdxLength = skill_trees[i].length();
			for (int j = 0; j < treeIdxLength; j++) {

				// skill길이 만큼 검사
				int skillLength = skill.length();

				// 스킬인덱스 원소로 스킬트리 인덱스 첫번째거 검사
				for (int k = skillIndex; k < skillLength; k++) {
					System.out.println(skill.charAt(k) + "vs" + skill_trees[i].charAt(j));
					if (skill.charAt(k) == skill_trees[i].charAt(j)) {
						// 스킬인덱스와 k번째가 같은지 검사 스킬의 인덱스가 스킬트리 인덱스보다 크면안됌
						if (k > skillIndex) {
							flag = false;
							break;
						} else {
							skillIndex++;
						}

					}
				}
			}
			System.out.println("-------------------");

			if (flag == true) {
				answer++;
			}
		}
		System.out.println(answer);

	}

	// int answer = skill_trees.length;
	// int firstSkill = 0;
	// int currentskill = 0;
	//
	// for (int i = 0; i < skill_trees.length; i++) {
	// firstSkill = skill_trees[i].indexOf(skill.charAt(0));
	// System.out.println("firstSkill:"+firstSkill);
	// System.out.println(skill_trees[i]);
	//
	// for (int j = 0; j < skill.length(); j++) {
	// System.out.println(j+"번쨰");
	// System.out.println(skill_trees[i].charAt(j));
	// currentskill = skill_trees[i].indexOf(skill.charAt(j));
	// System.out.println("currentskill:"+currentskill);
	// if((firstSkill > currentskill && currentskill != -1) || (firstSkill == -1
	// && currentskill != -1)) {
	// System.out.println("answer 빠지는경우="+currentskill+":"+firstSkill);
	// //current 가 -1이 아닌데 first(스킬의 인덱스)가 current(트리의) 보다 클때
	// answer--;
	// break;
	// }
	// firstSkill = currentskill;
	// }
	// }
	// System.out.println(answer);

	//
}

// lev.2 https://programmers.co.kr/learn/courses/30/lessons/49993
// 테스트 1 〉 통과 (0.69ms, 52.2MB)
// 테스트 2 〉 통과 (0.78ms, 50.1MB)
// 테스트 3 〉 통과 (0.79ms, 50.8MB)
// 테스트 4 〉 통과 (0.91ms, 54MB)
// 테스트 5 〉 통과 (0.76ms, 52.7MB)
// 테스트 6 〉 통과 (0.80ms, 54MB)
// 테스트 7 〉 통과 (0.80ms, 52.4MB)
// 테스트 8 〉 통과 (0.75ms, 52.6MB)
// 테스트 9 〉 통과 (0.82ms, 52.5MB)
// 테스트 10 〉 통과 (0.77ms, 50.6MB)
// 테스트 11 〉 통과 (0.65ms, 50.1MB)
// 테스트 12 〉 통과 (0.99ms, 53MB)
// 테스트 13 〉 통과 (0.76ms, 54MB)
// 테스트 14 〉 통과 (0.81ms, 52.8MB)