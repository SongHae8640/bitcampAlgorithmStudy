package level1;

class Solution {
  public String solution(String s, int n) {
      String answer = "";
		char[] sCharArr = s.toCharArray();
		for (int i = 0; i < sCharArr.length; i++) {
			if(sCharArr[i] == ' ') { // ���� �� ���
				
			}else if(sCharArr[i] < 'a') { //�빮���� ���
				if( sCharArr[i] + n > 'Z') { //�ҹ��� ������ �Ѿ ���
					sCharArr[i] = (char) (sCharArr[i]+n-26);
				}else {
					sCharArr[i] = (char) (sCharArr[i]+n);
				}
			}else {	//�ҹ����� ���
				if( sCharArr[i] + n > 'z') { //�빮�� ������ �Ѿ ���
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
 * �Լ��� ������� �����ϱ� �� �� ����
�׽�Ʈ 1 ��	��� (26.33ms, 53.8MB)
�׽�Ʈ 2 ��	��� (30.07ms, 53.5MB)
�׽�Ʈ 3 ��	��� (26.13ms, 55.2MB)
�׽�Ʈ 4 ��	��� (27.07ms, 55.1MB)
�׽�Ʈ 5 ��	��� (27.42ms, 55.4MB)
�׽�Ʈ 6 ��	��� (29.01ms, 53.9MB)
�׽�Ʈ 7 ��	��� (27.91ms, 55MB)
�׽�Ʈ 8 ��	��� (26.96ms, 55MB)
�׽�Ʈ 9 ��	��� (25.72ms, 51.6MB)
�׽�Ʈ 10 ��	��� (26.64ms, 55.4MB)
�׽�Ʈ 11 ��	��� (27.21ms, 55.6MB)
�׽�Ʈ 12 ��	��� (26.27ms, 53.4MB)
�׽�Ʈ 13 ��	��� (55.90ms, 77.3MB) 
 */
