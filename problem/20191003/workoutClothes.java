package workoutClothes;

import java.util.ArrayList;

public class WorkOutClothes {

	public static void main(String[] args) {
		
//		int n=5;
//		int[] lost={3,7,11,13,16,19,22,25,27};
//		int[] reserve={4,5,6,12,14,19,21,26};
//		
		//1
		int n=5;
		int[] lost={2,4};
		int[] reserve={1,3,5};
		
		//2
//		int n=5;
//		int[] lost={2,4};
//		int[] reserve={3};
		
		//3
//		int n=3;
//		int[] lost={3};
//		int[] reserve={1};
		
		Solution sol=new Solution();
		int result=sol.solution(n,lost,reserve);
	}
	
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        //1.lost이외의 숫자들을 담음
        //2.reserve에 있는 숫자를 뽑아 lost에 -1,+1이 있는지 확인
        //3.존재하면 -1먼저 뽑아 체육복이 있는 그룹에서 해당 번호가 있는지 확인
        //4.번호가 존재하지 않을경우 lost에서 제외, reserve에서 제외
        //5.체육복이 있는 그룹의 총 개수를 셈
        
        //체육복을 잃어버린 그룹
        ArrayList<Integer> lostList=new ArrayList<Integer>();
        for(int i=0;i<lost.length;i++){
        	//도난당한 학생 중 여분이 있는학생 제외
        	int resYn=0;
        	
        	for(int j=0;j<reserve.length;j++){
        		if(lost[i]==reserve[j]){
        			resYn=1;
        			break;
        		}
        	}
        	if(resYn==0){
        		lostList.add(lost[i]);
        	}
        }
        
        //여분이 있는 그룹
        ArrayList<Integer> resList=new ArrayList<Integer>();
        for(int i=0;i<reserve.length;i++){
        	//여분이 있는 학생 중 도난당한 학생 제외
        	int lostYn=0;
        	for(int j=0;j<lost.length;j++){
        		if(reserve[i]==lost[j]){
        			lostYn=1;
        			break;
        		}
        	}
        	if(lostYn==0){
        		resList.add(reserve[i]);
        	}
        }
        
        //체육복이 있는그룹
        ArrayList<Integer> getList=new ArrayList<Integer>();
       for(int i=1;i<=n;i++){
    	   int putYn=0;
    	   
    	   //1~n까지 반복문을 돌려 lost에 없는 숫자만 put
    	   for(int j=0;j<lostList.size();j++){
    		   if(i==lostList.get(j)){
    			   putYn=1;
    			   break;
    		   }
    	   }
    	   
    	   if(putYn==0){
    		   getList.add(i);
    	   }
       } 
        
        //체육복 여분있는 학생 중 없는 학생의 -1,+1이 있는지 확인
        for(int i=0;i<resList.size();i++){
        	//-1먼저 확인
        	//for문 사용
        	for(int j=0;j<lostList.size();j++){
        		if(resList.get(i)-1==lostList.get(j)||resList.get(i)+1==lostList.get(j)){
        			getList.add(lostList.get(j));
        			lostList.remove(j);
        			break;
        		}
        	}
        	
        	//index사용
//        	if(lostList.contains(resList.get(i)-1)){
//        		getList.add(lostList.get(lostList.indexOf(resList.get(i)-1)));
//    			lostList.remove(lostList.indexOf(resList.get(i)-1));
//        	}else if(lostList.contains(resList.get(i)+1)){
//        		getList.add(lostList.get(lostList.indexOf(resList.get(i)+1)));
//        		lostList.remove(lostList.indexOf(resList.get(i)+1));
//        	}
        	
        }
        
        answer=getList.size();
        return answer;
    }
}


테스트 1 〉	통과 (0.85ms, 50.4MB)
테스트 2 〉	통과 (0.91ms, 52.6MB)
테스트 3 〉	통과 (0.89ms, 54.3MB)
테스트 4 〉	통과 (0.90ms, 52.7MB)
테스트 5 〉	통과 (0.90ms, 51.9MB)
테스트 6 〉	통과 (0.81ms, 52MB)
테스트 7 〉	통과 (0.92ms, 49.8MB)
테스트 8 〉	통과 (1.04ms, 52.2MB)
테스트 9 〉	통과 (0.97ms, 50.8MB)
테스트 10 〉	통과 (0.99ms, 52.7MB)
테스트 11 〉	통과 (0.84ms, 52.7MB)
테스트 12 〉	통과 (0.84ms, 52.8MB)
