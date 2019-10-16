package DoyAlgorism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day4algorism1 {

	private static int answer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String begin = "hit";
		String target = "cog";
		String[] words = { "hot", "dot", "dog", "lot", "log", "cog" };
		// 1,1,1,1,1,1
		// 1,1,2,1,1,2
		List<String> wordList = new ArrayList<String>();
//		int cnt = 0;
		int targetCnt=0;
		
		
		for(int i=0;i<words.length;i++){
            wordList.add(words[i]);
        }
		int cnt=0;
		for (int i = 0; i < wordList.size(); i++) {
			char[] compare = wordList.get(i).toCharArray();
			System.out.println(compare);
			int temp=cnt;
			for (int j = 0; j < begin.length(); j++) {
//				System.out.println(target.charAt(j) + ":" + words[i].charAt(j));
				if (target.charAt(j) == words[i].charAt(j)) {
					cnt++;
				}
			}
			System.out.println(cnt);
			System.out.println(temp);
		}

		System.out.println(wordList);
		
		boolean[] v=new boolean[words.length + 1];
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		
		//이거는 진짜 모르겟다.
	}

}
