package javapro;
import java.util.*;

class StrangeWord{
	public static void main(String[] args){
		String s = "try hello world aaaaaa aaaaaa";
		
		System.out.println(solution(s));
	}	
	 public static String solution(String s) {
         String answer ="";
         String[] word = s.split("",-1);
         for(int i=0;i<word.length;i++){
        	 System.out.println(word[i]);
         }
         //t,r,y, ,h,e,l,l,o, ,w,o,r,l,d(공백포함)
         int cnt=0;
         for(int i=0;i<word.length;i++){
             if(word[i].equals(" ")){
                 cnt=0;
             }else{
                 cnt+=1;
             }
             
             if(cnt%2==0){
                // word[i] = word[i].replace(word[i],word[i].toLowerCase());
            	 word[i] = word[i].toLowerCase();
             }else{
                 //word[i] = word[i].replace(word[i],word[i].toUpperCase());
            	 word[i] = word[i].toUpperCase();
             }
             answer += word[i];
         }
         System.out.println(answer);
         return answer;
	  } 
}

/*lv1
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 * 통과 (29.02ms, 55.2MB)
테스트 1 〉	통과 (31.26ms, 53MB)
테스트 2 〉	통과 (29.88ms, 55.5MB)
테스트 3 〉	통과 (27.65ms, 55.9MB)
테스트 4 〉	통과 (30.19ms, 55MB)
테스트 5 〉	통과 (29.54ms, 55.4MB)
테스트 6 〉	통과 (29.29ms, 53.4MB)
테스트 7 〉	통과 (31.75ms, 53.3MB)
테스트 8 〉	통과 (30.29ms, 53.2MB)
테스트 9 〉	통과 (29.64ms, 53.6MB)
테스트 10 〉	통과 (39.22ms, 53MB)
테스트 11 〉	통과 (35.54ms, 55MB)
테스트 12 〉	통과 (31.80ms, 55.8MB)
테스트 13 〉	통과 (30.70ms, 53.2MB)
테스트 14 〉	통과 (29.70ms, 57.3MB)
테스트 15 〉	통과 (29.63ms, 55.3MB)
테스트 16 〉	통과 (29.51ms, 54.9MB)*/
