package caesarPassword;


public class CaesarPassword {

	public static void main(String[] args) {
		
		Solution sol=new Solution();
		
		//test1
//		String s="AB";
//		int n=1;
		
		//test2
		String s="z";
		int n=1;
//		
//		//test3
//		String s="a B z";
//		int n=4;
		
		String result=sol.solution(s, n);
		System.out.println(result);
	}

}

class Solution {
	  public String solution(String s, int n) {
	      String answer = "";
	      
	      char[] q=new char[s.length()];
	      for(int i=0;i<s.length();i++){
	    	  
	    		  //대문자
	    		  if(s.charAt(i)>=65&&s.charAt(i)<=90){
	    			  
	    			  if(s.charAt(i)+n>90){
	    				  int tmp=(s.charAt(i)+n)-90;
	    				  q[i]=(char)(64+tmp);
	    			  }else{
	    				  q[i]=(char)(s.charAt(i)+n);
	    			  }
	    			  
	    		  //소문자
	    		  }else if(s.charAt(i)>=97&&s.charAt(i)<=122){
	    			  if(s.charAt(i)+n>122){
	    				  int tmp=(s.charAt(i)+n)-122;
	    				  q[i]=(char)(96+tmp);
	    			  }else{
	    				  q[i]=(char)(s.charAt(i)+n);
	    			  }
	    			  
	    		  //나머지 공백..	  
	    		  }else{
	    			  q[i]=s.charAt(i);
	    		  }
	    		  
	      }
	      
	      for(int i=0;i<q.length;i++){
	    	  answer+=q[i];
	      }
	      
	      return answer;
	  }
	}
  
  --------------------------------------------------
  테스트 1 〉	통과 (26.96ms, 54.8MB)
테스트 2 〉	통과 (26.90ms, 55.4MB)
테스트 3 〉	통과 (29.43ms, 55.6MB)
테스트 4 〉	통과 (27.16ms, 55MB)
테스트 5 〉	통과 (27.45ms, 53.2MB)
테스트 6 〉	통과 (27.53ms, 55.4MB)
테스트 7 〉	통과 (27.85ms, 55.3MB)
테스트 8 〉	통과 (28.07ms, 55.4MB)
테스트 9 〉	통과 (27.30ms, 55.4MB)
테스트 10 〉	통과 (29.01ms, 55MB)
테스트 11 〉	통과 (28.14ms, 53.5MB)
테스트 12 〉	통과 (28.16ms, 53.4MB)
테스트 13 〉	통과 (55.01ms, 77.6MB)
