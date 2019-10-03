package DoyAlgorism;

import java.util.Arrays;

public class day2algorism1 {

	public static void main(String[] args) {
		int answer = 0;
		int[] lost = { 2, 4 };
		int[] reserve = { 3 };
		int n=5;
		int cnt = 0;
		int total = 0;

		
		
		// 여벌있는데 누가 훔쳐감 그래서 못빌려줌
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					System.out.println("체육복 구함");
					cnt++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}
		//빌려준사람 -1로 바꿔서 다시 못 빌려주게함
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
					total++;
					reserve[j] = -1;
					break;
				}
			}
		}
		//잃어버린학생수 빼고 빌린사람들 인원수 추가해준다.
		answer = n - lost.length + cnt + total;

		System.out.println("체육활동 참여인원:" + answer);

	}

}
