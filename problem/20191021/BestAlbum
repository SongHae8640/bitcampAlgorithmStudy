package bestAlbum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BestAlbum {

	public static void main(String[] args) {
		String[] genres={"classic", "pop", "classic", "classic", "pop"};
		int[] plays={600, 600, 150, 600, 2500};
		
		Solution sol=new Solution();
		int[] result=sol.solution(genres, plays);
		
		for(int i=0;i<result.length;i++){
        	System.out.print(result[i]);
        }
	}

}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        Map<String, Integer> totPlays=new HashMap<String, Integer>();
        Map<String,Integer> map=new HashMap<String, Integer>();
        
        for(int i=0;i<genres.length;i++){
        	if(!totPlays.containsKey(genres[i])){
        		totPlays.put(genres[i], plays[i]);
        	}else{
        		totPlays.put(genres[i], totPlays.get(genres[i])+plays[i]);
        	}
        	map.put(genres[i]+","+i, plays[i]);
        }
        
        Map<String, Integer> newPlaysMap=sortByValue(totPlays);
        Map<String, Integer> newMap=sortByValue(map);
        
        List<Integer> tmpList=new ArrayList<Integer>();
        for(String genre:newPlaysMap.keySet()){
        	int cnt=0;
        	int[] tmpInt=null;
        	String comparedA="";
        	String comparedB="";
        	
        	for(String song:newMap.keySet()){
        		if(cnt>1)break;
        		String[] tmpArr=song.split(",");
        		if(tmpArr[0].equals(genre)){
        			if(cnt==0){
	        			tmpInt=new int[cnt+1];
	        			tmpInt[cnt]=Integer.parseInt(tmpArr[1]);
        			}else if(cnt==1){
        				int temp=tmpInt[0];
        				
        				tmpInt=new int[cnt+1];
        				tmpInt[0]=temp;
        				tmpInt[cnt]=Integer.parseInt(tmpArr[1]);
        			}
        			cnt++;
        			if("".equals(comparedA)){
        				comparedA=song;
        			}else{
        				comparedB=song;
        			}
        		}
        	}
        	
        	if(tmpInt.length==2){
        		if((int)newMap.get(comparedA)==(int)newMap.get(comparedB)){
	        		if(tmpInt[0]>tmpInt[1]){
	        			int temp=tmpInt[0];
	        			tmpInt[0]=tmpInt[1];
	        			tmpInt[1]=temp;
	        		}
        		}
        	}
        	
        	for(int i=0;i<tmpInt.length;i++){
        		tmpList.add(tmpInt[i]);
        	}
        	
        }

        answer=new int[tmpList.size()];
        for(int i=0;i<tmpList.size();i++){
        	answer[i]=tmpList.get(i);
        }
        
        return answer;
    }
    
    //HashMap sort
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());
        Collections.reverse(list);
        
        Map<K, V> result = new LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        
        return result;
    }
}

-----------------------------------------------------------
테스트 1 〉	통과 (26.94ms, 52.9MB)
테스트 2 〉	통과 (26.85ms, 55.1MB)
테스트 3 〉	통과 (27.07ms, 54.5MB)
테스트 4 〉	통과 (26.81ms, 54.5MB)
테스트 5 〉	통과 (28.71ms, 54.6MB)
테스트 6 〉	통과 (28.23ms, 54.7MB)
테스트 7 〉	통과 (26.62ms, 52.8MB)
테스트 8 〉	통과 (24.89ms, 53MB)
테스트 9 〉	통과 (25.29ms, 54.5MB)
테스트 10 〉	통과 (30.25ms, 52.6MB)
테스트 11 〉	통과 (27.12ms, 54.4MB)
테스트 12 〉	통과 (26.92ms, 54.4MB)
테스트 13 〉	통과 (28.41ms, 54.4MB)
테스트 14 〉	통과 (28.31ms, 54.4MB)
테스트 15 〉	통과 (29.07ms, 54.9MB)
