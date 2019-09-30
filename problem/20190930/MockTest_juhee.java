import java.util.ArrayList;
import java.util.List;

public class MockTest_juhee {

	public static void main(String[] args) {
		solution(new int[] {1,2,3,4,5});
		solution(new int[] {1,3,2,4,2});

	}

    public static int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] user1 = {1,2,3,4,5};
        int[] user2 = {2,1,2,3,2,4,2,5};
        int[] user3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] cnt = new int [3];
        
        for(int i=0; i<answer.length; i++){
            if(answer[i] == user1[i%5]){
                cnt[0]++;
            }
            if(answer[i] == user2[i%8]){
                cnt[1]++;
            }
            if(answer[i] == user3[i%10]){
                cnt[2]++;
            }
        }
        
        System.out.println("1 : " + cnt[0] + "2 : " + cnt[1] +"3 : " + cnt[2] );
        
        int answer_cnt, temp =0;
        answer_cnt = cnt[0];
        
        for(int i=0; i<cnt.length; i++){
            if(answer_cnt<cnt[i]){
                answer_cnt=cnt[i]; //정답수 높은 수로
            }    
        }
        
        //정답수가 같은 학생들 넣음
        List<Integer> student = new ArrayList<>();
        
        for(int i=0; i<cnt.length; i++){
            if(answer_cnt==cnt[i]){
                student.add(i+1);
            }
        }
        
       
        answer = new int[student.size()];
        for(int i=0; i<student.size(); i++){
            
        }
        
        return answer;
    }
}

/*
臾몄젣 : https://programmers.co.kr/learn/courses/30/lessons/42840?language=java
紐⑥쓽怨좎궗 lv1
*/