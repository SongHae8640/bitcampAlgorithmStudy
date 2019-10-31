package DfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No14502Lab {
	static int[][] lab;
	static int maxSafeCount =0;
	static int[] dx = new int[] {-1,1,0,0};
	static int[] dy = new int[] {0,0,-1,1};
	static int row;
	static int col;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

		//input 입력, 0=빈칸 1=벽 2=바이러스 
		lab = new int[row][col];
		for(int i=0 ; i < row ; i++) {
			String tempRow = br.readLine();
			String[] tempColArr = tempRow.split(" ");
			for (int j = 0; j < tempColArr.length; j++) {
				lab[i][j] = Integer.parseInt(tempColArr[j]);
			}
		
		}
		
		//벽치기
		buildWall(0,0);
	
		
		//결과 출력
		System.out.println(maxSafeCount);
		
		
		
	}
	
	private static void buildWall(int wallIdx, int wallCount) {
		//벽 3개를 다 사용하면 > 바이러스를 퍼트린다.
		if(wallCount ==3) {
			//바이러스 감염
			int[][] tempLab = deepCopy(lab);
			for (int i = 0; i < lab.length; i++) {
				for (int j = 0; j < lab[i].length; j++) {
					if(lab[i][j]==2) {
						spreadVirus(tempLab , i , j);
					}
				}
			}
			
			//해당 경우에서 maxSafeCount 계산
			setMaxSafeCount(tempLab);
			return;
		}
		
		//벽을 아직 다 치지 않았으면 > 다음 벽을 친다.
		for(int i = wallIdx ; i <row*col ; i++) {
			int x = i%col;
			int y = i/col;
			
			if(lab[y][x] ==0) {
				lab[y][x] =1;
				//showLab(lab);
				buildWall(wallIdx+1, wallCount+1);
				lab[y][x]=0;
			}
		}
		
	}

	private static int[][] deepCopy(int[][] originLab) {
		if(originLab ==null) return null;
		
		final int[][] result = new int[originLab.length][];
	    for (int i = 0; i < originLab.length; i++) {
	        result[i] = Arrays.copyOf(originLab[i], originLab[i].length);
	    }
	    return result;
	}

	private static void showLab(int[][] lab2) {
		for (int i = 0; i < lab2.length; i++) {
			for (int j = 0; j < lab2[i].length; j++) {
			}
			System.out.println(Arrays.toString(lab2[i]));
		}
		System.out.println();
		
	}

	private static void spreadVirus(int[][] tempLab, int i , int j) {
		//동서남북으로 바이러스 전파
		for(int u = 0 ; u <4 ; u++) {
			if((i+dy[u]>=0 && i+dy[u] <row && j+dx[u]>=0 && j+dx[u]< col) &&(tempLab[i+dy[u]][j+dx[u]] ==0)) {
				tempLab[i+dy[u]][j+dx[u]] =2;
				spreadVirus(tempLab, i+dy[u], j+dx[u]);
			}
		}
		
	}

	//안전영역 크기 구하기
	public static void setMaxSafeCount(int[][] tempLab) {
		int safeCount =0;
		for (int i = 0; i < tempLab.length; i++) {
			for (int j = 0; j < tempLab[i].length; j++) {
				if(tempLab[i][j]==0) safeCount++;
			}
			//System.out.println(Arrays.toString(tempLab[i]));
		}
		if(maxSafeCount < safeCount) maxSafeCount = safeCount;
		//System.out.println();
	}

}

