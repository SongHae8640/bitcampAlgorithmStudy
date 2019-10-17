package javapro;
import java.util.*;

class StrangeWord{
	public static void main(String[] args){
		String s = "try hello world";
	}	
	 public String solution(String s) {
         String answer ="";
         String[] word = s.split("");
         //t,r,y, ,h,e,l,l,o, ,w,o,r,l,d(공백포함)
         int cnt=0;
         for(int i=0;i<word.length;i++){
             if(word[i]==" "){
                 cnt=0;
             }else{
                 cnt+=1;
             }
             
             if(cnt%2==0){
                 word[i] = word[i].replace(word[i],word[i].toLowerCase());
             }else{
                 word[i] = word[i].replace(word[i],word[i].toUpperCase());
             }
             answer += word[i];
         }
         System.out.println(answer);
         return answer;
	  } 
}

/*lv1
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 * */
