package DfsBfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

//인접 
public class No1389KevinBacon6StepLaw {
	private static int userCount;
	private static LinkedList[] relationGraph;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		userCount = sc.nextInt();
		int relationCount = sc.nextInt();
		relationGraph = new LinkedList[relationCount+1];
		for (int i = 1; i <= relationCount; i++) {
			relationGraph[i] = new LinkedList<Integer>();
		}
		
		//노드 연결
		int startNode;
		int endNode;
		for (int i = 0; i < relationCount; i++) {
			startNode = sc.nextInt();
			endNode = sc.nextInt();
			relationGraph[startNode].add(endNode);
		}

		dfs(1);
		
	}
	
	static void dfs(int startNode) {
		boolean visited[] = new boolean[userCount+1];
		
		//start 를 시작으로 순한 호출
		dfsUtill(startNode, visited);
		
	}

	private static void dfsUtill(int startNode, boolean[] visited) {
		//방문한 노드를 표시하고 값을 출력
		visited[startNode] = true;
		System.out.print(startNode+" ");
		
		Iterator<Integer> iter = relationGraph[startNode].listIterator();
		while(iter.hasNext()) {
			int n = iter.next();
			
			if(!visited[n]) {
				dfsUtill(n, visited);
			}
		}
		
	}

}



/*
 * 출처 : https://www.acmicpc.net/problem/1389
 * 참고 : https://gmlwjd9405.github.io/2018/08/14/algorithm-dfs.html
 * 
 */