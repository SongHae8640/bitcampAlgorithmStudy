package DfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class No2583FindArea {

		static int M, N, K;
		static boolean[][] area; 
		static ArrayList<Integer> areaCounts = new ArrayList<Integer>();
		static int tempAreaCount;
		
		static int[] dx = new int[] {1,-1,0,0};
		static int[] dy = new int[] {0,0,1,-1};
	
	public static void main(String[] args) throws IOException {
		
		//M, N, K입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		area = new boolean [M][N];
		
		for (int i = 0; i < K; i++) {
			//직사각형 그리기
			st = new StringTokenizer(br.readLine());	
			drawRectangle(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		//영역 수 구하기
		for (int i = 0; i < area.length; i++) {
			for (int j = 0; j < area[i].length; j++) {
				//직사각형에 포함되어 있지 않을 때
				if(!area[i][j]) {
					tempAreaCount = 0;
					findArea(i, j);
					areaCounts.add(tempAreaCount);
				}
			}
		}
		
		
		//출력
		System.out.println(areaCounts.size());
		Collections.sort(areaCounts);
		for (int i = 0; i < areaCounts.size(); i++) {
			System.out.print(areaCounts.get(i) +" ");
		}

	}

	private static void findArea(int i, int j) {
		tempAreaCount++;
		area[i][j] = true;
		for(int d=0; d<4 ; d++) {
			if(isInXY(i+dx[d], j+dy[d])&&(!area[i+dx[d]][j+dy[d]])) {
				findArea(i+dx[d], j+dy[d]);
			}
		}
		
	}

	private static boolean isInXY(int x, int y) {
		boolean isIn = true;
		if(x < 0) return false;
		if(y < 0) return false;
		if(x >= area.length) return false;
		if(y >= area[0].length) return false;
		return isIn;
	}

	//직사각형이 있는곳 색칠 하기
	private static void drawRectangle(int y1, int x1, int y2, int x2) {
		for(int x = x1 ; x < x2 ; x++) {
			for(int y = y1 ; y < y2 ; y++) {
				area[x][y] = true;
			}
		}
		
	}

}

/*
 * 출처 : https://www.acmicpc.net/problem/2583
 * 메모리 : 13264 KB, 시간 88ms
 * */
