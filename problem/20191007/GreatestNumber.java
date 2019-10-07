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

