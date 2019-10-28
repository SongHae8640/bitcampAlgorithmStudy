package printer;

import java.util.ArrayList;

public class Printer {

	public static void main(String[] args) {
//		int[] priorities={2, 1, 3, 2};
//		int location=2;
		
//		int[] priorities={1, 1, 9, 1, 1, 1};
//		int location=0;
		
		int[] priorities={3,3,4,2};
		int location=3;
		
		Solution sol=new Solution();
		int result=sol.solution(priorities, location);
		System.out.println(result);
	}

}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        int count=0;
        ArrayList<Integer> orderList=new ArrayList<Integer>();
        ArrayList<Integer> loactionList=new ArrayList<Integer>();
        for(int i=0;i<priorities.length;i++){
        	orderList.add(priorities[i]);
        	if(i==location){
        		loactionList.add(1);
        	}else{
        		loactionList.add(0);
        	}
        }
        boolean loop=true;
        
        while(loop){
        	int num=orderList.get(0);
        	orderList.remove(0);
        	
        	int check=loactionList.get(0);
        	loactionList.remove(0);
        	
        	if(orderList.size()==0){
        		count++;
        		loop=false;
        	}
        	
        	for(int j=0;j<orderList.size();j++){
        		if(num<orderList.get(j)){
        			orderList.add(num);
        			loactionList.add(check);
        			break;
        		}
        		
        		if(j==orderList.size()-1){
        			count++;
        			
        			if(check==1){
        				loop=false;
        				break;
        			}
        		}
        		
        	}
        }
        
        answer=count;
        return answer;
    }
}

/*
테스트 1 〉	통과 (1.53ms, 50.4MB)
테스트 2 〉	통과 (2.21ms, 49.8MB)
테스트 3 〉	통과 (1.11ms, 53MB)
테스트 4 〉	통과 (0.96ms, 52.3MB)
테스트 5 〉	통과 (0.88ms, 50.6MB)
테스트 6 〉	통과 (1.46ms, 52.6MB)
테스트 7 〉	통과 (1.21ms, 52.4MB)
테스트 8 〉	통과 (2.07ms, 50.1MB)
테스트 9 〉	통과 (0.97ms, 52.8MB)
테스트 10 〉	통과 (1.29ms, 52.3MB)
테스트 11 〉	통과 (1.96ms, 52.6MB)
테스트 12 〉	통과 (0.99ms, 52.4MB)
테스트 13 〉	통과 (1.81ms, 50.4MB)
테스트 14 〉	통과 (0.86ms, 54.4MB)
테스트 15 〉	통과 (0.94ms, 52.5MB)
테스트 16 〉	통과 (1.18ms, 52.4MB)
테스트 17 〉	통과 (2.00ms, 52.3MB)
테스트 18 〉	통과 (1.16ms, 54.1MB)
테스트 19 〉	통과 (1.94ms, 52.3MB)
테스트 20 〉	통과 (1.17ms, 52.2MB)
*/
