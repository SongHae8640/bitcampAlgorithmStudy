package javapro;
import java.util.*;

public class GreatestNumber {
	class Solution {
	    public String solution(int[] numbers) {
	        
	        String[] num = new String[numbers.length];
	        for(int i = 0; i < numbers.length; i ++) {
	            num[i] = String.valueOf(numbers[i]);
	        }
	        
	        Arrays.sort(num, new Comparator<String>() {
	            @Override
	            public int compare(String s1, String s2) {
	                return (s2 + s1).compareTo(s1 + s2);
	            }
	        });
	        
	        if (num[0].equals("0")) {
	        	return "0";
	        }
	        
	        String answer = "";
	        for(String num2:num) {
	            answer += num2;
	        }
	        
	        return answer;
	    }
	}
}
//시간이 1000을 넘어가네...