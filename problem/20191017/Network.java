package network;

public class Network {

	public static void main(String[] args) {
		
		int[][] computers={{1,0,0,1},{0,1,1,1}, {0,1,1, 0}, {1,1,0,1}};
		int n=4;
		
		Solution sol=new Solution();
		int result=sol.solution(n, computers);
		System.out.println(result);
	}

}

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        int[] check=new int[n];
        for(int i=0;i<check.length;i++){
        	check[i]=0;
        }
        
        for(int i=0; i<computers.length; i++) {
           if (check[i] == 0) {
                check[i] = 1;
                answer++;
                dfs(i, computers, check);
            }
        }
        
        return answer;
    }
    
    void dfs(int i,int[][] computers,int[] check){
    	
    	for (int j=0; j<computers[i].length; j++) {
    		if(i==j){
    			continue;
    		}else{
	            if (computers[i][j]==1 && check[j]==0) {
	                check[j]=1;
	                dfs(j, computers, check);
	            }
    		}    
        }
    }
}

----------------------------------------------------
테스트 1 〉	통과 (0.79ms, 52.4MB)
테스트 2 〉	통과 (0.81ms, 50.7MB)
테스트 3 〉	통과 (0.79ms, 52.1MB)
테스트 4 〉	통과 (0.76ms, 49.9MB)
테스트 5 〉	통과 (0.82ms, 52MB)
테스트 6 〉	통과 (0.59ms, 50.4MB)
테스트 7 〉	통과 (0.78ms, 51.8MB)
테스트 8 〉	통과 (0.71ms, 53MB)
테스트 9 〉	통과 (0.83ms, 52.1MB)
테스트 10 〉	통과 (0.81ms, 50MB)
테스트 11 〉	통과 (1.10ms, 53.2MB)
테스트 12 〉	통과 (1.11ms, 51.9MB)
테스트 13 〉	통과 (0.96ms, 52.2MB)
