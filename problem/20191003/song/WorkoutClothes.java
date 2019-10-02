package level1;

import java.util.Arrays;

public class WorkoutClothes {

	public static void main(String[] args) {

		System.out.println(solution(5, new int[]{2, 4}, new int[] {1, 3, 5}));
		System.out.println(solution(5, new int[]{2, 4}, new int[] {3}));
		System.out.println(solution(3, new int[]{3}, new int[] {1}));
		
	}
	
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        //0�� n+1 ���� �������� ����
        int[] student = new int[n+2];
       

        //������ �� �ִ� �л��� ǥ��
        for(int idx = 0 ; idx < reserve.length ; idx++){
        	student[reserve[idx]] =1;
        }
        
        //�Ҿ� ���� �л��� ������
        for (int idx = 0; idx < lost.length; idx++) {
			//������ ���� ������
        	if(student[lost[idx]]==1) {
				student[lost[idx]] =0;
			}
        	//������
        	else {
				//�� ��ȣ���� ������
				if(student[lost[idx]-1]==1) {
					student[lost[idx]-1]=0;
				}
				//���� ��ȣ���� ������
				else if(student[lost[idx]+1]==1) {
					student[lost[idx]+1]=0;
				}
				//���� ����� ���°��
				else {
					student[lost[idx]]=-1;
				}
			}
		}
        
        for(int idx=1 ; idx <student.length-1; idx++) {
        	if(student[idx]!=-1) {
        		answer++;        		
        	}
        }
        
        System.out.println(Arrays.toString(student));
        return answer;
    }

}
