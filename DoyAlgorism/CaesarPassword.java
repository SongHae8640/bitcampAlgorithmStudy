package DoyAlgorism;

public class CaesarPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("a B  z", 4);

	}

	public static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (Character.isUpperCase(ch)) {
				if ((char)(ch+n) > 'Z') {
					answer += (char) (64 + n - (90 - ch));
				} else {
					answer += (char) (ch + n);
				}
			} else if (Character.isLowerCase(ch)) {
				if ((char)(ch+n) > 'z') {
					answer += (char) (96 + n - (122 - ch));
				} else {
					answer += (char) (ch + n);
				}
			} else if (s.charAt(i) == 32) {
				answer += s.charAt(i);
			}
		}

		System.out.println(answer);
		return answer;
	}

}

// for (int i = 0; i < s.length(); i++) {
// char ch=s.charAt(i);
// if(Character.isLowerCase(ch)){
// //범위인 26을 넘으면 26으로 남은 나머지 만큼 a에서 더하면 됌
// ch=(char)((ch+n%26-'a')%26+'a');
// }else if(Character.isUpperCase(ch)){
// //범위인 26을 넘으면 26으로 남은 나머지 만큼 A에서 더하면 됌
// ch=(char)((ch+n%26-'A')%26+'A');
// }
// answer+=ch;
// }

/*
 * ��ó :https://programmers.co.kr/learn/courses/30/lessons/12926?language=java
 * 
 * 
 * 테스트 1 〉	통과 (34.26ms, 54.7MB)
테스트 2 〉	통과 (35.87ms, 52.8MB)
테스트 3 〉	통과 (32.91ms, 55.2MB)
테스트 4 〉	통과 (27.21ms, 52.8MB)
테스트 5 〉	통과 (28.72ms, 54.7MB)
테스트 6 〉	통과 (27.14ms, 52.9MB)
테스트 7 〉	통과 (30.76ms, 52.5MB)
테스트 8 〉	통과 (27.46ms, 55.5MB)
테스트 9 〉	통과 (26.61ms, 53.3MB)
테스트 10 〉	통과 (27.62ms, 53.6MB)
테스트 11 〉	통과 (28.81ms, 53.5MB)
테스트 12 〉	통과 (28.10ms, 51.4MB)
테스트 13 〉	통과 (56.27ms, 74.8MB)
 **/