package level1;

public class StrangeWord {

	public String solution(String s) {
		String answer = "";
		char tempChar;
		int wordIdx = 0;
		for (int i = 0; i < s.length(); i++) {
			tempChar = s.charAt(i);
            
            //������ ���°�� ���� ���ڴ� ���ο� �ܾ�
			if(tempChar ==' '){
				answer +=" ";
				wordIdx = 0;
			}else if(wordIdx %2 ==0){   //�ش� �ܾ��� index�� ¦���� ���
				answer +=Character.toUpperCase(tempChar);
				wordIdx++;
			}else{  //�ش� �ܾ��� index�� Ȧ���� ���
				answer +=Character.toLowerCase(tempChar);
				wordIdx++;
			}
		}
		return answer;
	}

}
