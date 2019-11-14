package javapro;
import java.util.*;
import java.io.*;
public class bj2583 {
	//dfs
	static int square(String s){return Integer.parseInt(s);}
	static int m;
	static int n;
	static int k;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {1,-1, 0,0,};
	static int[] dy = {0,0,1,-1};
	static int area;
	//2차원배열을 이용한 좌표에서...로 생각
	//일반적으로 사용하는 2차원 배열은 (0, 0)이 왼쪽 위고 (N, M)이 오른쪽 아래인데, 문제에서는 왼쪽 아래가 (0, 0)이고 오른쪽 위가 (N, M)입니다.
	//큐사용

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st; //?
		
		st = new StringTokenizer(br.readLine());
		m = square(st.nextToken());
		n = square(st.nextToken());
		k = square(st.nextToken());
		arr = new int[m][n];
		visited = new boolean[m][n];
		
		for(int i=0;i<k;i++){
			st = new StringTokenizer(br.readLine());
			setSquare(square(st.nextToken()), square(st.nextToken()), square(st.nextToken()), square(st.nextToken()));
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int count = 0;
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				area = 0;
				if(arr[i][j] == 0){
					count++;
					dfs(i,j);
					pq.offer(area);
				}
			}
		}
		bw.write(count+"\n");
		while(!pq.isEmpty()){
			bw.write(pq.poll() + " ");
		}
		bw.flush();
	}
	
	 static void setSquare(int lx, int ly, int rx, int ry) {
	        for(int i=ly; i<ry; i++){
	            for(int j=lx; j<rx; j++) {
	                arr[i][j] = 1;
	            }
	        }
	    }

	static void dfs(int x, int y) {
	        arr[x][y] = 1;
	        area++;
	 
	        for(int i=0; i<4; i++) {
	            int nx = x + dx[i];
	            int ny = y + dy[i];
	 
	            if(0 <= nx && nx < m && 0 <= ny && ny < n) {
	                if(arr[nx][ny] == 0)
	                    dfs(nx, ny);
	            }
	        }
	    }
	}
//13448KB 88ms