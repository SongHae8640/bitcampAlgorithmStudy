package targetNumber;

public class TargetNumber {

	public static void main(String[] args) {
		int[] numbers={1, 1, 1, 1, 1};
		int target=3;
		
		Solution sol=new Solution();
		int result=sol.solution(numbers, target);
		System.out.println(result);
	}

}

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        //calStore 1 : + , 0 : -
        int length=numbers.length;
        char[] calStore=new char[length];
        String calcul="";
        for(int i=0;i<calStore.length;i++){
        	calStore[i]='0';
        	calcul+='0';
        }
        
        while(calcul.length()==length){
        	int idx=0;
        	int sum=dfs(idx, 0, calStore, numbers);
        	if(sum==target)answer++;
        	
        	String binary=Integer.toBinaryString((Integer.parseInt(calcul,2))+1);
        	calcul="";
        	
        	int tmp=length-binary.length();
        	for(int i=0;i<tmp;i++){
        		calcul+="0";
        	}
        	calcul+=binary;
        	if(calcul.length()>length)break;
        	
        	for(int i=0;i<calStore.length;i++){
        		calStore[i]=calcul.charAt(i);
        	}
        }
        
        return answer;
    }
    
    int dfs(int idx,int sum, char[] calStore, int[] numbers){
    	
	    if(calStore[idx]=='1'){
	    	sum+=numbers[idx];
	    }else if(calStore[idx]=='0'){
	    	sum-=numbers[idx];
	    }
	    idx++;
	    if(idx<calStore.length){
	    	return dfs(idx,sum,calStore,numbers);
    	}
	    return sum;
    }
    
}

/*
테스트 1 〉	통과 (359.95ms, 164MB)
테스트 2 〉	통과 (330.82ms, 165MB)
테스트 3 〉	통과 (51.38ms, 55.1MB)
테스트 4 〉	통과 (63.35ms, 55.1MB)
테스트 5 〉	통과 (102.38ms, 60.2MB)
테스트 6 〉	통과 (68.16ms, 55.8MB)
테스트 7 〉	통과 (48.88ms, 55.7MB)
테스트 8 〉	통과 (76.57ms, 57.1MB)
*/
