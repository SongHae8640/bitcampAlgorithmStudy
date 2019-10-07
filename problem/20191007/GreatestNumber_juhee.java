import java.util.*;

public class GreatestNumber_juhee {
	public String solution(int[] numbers) {
        String answer = "";
       
        String[] arr = new String[numbers.length];
        
        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.toString(numbers[i]);
        }
        
        Arrays.sort(arr, new comp());
        
        for(int i=0; i<arr.length; i++){
            answer+= arr[i];
        }
        
        if(answer.charAt(0)=='0'){
            answer="0";
        }
        
        return answer;
    }

}

class comp implements Comparator<String>{
public int compare(String s1, String s2){
    return (s2+s1).compareTo(s1+s2);
}
}

/* Lv2
https://programmers.co.kr/learn/courses/30/lessons/42746
*/
