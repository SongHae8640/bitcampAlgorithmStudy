package level1;

public class TileDecoration2 {

	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(5));

	}
	
	public static long solution(int N) {
		
		long[] circ = new long[N+2]; // �ѷ�
        circ[0] = 4; // ù��° �簢���� �ѷ�
        long[] tile = new long[N+1];
        tile[0]=1;
        tile[1]=1;
		
		if(N == 1)
        {
            System.out.println("Ÿ���� ���� ���� : "+N);
            System.out.println("��ü �ѷ� : "+circ[N]);
        }
        else if(N == 2)
        {
            System.out.println("Ÿ���� ���� ���� : "+tile[N-1]);
            System.out.println("��ü �ѷ� : "+(circ[N-2]+(tile[N-1]*2)));
            circ[N-1] = circ[N-2]+(tile[N-1]*2);
        }
        else if(N>2)
        {
            for(int i=2; i<=N; i++)
            {
                tile[i] = tile[i-1] + tile[i-2];
                circ[i-1] = circ[i-2]+(tile[i-1]*2); 
            }
            System.out.println(N+"��° Ÿ���� ���� ���� : "+tile[N-1]);
            System.out.println("��ü �ѷ� : "+circ[N-1]);
        }
		
		return circ[N-1];
	}

}


/*
 * ��ó : https://programmers.co.kr/learn/courses/30/lessons/43104
 * 
�׽�Ʈ 1 ��	��� (0.86ms, 52.6MB)
�׽�Ʈ 2 ��	��� (0.84ms, 52.5MB)
�׽�Ʈ 3 ��	��� (0.79ms, 52.8MB)
�׽�Ʈ 4 ��	��� (0.76ms, 52.7MB)
�׽�Ʈ 5 ��	��� (0.81ms, 52.6MB)
�׽�Ʈ 6 ��	��� (0.82ms, 52.5MB)
�׽�Ʈ 7 ��	��� (0.87ms, 52.1MB)
�׽�Ʈ 8 ��	��� (0.83ms, 50.4MB)
ȿ����  �׽�Ʈ
�׽�Ʈ 1 ��	��� (0.52ms, 52.4MB)
�׽�Ʈ 2 ��	��� (0.80ms, 52.4MB)
�׽�Ʈ 3 ��	��� (0.55ms, 50.8MB)
�׽�Ʈ 4 ��	��� (0.58ms, 51.2MB)
 * 
 * */