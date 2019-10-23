package skillTree;

import java.util.HashMap;
import java.util.Map;

public class SkillTree {
	public static void main(String[] args) {
		
		String skill="CBD";
		String[] skill_trees={"UER", "CBADF", "AECB", "BDA"};
		Solution sol=new Solution();
		int result=sol.solution(skill, skill_trees);
		System.out.println(result);
		
	}
}

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        Map<Character, Integer> skill_order=new HashMap<Character, Integer>();
        for(int i=0;i<skill.length();i++){
        	skill_order.put(skill.charAt(i), i+1);
        }
        
        for(int i=0;i<skill_trees.length;i++){
        	int[] temp_skill=new int[skill_trees[i].length()];
        	int cnt=0;
        	for(int j=0;j<skill_trees[i].length();j++){
        		if(skill_order.containsKey(skill_trees[i].charAt(j))){
        			temp_skill[cnt]=skill_order.get(skill_trees[i].charAt(j));
        			cnt++;
        		}
        	}
        	
        	if(cnt==0)cnt=1;
        	
        	int[] comp=new int[cnt];
        	for(int k=0;k<cnt;k++){
        		comp[k]=temp_skill[k];
        	}
        	
        	if(comp[0]==0){
        		answer++;
        		continue;
        	}
        	
        	if(comp[0]==1){
	        	int count=1;
		        for(int k=1;k<cnt;k++){
		        	if(comp[k]==comp[k-1]+1){
		        		count++;
		        	}else{
		        		break;
		        	}
		        }
		        if(count==comp.length)answer++;
        	}
        }
        
        
        return answer;
    }
    
    
}


--------------------------------------------------
테스트 1 〉	통과 (0.99ms, 50.4MB)
테스트 2 〉	통과 (1.13ms, 52.3MB)
테스트 3 〉	통과 (1.16ms, 53.2MB)
테스트 4 〉	통과 (1.08ms, 52.7MB)
테스트 5 〉	통과 (1.05ms, 50.2MB)
테스트 6 〉	통과 (1.09ms, 54.2MB)
테스트 7 〉	통과 (0.91ms, 50.1MB)
테스트 8 〉	통과 (0.95ms, 50.6MB)
테스트 9 〉	통과 (1.07ms, 52.7MB)
테스트 10 〉	통과 (1.09ms, 52.3MB)
테스트 11 〉	통과 (1.06ms, 53.1MB)
테스트 12 〉	통과 (1.13ms, 52.8MB)
테스트 13 〉	통과 (0.88ms, 52.3MB)
테스트 14 〉	통과 (1.02ms, 50.9MB)
