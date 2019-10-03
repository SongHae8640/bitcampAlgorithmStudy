package javapro;

import java.util.*;

public class WorkoutClothes_seung {

	 public int solution(int n, int[] lost, int[] reserve) {
	        int answer = 0;
	        int getCloth_stu = 0;
	        int hasCloth_stu = n-lost.length;
	        
	        // 도난당한 사람이 여분소지자->더이상 빌려줄수없다
	        for(int i=0; i<lost.length; i++) {
	            for(int j=0; j<reserve.length; j++) {
	                if(lost[i]==reserve[j]) {
	                    hasCloth_stu++;
	                    lost[i] = -1;//번호제외시키기위해 음수를
	                    reserve[j] = -1;
	                    break;
	                }
	            }
	        }
	        
	        //여분빌려준 여분소지자->더이상 빌려줄수없다
	        for(int i=0; i<lost.length; i++) {
	            for(int j=0; j<reserve.length; j++) {
	                if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
	                    getCloth_stu++;
	                    reserve[j] = -1;//이제못빌려준다
	                    break;
	                }
	            }
	        }
	        answer = hasCloth_stu + getCloth_stu;
	        
	        return answer;
	    }


}

/*https://programmers.co.kr/learn/courses/30/lessons/42862
 * 체육복 lv1
 */
