package javapro;

import java.util.*;

public class WorkoutClothes_seung {

	 public int solution(int n, int[] lost, int[] reserve) {
	        int answer = 0;
	        int getCloth_stu = 0;
	        int hasCloth_stu = n-lost.length;
	        
	        // �������� ����� ���м�����->���̻� �����ټ�����
	        for(int i=0; i<lost.length; i++) {
	            for(int j=0; j<reserve.length; j++) {
	                if(lost[i]==reserve[j]) {
	                    hasCloth_stu++;
	                    lost[i] = -1;//��ȣ���ܽ�Ű������ ������
	                    reserve[j] = -1;
	                    break;
	                }
	            }
	        }
	        
	        //���к����� ���м�����->���̻� �����ټ�����
	        for(int i=0; i<lost.length; i++) {
	            for(int j=0; j<reserve.length; j++) {
	                if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
	                    getCloth_stu++;
	                    reserve[j] = -1;//�����������ش�
	                    break;
	                }
	            }
	        }
	        answer = hasCloth_stu + getCloth_stu;
	        
	        return answer;
	    }


}

/*https://programmers.co.kr/learn/courses/30/lessons/42862
 * ü���� lv1
 */
