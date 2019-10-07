package GreatestNumber;

import java.util.Arrays;
import java.util.Comparator;

public class GreatestNumber {

	public static void main(String[] args) {

//		int[] numbers={6, 10, 2};
		int[] numbers={3, 30, 34, 5, 9};
		Solution sol=new Solution();
		String result=sol.solution(numbers);
		System.out.println(result);
		
	}

}

class Solution{
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] strArr=new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
        	strArr[i]=String.valueOf(numbers[i]);
        }
        
        
        Arrays.sort(strArr, new Comparator<String>(){
            public int compare(String num1,String num2){
                return Integer.parseInt(num2+num1)-Integer.parseInt(num1+num2);
            }
        });
        
        /*
        for(int i=0;i<strArr.length-1;i++){
        	for(int j=i+1;j<strArr.length;j++){
        		String tmp="";
        		String num1=strArr[i];
        		String num2=strArr[j];
        		
        		if(Integer.parseInt(num1+num2)-Integer.parseInt(num2+num1)<0){
        			tmp=strArr[i];
        			strArr[i]=strArr[j];
        			strArr[j]=tmp;
        		}
        	}
        }
        */
        for(int i=0;i<strArr.length;i++){
        	answer+=strArr[i];
        }
        if(answer.charAt(0)=='0'){
        	answer="0";
        }
        
        return answer;
    }
}



테스트 1 〉	통과 (1981.67ms, 362MB)
테스트 2 〉	통과 (719.98ms, 360MB)
테스트 3 〉	통과 (3181.27ms, 366MB)
테스트 4 〉	통과 (76.97ms, 63.2MB)
테스트 5 〉	통과 (1617.21ms, 363MB)
테스트 6 〉	통과 (1308.78ms, 363MB)
테스트 7 〉	통과 (30.58ms, 55.1MB)
테스트 8 〉	통과 (31.76ms, 55.8MB)
테스트 9 〉	통과 (31.93ms, 55.5MB)
테스트 10 〉 통과 (29.93ms, 54MB)
테스트 11 〉 통과 (31.23ms, 53.4MB)
	
	
-----------------------------------------------------------
	
선택정렬
테스트 1 〉	실패 (시간 초과)
테스트 2 〉	실패 (시간 초과)
테스트 3 〉	실패 (시간 초과)
테스트 4 〉	통과 (268.69ms, 124MB)
테스트 5 〉	실패 (시간 초과)
테스트 6 〉	실패 (시간 초과)
테스트 7 〉	통과 (46.65ms, 55.4MB)
테스트 8 〉	통과 (30.31ms, 55.1MB)
테스트 9 〉	통과 (28.88ms, 55.1MB)
테스트 10 〉 통과 (29.96ms, 53.6MB)
테스트 11 〉 통과 (40.47ms, 53.3MB)
	
	
