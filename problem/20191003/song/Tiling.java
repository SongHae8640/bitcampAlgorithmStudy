package level3;

public class Tiling {

	public static void main(String[] args) {
		System.out.println(solution(4));
		System.out.println(solution(7));

	}
	
	public static int solution(int n) {
		int[] answer = new int[n+1];
		answer[0] = 1;
		answer[1] = 1;
		for(int i =2 ; i <=n; i++) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		return answer[n];
	}

}

/*
 * n   answer
 * ------
 * 1 > 1
 * 2 > 2
 * 3 > 3
 * 4 > 5
 * 5 > 8
 * 
 * => solution(n) = solution(n-1) + solution(n-2)
 * 
 * ������ ������ ��� ���� ��ķ� ������ �̷� ������ ���� Ǯ����
 * 
��Ȯ��  �׽�Ʈ
�׽�Ʈ 1 ��	��� (1.03ms, 52.7MB)
�׽�Ʈ 2 ��	��� (0.86ms, 50.3MB)
�׽�Ʈ 3 ��	��� (0.96ms, 51.9MB)
�׽�Ʈ 4 ��	��� (1.17ms, 50.4MB)
�׽�Ʈ 5 ��	��� (0.89ms, 52.3MB)
�׽�Ʈ 6 ��	��� (1.01ms, 51.7MB)
�׽�Ʈ 7 ��	��� (0.85ms, 52.4MB)
�׽�Ʈ 8 ��	��� (1.01ms, 52.2MB)
�׽�Ʈ 9 ��	��� (0.99ms, 52.8MB)
�׽�Ʈ 10 ��	��� (0.94ms, 53.2MB)
�׽�Ʈ 11 ��	��� (0.93ms, 50.7MB)
�׽�Ʈ 12 ��	��� (0.90ms, 52.2MB)
�׽�Ʈ 13 ��	��� (0.92ms, 50.2MB)
�׽�Ʈ 14 ��	��� (0.93ms, 54.3MB)
ȿ����  �׽�Ʈ
�׽�Ʈ 1 ��	��� (1.34ms, 50.2MB)
�׽�Ʈ 2 ��	��� (1.62ms, 50.2MB)
�׽�Ʈ 3 ��	��� (1.36ms, 52.1MB)
�׽�Ʈ 4 ��	��� (1.40ms, 50.3MB)
�׽�Ʈ 5 ��	��� (1.84ms, 50.8MB)
�׽�Ʈ 6 ��	��� (2.07ms, 52.2MB)
 * */
