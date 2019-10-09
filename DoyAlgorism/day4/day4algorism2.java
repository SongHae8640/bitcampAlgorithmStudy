package DoyAlgorism.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day4algorism2 {

//	static String[][] tickets={ {"JFK", "HND"},{"ICN", "JFK"}, {"HND", "IAD"}};
	static String[][] tickets={ {"ICN", "SFO"}, {"ICN","ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
	private static String route;
	static List<String> list=new ArrayList<String>();
	static boolean[] visit = new boolean[tickets.length];
	
	public static void main(String[] args){
		
		for (int i = 0; i < tickets.length; i++) {
			String start = tickets[i][0];
			String end = tickets[i][1];
			//첫출발은 항상 인천이므로 시작은 인천부터
			if(start.equals("ICN")) {
				visit[i] = true;
				route = start + ",";
				//도착지 지정
				dfs(tickets, end, 1);
				visit[i] = false;
			}
		}
		
		//순서정렬
		Collections.sort(list);
		
		String[] answer = list.get(0).split(",");
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
	}

	private static void dfs(String[][] tickets, String end, int cnt) {
		// TODO Auto-generated method stub
		route += end + ",";
		System.out.println("1:"+route);
		System.out.println("2:"+cnt);
		System.out.println("3:"+tickets.length);
		//출발 횟수와 티켓수가 같아지면 list에 집어 넣고 answer 제출
		if(cnt==tickets.length) {
			System.out.println("answer");
			list.add(route);
			return;
		}
		
		for(int i = 0 ; i < tickets.length ; i++) {
			String start1 = tickets[i][0];
			//출발지
			String end1 = tickets[i][1];
			//도착지
			
			if(end.equals(start1) && !visit[i]) {
				visit[i] = true;
				//도착할때마다 cnt 상승
				dfs(tickets, end1, cnt+1);
				visit[i] = false;
				System.out.println("길이:"+route.length());
				//출발지 겹치는거 제거
				System.out.println("123==="+route);
				route = route.substring(0, route.length()-4);
				
			}
		}
		
	}


}
