package level1;

class Solution {
  public String solution(String s, int n) {
      String answer = "";
		char[] sCharArr = s.toCharArray();
		for (int i = 0; i < sCharArr.length; i++) {
			if(sCharArr[i] == ' ') { // 띄어쓰기 인 경우
				
			}else if(sCharArr[i] < 'a') { //대문자인 경우
				if( sCharArr[i] + n > 'Z') { //소문자 범위를 넘어간 경우
					sCharArr[i] = (char) (sCharArr[i]+n-26);
				}else {
					sCharArr[i] = (char) (sCharArr[i]+n);
				}
			}else {	//소문자인 경우
				if( sCharArr[i] + n > 'z') { //대문자 범위를 넘어간 경우
					sCharArr[i] = (char) (sCharArr[i]+n-26);
				}else {
					sCharArr[i] = (char) (sCharArr[i]+n);
				}			
			}
			answer += sCharArr[i];
		}
		return answer;
	}
}


/*
 * 
 * 함수를 사용하지 않으니까 좀 더 빠름
테스트 1 〉	통과 (26.33ms, 53.8MB)
테스트 2 〉	통과 (30.07ms, 53.5MB)
테스트 3 〉	통과 (26.13ms, 55.2MB)
테스트 4 〉	통과 (27.07ms, 55.1MB)
테스트 5 〉	통과 (27.42ms, 55.4MB)
테스트 6 〉	통과 (29.01ms, 53.9MB)
테스트 7 〉	통과 (27.91ms, 55MB)
테스트 8 〉	통과 (26.96ms, 55MB)
테스트 9 〉	통과 (25.72ms, 51.6MB)
테스트 10 〉	통과 (26.64ms, 55.4MB)
테스트 11 〉	통과 (27.21ms, 55.6MB)
테스트 12 〉	통과 (26.27ms, 53.4MB)
테스트 13 〉	통과 (55.90ms, 77.3MB) 
 */
