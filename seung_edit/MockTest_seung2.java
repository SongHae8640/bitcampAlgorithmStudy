import java.util.*;
public class MockTest {

	public static void main(String[] args) {
		solution(new int[] {1,2,3,4,5});
		solution(new int[] {1,3,2,4,2});

	}

    public static int[] solution(int[] answers) {
        int[] st1 = {1,2,3,4,5};//5
        int[] st2 = {2,1,2,3,2,4,2,5};//8
        int[] st3 = {3,3,1,1,2,2,4,4,5,5,};//10
        
        int[] st=new int[3];
        //3명의 학생 정답체크(첫번째학생정답수, 두번째학생 정답수, 세번째학생정답수)
        
        for(int i=0; i<answers.length;i++) {
        	if(answer[i]==st1[i%5]) {//5개가 반복
        		st[0]++;
        	}
        	if(answer[i]==st2[i%8]) {//8개가 반복
        		st[1]++;
        	}
        	if(answer[i]==st3[i%10]) {//10개가 반복
        		st[2]++;
        	}
        }
        
        int first = st[0];
        for(int i=0;i<st.length;i++) {
        	if(first < st[i]) {
        		first = st[i];
        	}
        }
        
        List stresult = new ArrayList;
        stresult =[];
        for(int i=0;i<st.length;i++) {
        	if(first==st[i]) {
        		stresult.add(i);
        	}
        }
        
    	int[] answer = {};
    	answer = new int[stresult.size()];
    	
    	for(int i=0;i<stresult.size();i++) {
    		answer[i]=stresult.get(i)+1;
    	}
        return answer;
    }
}

/*
臾몄젣 : https://programmers.co.kr/learn/courses/30/lessons/42840?language=java
紐⑥쓽怨좎궗 lv1
*/