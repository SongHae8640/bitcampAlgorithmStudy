package level3;

public class Network {

	public static void main(String[] args) {
		//solution(3, new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
		solution(3, new int[][] {{1, 1, 0}, {1, 1, 1}, {0, 0, 1}});
	}
	
	static int networkCount;
	static int[][] sComputers;
	
    public static int solution(int n, int[][] computers) {
        networkCount = 0;

        sComputers=computers;
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(computers[i][j] ==1) {
					networkCount++;
					transmitSignal(i,j);
				}
			}
		}
        
        return networkCount;
    }

	private static void transmitSignal(int comp1, int comp2) {
		for (int i = 0; i < sComputers.length; i++) {
			if(sComputers[comp1][i] ==1) {
				
				sComputers[i][comp1] =0;
				sComputers[comp1][i] =0;
				
				transmitSignal(i, comp1);
				
				
			}
			
			if(sComputers[comp2][i] ==1) {
				
				sComputers[i][comp2] =0;
				sComputers[comp2][i] =0;
				
				transmitSignal(i, comp2);
			}
		}
		
	}
}

/*
�׽�Ʈ 1 ��	��� (0.81ms, 50.6MB)
�׽�Ʈ 2 ��	��� (0.83ms, 52.2MB)
�׽�Ʈ 3 ��	��� (0.90ms, 52.4MB)
�׽�Ʈ 4 ��	��� (0.95ms, 51.1MB)
�׽�Ʈ 5 ��	��� (0.88ms, 50.3MB)
�׽�Ʈ 6 ��	��� (1.48ms, 53MB)
�׽�Ʈ 7 ��	��� (0.79ms, 52.6MB)
�׽�Ʈ 8 ��	��� (1.32ms, 50.8MB)
�׽�Ʈ 9 ��	��� (0.87ms, 51.9MB)
�׽�Ʈ 10 ����� (1.12ms, 52.6MB)
�׽�Ʈ 11 ����� (3.25ms, 54.7MB)
�׽�Ʈ 12 ����� (2.12ms, 53.4MB)
�׽�Ʈ 13 ����� (1.48ms, 50.8MB)
 * */
