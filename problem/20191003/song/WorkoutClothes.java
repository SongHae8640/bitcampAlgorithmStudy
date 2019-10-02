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
        
        //0번 n+1 번을 가상으로 만듬
        int[] student = new int[n+2];
       

        //빌려줄 수 있는 학생을 표시
        for(int idx = 0 ; idx < reserve.length ; idx++){
        	student[reserve[idx]] =1;
        }
        
        //잃어 버린 학생이 빌리기
        for (int idx = 0; idx < lost.length; idx++) {
			//여벌의 옷이 있을때
        	if(student[lost[idx]]==1) {
				student[lost[idx]] =0;
			}
        	//없을때
        	else {
				//전 번호에게 빌리기
				if(student[lost[idx]-1]==1) {
					student[lost[idx]-1]=0;
				}
				//다음 번호에게 빌리기
				else if(student[lost[idx]+1]==1) {
					student[lost[idx]+1]=0;
				}
				//빌릴 사람이 없는경우
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
