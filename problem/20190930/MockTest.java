package level1;

import java.util.ArrayList;

public class MockTest {

	public static void main(String[] args) {
		solution(new int[] {1,2,3,4,5});
		solution(new int[] {1,3,2,4,2});

	}

    public static int[] solution(int[] answers) {

        int[] answersCount = new int[] {0,0,0};
        
        //1�� ��� ���� �� �������� ��Ȱ� ��
        for (int i = 0; i < answers.length; i++) {
			//1�� ������
        	if((i%5)+1 == answers[i]) answersCount[0]++;
        	
        	//2�� ������
        	if(i%2==0) {
        		if(answers[i]==2) {
        			answersCount[1]++;
        		}
        	}else {
        		if(i%8==1 && answers[i]==1 ) answersCount[1]++;
        		else if(i%8==3 && answers[i]==3 ) answersCount[1]++;
        		else if(i%8==5 && answers[i]==4 ) answersCount[1]++;
        		else if(i%8==7 && answers[i]==5 ) answersCount[1]++;
        	} 
        	
        	
        	//3�� ������
        	int temp =(i%10)/2;
        	if(temp ==0 && answers[i]==3) answersCount[2]++;
        	else if(temp ==1 && answers[i]==1) answersCount[2]++;
        	else if(temp ==2 && answers[i]==2) answersCount[2]++;
        	else if(temp ==3 && answers[i]==4) answersCount[2]++;
        	else if(temp ==4 && answers[i]==5) answersCount[2]++;

		}
       
        
        //��� �����
        int max = 0;	//���� ���� ���� ����
        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i = 0; i < answersCount.length; i++) {
        	//i+1 ��° �л��� �� ���� ���� ���
			if(answersCount[i] >max) {
				alist.clear();
				alist.add(i+1);
				max = answersCount[i];
			}
			//i+1��° �л��� ���� ���� ������
			else if(answersCount[i] ==max) {
				alist.add(i+1);
			}
		}
        int[] answer = new int[alist.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = alist.get(i);
		}
        
        return answer;
    }
}

/*
���� 
	�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. 
	�����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.
	
	1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	
	1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, 
	���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	
	���� ����
	������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
	������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
	���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
	����� ��
	answers	return
	[1,2,3,4,5]	[1]
	[1,3,2,4,2]	[1,2,3]
	����� �� ����
	����� �� #1
	
	������ 1�� ��� ������ �������ϴ�.
	������ 2�� ��� ������ Ʋ�Ƚ��ϴ�.
	������ 3�� ��� ������ Ʋ�Ƚ��ϴ�.
	���� ���� ������ ���� ���� ����� ������ 1�Դϴ�.
	
	����� �� #2
	
	��� ����� 2�������� ������ϴ�.


���
	�׽�Ʈ 1 ��	��� (1.43ms, 52.8MB)
	�׽�Ʈ 2 ��	��� (1.50ms, 51MB)
	�׽�Ʈ 3 ��	��� (1.47ms, 52.1MB)
	�׽�Ʈ 4 ��	��� (1.39ms, 52.1MB)
	�׽�Ʈ 5 ��	��� (1.47ms, 50.2MB)
	�׽�Ʈ 6 ��	��� (1.46ms, 42.5MB)
	�׽�Ʈ 7 ��	��� (1.99ms, 52.3MB)
	�׽�Ʈ 8 ��	��� (1.92ms, 54.7MB)
	�׽�Ʈ 9 ��	��� (3.01ms, 51.2MB)
	�׽�Ʈ 10 ��	��� (1.92ms, 53.2MB)
	�׽�Ʈ 11 ��	��� (2.76ms, 53.3MB)
	�׽�Ʈ 12 ��	��� (3.02ms, 53MB)
	�׽�Ʈ 13 ��	��� (1.75ms, 52.3MB)
	�׽�Ʈ 14 ��	��� (2.82ms, 53.4MB)

*/