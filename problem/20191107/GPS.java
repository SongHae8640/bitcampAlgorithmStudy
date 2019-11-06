package kakao2017;

public class GPS {

	public static void main(String[] args) {
		//solution(7, 10, new int[][] {{1, 2}, {1, 3}, {2, 3}, {2, 4}, {3, 4}, {3, 5}, {4, 6}, {5, 6}, {5, 7}, {6, 7}}, 6, new int[] {1, 2, 3, 3, 6, 7}); //1
		
		//solution(7, 10, new int[][] {{1, 2}, {1, 3}, {2, 3}, {2, 4}, {3, 4}, {3, 5}, {4, 6}, {5, 6}, {5, 7}, {6, 7}},6, new int[] {1, 2, 4, 6, 5, 7}); //1
		solution(7, 10, new int[][] {{1, 2}, {1, 3}, {2, 3}, {2, 4}, {3, 4}, {3, 5}, {4, 6}, {5, 6}, {5, 7}, {6, 7}},7, new int[] {1, 1, 1, 1, 1, 1, 7}); //2

	}
	
	static int pathCount = 0;
	static int[][] paths;
	public static int solution(int n, int m, int[][] edge_list, int k, int[] gps_log) {
		paths = new int[n+1][n+1];
		for (int i = 0; i < edge_list.length; i++) {
			paths[edge_list[i][0]][edge_list[i][1]] = paths[edge_list[i][1]][edge_list[i][0]] = 1;
			
		}
		
		int timeCount; 
		for (int i = 0; i < gps_log.length-1; i++) {
			//길이 끊긴 경우
			if(paths[gps_log[i]][gps_log[i+1]] != 1) {
				//길을 찾는다. return 은 길은 찾는데 까지 걸리는 시간
				timeCount = findPath(i,gps_log);
				System.out.println(i+", " +timeCount);
				if(timeCount == -1) {
					return -1;
				}else {
					i += timeCount;
				}
			}
		}
		
		System.out.println(pathCount);
		return pathCount;
	}
	
	//startNode에서 출발하여 거점으로 이동할 수 있는 길을 찾는다
	private static int findPath(int startNode, int[] gps_log) {
		int nodeGap=2;
		while(startNode +nodeGap < paths.length) {
			//startNode에서 endNode까지 timeGap만큼 이동 해서 갈 수 있는가?
			if(isPath(gps_log[startNode], gps_log[startNode+nodeGap] , nodeGap,0)) {
				
				pathCount += nodeGap -1;
				return nodeGap;
			}
			nodeGap++;	
		}
		return -1;
	}

	static boolean isFindPath = false;
	private static boolean isPath(int startNode, int endNode, int timeGap, int time) {
		if(time == timeGap) {
			if(paths[startNode][endNode] == 1) {
				isFindPath = true;
			}
		}else {
			for (int i = 1; i < paths[startNode].length; i++) {
				if(paths[startNode][i] == 1) {
					isPath(i, endNode, timeGap, time+1);
				}
			}
		}
		return isFindPath;
	}

}
