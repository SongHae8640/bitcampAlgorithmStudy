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
		if(c == ' ') { // ���� �� ���
			
		}else if(c < 'a') { //�빮���� ���
			if( c + n > 'Z') { //�ҹ��� ������ �Ѿ ���
				c = (char) (c+n-26);
			}else {
				c = (char) (c+n);
			}
		}else {	//�ҹ����� ���
			if( c + n > 'z') { //�빮�� ������ �Ѿ ���
				c = (char) (c+n-26);
			}else {
				c = (char) (c+n);
			}			
		}
		
		return c;
	}

}


/*
 * ��ó :https://programmers.co.kr/learn/courses/30/lessons/12926?language=java
 * 
 * 
�׽�Ʈ 1 ��	��� (27.18ms, 53.6MB)
�׽�Ʈ 2 ��	��� (28.67ms, 54.8MB)
�׽�Ʈ 3 ��	��� (39.73ms, 53.2MB)
�׽�Ʈ 4 ��	��� (27.62ms, 55.3MB)
�׽�Ʈ 5 ��	��� (28.72ms, 55MB)
�׽�Ʈ 6 ��	��� (31.00ms, 53.4MB)
�׽�Ʈ 7 ��	��� (27.50ms, 55MB)
�׽�Ʈ 8 ��	��� (30.22ms, 55MB)
�׽�Ʈ 9 ��	��� (27.06ms, 52.9MB)
�׽�Ʈ 10 ��	��� (27.02ms, 55.1MB)
�׽�Ʈ 11 ��	��� (27.69ms, 53.1MB)
�׽�Ʈ 12 ��	��� (28.08ms, 55.5MB)
�׽�Ʈ 13 ��	��� (61.95ms, 75.7MB)
 **/