package javapro;
import java.util.*;
public class WordChange {

	
	class Solution {
	       public int solution(String begin, String target, String[] words) {
	        int answer = 0;
	 
	        List<String> wordsList = new ArrayList<String>();
	        for(int i=0;i<words.length;i++){
	            wordsList.add(words[i]);
	        }
	        answer = trans(begin,target,wordsList,0);
	        return answer;
	       }
	    
	    public int trans(String  begin, String target, List<String> wordsList, int count1){
	        char[] begin_word = begin.toCharArray();
	        char[] target_word = target.toCharArray();
	        
	        for(int i=0;i<wordsList.size();i++){
	            int count=0;
	            int target_count = 0;
	            
	            char[] list_word = wordsList.get(i).toCharArray();
	            for(int j=0;j<begin_word.length;j++){
	                if(begin_word[j]==list_word[j]){
	                    count++;
	                }
	                if(begin_word[j]==target_word[j]){
	                    target_count++;
	                }
	            }
	            //1 compare
	            if(target_count==begin_word.length-1){
	                return count1++;
	            }
	            if(count==begin_word.length-1){
	                begin = wordsList.get(i);
	                count1++;
	                wordsList.remove(i);
	                return trans(begin, target, wordsList, count1);
	            }
	        }
	        return 0;
	    } 
	}
	
}
//테스트2번 통과x