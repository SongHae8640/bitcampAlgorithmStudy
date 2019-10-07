import java.util.*;
public class Marathon_juhee {
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int idx = 0;
        
        for(int i=0; i<completion.length; i++){
            if(!completion[i].equals(participant[idx])){
                answer=participant[idx];
                break;
            }
            
            idx++;
        }
        
        if(answer.equals("")){
		      answer = participant[participant.length-1];
		 }
        
        return answer;
        
    }

	
}


/*Lv 1
 https://programmers.co.kr/learn/courses/30/lessons/42576
 */