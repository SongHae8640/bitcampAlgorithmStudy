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
         //t,r,y, ,h,e,l,l,o, ,w,o,r,l,d(��������)
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
 * ��� (29.02ms, 55.2MB)
�׽�Ʈ 1 ��	��� (31.26ms, 53MB)
�׽�Ʈ 2 ��	��� (29.88ms, 55.5MB)
�׽�Ʈ 3 ��	��� (27.65ms, 55.9MB)
�׽�Ʈ 4 ��	��� (30.19ms, 55MB)
�׽�Ʈ 5 ��	��� (29.54ms, 55.4MB)
�׽�Ʈ 6 ��	��� (29.29ms, 53.4MB)
�׽�Ʈ 7 ��	��� (31.75ms, 53.3MB)
�׽�Ʈ 8 ��	��� (30.29ms, 53.2MB)
�׽�Ʈ 9 ��	��� (29.64ms, 53.6MB)
�׽�Ʈ 10 ��	��� (39.22ms, 53MB)
�׽�Ʈ 11 ��	��� (35.54ms, 55MB)
�׽�Ʈ 12 ��	��� (31.80ms, 55.8MB)
�׽�Ʈ 13 ��	��� (30.70ms, 53.2MB)
�׽�Ʈ 14 ��	��� (29.70ms, 57.3MB)
�׽�Ʈ 15 ��	��� (29.63ms, 55.3MB)
�׽�Ʈ 16 ��	��� (29.51ms, 54.9MB)*/
