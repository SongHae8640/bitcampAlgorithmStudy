package level1;

import java.util.ArrayList;

public class MockTest {

	public static void main(String[] args) {
		solution(new int[] {1,2,3,4,5});
		solution(new int[] {1,3,2,4,2});

	}

    public static int[] solution(int[] answers) {

        int[] answersCount = new int[] {0,0,0};
        
        //1번 답안 부터 각 수포자의 답안과 비교
        for (int i = 0; i < answers.length; i++) {
			//1번 수포자
        	if((i%5)+1 == answers[i]) answersCount[0]++;
        	
        	//2번 수포자
        	if(i%2==0) {
        		if(answers[i]==2) {
        			answersCount[1]++;
        		}
        	}else {
        		if(i%8==1 && answers[i]==1 ) answersCount[1]++;
        		else if(i%8==3 && answers[i]==3 ) answersCount[1]++;
        		else if(i%8==5 && answers[i]==4 ) answersCount[1]++;
        		else if(i%8==7 && answers[i]==5 ) answersCount[1]++;
        	} 
        	
        	
        	//3번 수포자
        	int temp =(i%10)/2;
        	if(temp ==0 && answers[i]==3) answersCount[2]++;
        	else if(temp ==1 && answers[i]==1) answersCount[2]++;
        	else if(temp ==2 && answers[i]==2) answersCount[2]++;
        	else if(temp ==3 && answers[i]==4) answersCount[2]++;
        	else if(temp ==4 && answers[i]==5) answersCount[2]++;

		}
       
        
        //결과 만들기
        int max = 0;	//가장 많이 맞춘 갯수
        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i = 0; i < answersCount.length; i++) {
        	//i+1 번째 학생이 더 많이 맞춘 경우
			if(answersCount[i] >max) {
				alist.clear();
				alist.add(i+1);
				max = answersCount[i];
			}
			//i+1번째 학생의 맞춘 수가 같을때
			else if(answersCount[i] ==max) {
				alist.add(i+1);
			}
		}
        int[] answer = new int[alist.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = alist.get(i);
		}
        
        return answer;
    }
}

/*
문제 
	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
	수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
	
	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	
	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
	가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	
	제한 조건
	시험은 최대 10,000 문제로 구성되어있습니다.
	문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
	가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	입출력 예
	answers	return
	[1,2,3,4,5]	[1]
	[1,3,2,4,2]	[1,2,3]
	입출력 예 설명
	입출력 예 #1
	
	수포자 1은 모든 문제를 맞혔습니다.
	수포자 2는 모든 문제를 틀렸습니다.
	수포자 3은 모든 문제를 틀렸습니다.
	따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
	
	입출력 예 #2
	
	모든 사람이 2문제씩을 맞췄습니다.


결과
	테스트 1 〉	통과 (1.43ms, 52.8MB)
	테스트 2 〉	통과 (1.50ms, 51MB)
	테스트 3 〉	통과 (1.47ms, 52.1MB)
	테스트 4 〉	통과 (1.39ms, 52.1MB)
	테스트 5 〉	통과 (1.47ms, 50.2MB)
	테스트 6 〉	통과 (1.46ms, 42.5MB)
	테스트 7 〉	통과 (1.99ms, 52.3MB)
	테스트 8 〉	통과 (1.92ms, 54.7MB)
	테스트 9 〉	통과 (3.01ms, 51.2MB)
	테스트 10 〉	통과 (1.92ms, 53.2MB)
	테스트 11 〉	통과 (2.76ms, 53.3MB)
	테스트 12 〉	통과 (3.02ms, 53MB)
	테스트 13 〉	통과 (1.75ms, 52.3MB)
	테스트 14 〉	통과 (2.82ms, 53.4MB)

*/