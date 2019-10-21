package tiling;

import java.math.BigInteger;

public class Tiling {

	public static void main(String[] args) {

		Solution sol=new Solution();
		int n=60000;
		int result=sol.solution(n);
		System.out.println(result);
	}

}

class Solution {
	  public int solution(int n) {
	      int answer = 0;
	      
	      BigInteger sum = BigInteger.ZERO;

	    	  for(int i=0;i<=n/2;i++){
	    		  int k=n-(2*i);
	    		  if(i==0 || k==0 ||k==1){
	    			  sum = sum.add(BigInteger.valueOf(1));  
	    		  }else if(i==1){
	    			  sum = sum.add(BigInteger.valueOf(k+1));
	    		  }else{
	    			  BigInteger kMul=BigInteger.ZERO;
	    			  for(int j=k+1;j>0;j--){
	    				  kMul = kMul.add(BigInteger.valueOf(j));
	    			  }
	    			  sum=sum.add(kMul);
	    		  }
	    	  }

	      answer=sum.mod(new BigInteger("1000000007")).intValue();
	      return answer;
	  }
	}
