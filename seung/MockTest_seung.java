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
        //3���� �л� ����üũ(ù��°�л������, �ι�°�л� �����, ����°�л������)
        
        for(int i=0; i<answers.length;i++) {
        	if(answer[i]==st1[i%5]) {//5���� �ݺ�
        		st[0]++;
        	}
        	if(answer[i]==st2[i%8]) {//8���� �ݺ�
        		st[1]++;
        	}
        	if(answer[i]==st3[i%10]) {//10���� �ݺ�
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
문제 : https://programmers.co.kr/learn/courses/30/lessons/42840?language=java
모의고사 lv1
*/