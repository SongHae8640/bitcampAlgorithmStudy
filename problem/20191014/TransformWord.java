package level3;

import java.util.ArrayList;

public class TransformWord {

	public static void main(String[] args) {
		System.out.println(solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"}));
		System.out.println(solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log"}));

	}
	
	static int answer;
	static String sTarget;
	
    public static int solution(String begin, String target, String[] words) {
    	sTarget = target;
    	answer = Integer.MAX_VALUE;
    	ArrayList<String> aWords = new ArrayList<String>();
    	for (int i = 0; i < words.length; i++) {
			aWords.add(words[i]);
		}
    	
        dfs(begin, aWords, 0);
        
        if(answer ==Integer.MAX_VALUE) answer =0;
        return answer;
    }
    private static void dfs(String begin, ArrayList<String> words, int stepCount) {
    	
		if(sTarget.equals(begin)) {
			if(stepCount < answer) answer = stepCount;
		}
		stepCount++;
		for (int i = 0; i < words.size(); i++) {
			if(compareString(begin, words.get(i)) ==1) {
				ArrayList<String> newWords = new ArrayList<String>();
				for (int j = 0; j < words.size(); j++) {
					if(i != j) newWords.add(words.get(j));
				}
				dfs(words.get(i), newWords, stepCount);
				
			}
		}
		stepCount--;
		
	}

    //word의 각 스펠링 차이 갯수만큼 반환, 같으면 0
	private static int compareString(String begin, String word) {
		int compareCount = 0;
		char[] beginChars =begin.toCharArray();
		char[] wordChars = word.toCharArray();
		
		for (int i = 0; i < wordChars.length; i++) {
			if(wordChars[i] != beginChars[i]) compareCount++;
		}	
		return compareCount;
	}

	

}


/*
 * 출처 : https://programmers.co.kr/learn/courses/30/lessons/43163
 * */