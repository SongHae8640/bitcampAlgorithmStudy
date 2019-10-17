package level1;

public class StrangeWord {

	public String solution(String s) {
		String answer = "";
		char tempChar;
		int wordIdx = 0;
		for (int i = 0; i < s.length(); i++) {
			tempChar = s.charAt(i);
            
            //공백이 나온경우 이후 문자는 새로운 단어
			if(tempChar ==' '){
				answer +=" ";
				wordIdx = 0;
			}else if(wordIdx %2 ==0){   //해당 단어의 index가 짝수인 경우
				answer +=Character.toUpperCase(tempChar);
				wordIdx++;
			}else{  //해당 단어의 index가 홀수인 경우
				answer +=Character.toLowerCase(tempChar);
				wordIdx++;
			}
		}
		return answer;
	}

}
