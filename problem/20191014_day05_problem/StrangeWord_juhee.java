
import java.util.*;
public class StrangeWord {
	class Solution {
		 public String solution(String s) {
		      String answer = "";
		      int cnt= 0;
		      char ch=' ';
		      
		      for(int i=0; i<s.length(); i++){
		          if(s.charAt(i)==' '){
		              ch=s.charAt(i);
		                cnt=0;
		          }else{
		              ++cnt;
		              if(cnt%2==0){
		                ch=Character.toLowerCase(s.charAt(i));
		              }else{
		                ch = Character.toUpperCase(s.charAt(i));

		              }
		          }
		        answer+=ch;
		      }
		      
		      
		      
		      
		      return answer;
		  }
		}
}
/*lv1
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 * */
