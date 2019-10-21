package level1;

import java.util.Arrays;

public class CaesarPassword {

	public static void main(String[] args) {
		//System.out.println(solution("AB", 1));
		//System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
		

	}
	
	public static String solution(String s, int n) {
		String answer = "";
		char[] sCharArr = s.toCharArray();
		for (int i = 0; i < sCharArr.length; i++) {
			answer += setCaesar(sCharArr[i], n);
		}
		return answer;
	}

	private static char setCaesar(char c, int n) {
		if(c == ' ') { // 띄어쓰기 인 경우
			
		}else if(c < 'a') { //대문자인 경우
			if( c + n > 'Z') { //소문자 범위를 넘어간 경우
				c = (char) (c+n-26);
			}else {
				c = (char) (c+n);
			}
		}else {	//소문자인 경우
			if( c + n > 'z') { //대문자 범위를 넘어간 경우
				c = (char) (c+n-26);
			}else {
				c = (char) (c+n);
			}			
		}
		
		return c;
	}

}


/*
 * 출처 :https://programmers.co.kr/learn/courses/30/lessons/12926?language=java
 * 
 * 
테스트 1 〉	통과 (27.18ms, 53.6MB)
테스트 2 〉	통과 (28.67ms, 54.8MB)
테스트 3 〉	통과 (39.73ms, 53.2MB)
테스트 4 〉	통과 (27.62ms, 55.3MB)
테스트 5 〉	통과 (28.72ms, 55MB)
테스트 6 〉	통과 (31.00ms, 53.4MB)
테스트 7 〉	통과 (27.50ms, 55MB)
테스트 8 〉	통과 (30.22ms, 55MB)
테스트 9 〉	통과 (27.06ms, 52.9MB)
테스트 10 〉	통과 (27.02ms, 55.1MB)
테스트 11 〉	통과 (27.69ms, 53.1MB)
테스트 12 〉	통과 (28.08ms, 55.5MB)
테스트 13 〉	통과 (61.95ms, 75.7MB)
 **/