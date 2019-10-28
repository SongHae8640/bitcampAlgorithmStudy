package carpet;

public class Carpet {

	public static void main(String[] args) {
//		int brown=10;		//[4,3]
//		int red=2;
		
		int brown=8;		//[3,3]
		int red=1;
//		
//		int brown=24;		//[8,6]
//		int red=24;
		
		Solution sol=new Solution();
		int[] result=sol.solution(brown, red);
		
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
		}

	}

}

class Solution {
    public int[] solution(int brown, int red) {
        int[] answer = {0,0};
        
//        x*y=brown+red
//        2x+2y-4=brown개수
        int sum=brown+red;
        
        for(int i=1;i<brown;i++){
        	for(int j=1;j<=i;j++){
        		if(i*j==sum && (2*i)+(2*j)-4==brown){
        			answer[0]=i;
        			answer[1]=j;
        			return answer;
        		}
        	}
        }
        
        return answer;
    }
}

/*
테스트 1 〉	통과 (1.49ms, 50.5MB)
테스트 2 〉	통과 (1.79ms, 52.4MB)
테스트 3 〉	통과 (4.82ms, 50.1MB)
테스트 4 〉	통과 (5.37ms, 52.6MB)
테스트 5 〉	통과 (5.76ms, 52.7MB)
테스트 6 〉	통과 (4.80ms, 52.5MB)
테스트 7 〉	통과 (7.48ms, 53MB)
테스트 8 〉	통과 (4.78ms, 51.8MB)
테스트 9 〉	통과 (5.24ms, 52.8MB)
테스트 10 〉	통과 (5.08ms, 50.3MB)
*/
