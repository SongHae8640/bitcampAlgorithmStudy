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
테스트 1 〉	통과 (0.81ms, 50.6MB)
테스트 2 〉	통과 (0.83ms, 52.2MB)
테스트 3 〉	통과 (0.90ms, 52.4MB)
테스트 4 〉	통과 (0.95ms, 51.1MB)
테스트 5 〉	통과 (0.88ms, 50.3MB)
테스트 6 〉	통과 (1.48ms, 53MB)
테스트 7 〉	통과 (0.79ms, 52.6MB)
테스트 8 〉	통과 (1.32ms, 50.8MB)
테스트 9 〉	통과 (0.87ms, 51.9MB)
테스트 10 〉통과 (1.12ms, 52.6MB)
테스트 11 〉통과 (3.25ms, 54.7MB)
테스트 12 〉통과 (2.12ms, 53.4MB)
테스트 13 〉통과 (1.48ms, 50.8MB)
 * */
