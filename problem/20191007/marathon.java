package marathon;

import java.util.HashMap;
import java.util.Map;

public class Marathon {

	public static void main(String[] args) {
	//	String[] participant={"marina", "josipa", "nikola", "vinko", "filipa"};
	//	String[] completion={"josipa", "filipa", "marina", "nikola"};
		
		String[] participant={"mislav", "stanko", "mislav", "ana"};
		String[] completion={"stanko", "ana", "mislav"};
		
		Solution sol=new Solution();
		String result=sol.solution(participant, completion);
		System.out.println(result);
		
	}

}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        //전체참가자+완주자
        Map<String,Integer> map=new HashMap<String, Integer>();
        
        for(int i=0;i<completion.length;i++){
        	////전체참가자+완주자 맵 중복체크
        	if(!map.containsKey(participant[i])){
        		map.put(participant[i], 1);
        	}else{
        		map.put(participant[i], map.get(participant[i])+1);
        	}
        	
        	if(!map.containsKey(completion[i])){
        		map.put(completion[i], 1);
        	}else{
        		map.put(completion[i], map.get(completion[i])+1);
        	}
        	
        }
        	//전체 참가자수+1=완주자 수 이므로 마지막 배열로 맵에 넣어준다.
        if(!map.containsKey(participant[participant.length-1])){
        	map.put(participant[participant.length-1], 1);
    	}else{
    		map.put(participant[participant.length-1], map.get(participant[participant.length-1])+1);
    	}
        
        for(String str:map.keySet()){
        	if(map.get(str)%2!=0){
        		answer=str;
        		break;
        	}
        }
        	
        return answer;
    }
}
