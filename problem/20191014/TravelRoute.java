package level3;

import java.util.*;

public class TravelRoute {

	public static void main(String[] args) {
		solution(new String[][] {new String[] {"ICN", "JFK"}, new String[] {"HND","IAD"}, new String[] {"JFK","HND"}});
		solution(new String[][] {new String[] {"ICN", "SFO"}, new String[] {"ICN","ATL"}, new String[] {"SFO","ATL"}, new String[] {"ATL","ICN"}, new String[] {"ATL","SFO"}});
	}
	
	static int ticketCount;
	static ArrayList<String> travelRout = new ArrayList<String>();
	
	public static String[] solution(String[][] tickets) {
		ticketCount = tickets.length+1;
		ArrayList<Ticket> ticketArr = new ArrayList<Ticket>();
		
		for (int i = 0; i < tickets.length; i++) {
			ticketArr.add(new Ticket(tickets[i][0], tickets[i][1]));
		}

		Collections.sort(ticketArr);
		
		//��õ���� ���
		for (int i = 0; i < ticketArr.size(); i++) {
			if(ticketArr.get(i).startPoint.equals("ICN")) {
				ArrayList<Ticket> tempTicketArr = new ArrayList<Ticket>();
				for (int j = 0; j < ticketArr.size(); j++) {
					if(i==j) continue;
					tempTicketArr.add(ticketArr.get(j));
				}
				ArrayList<String> tempTravelRoute = new ArrayList<String>();
				tempTravelRoute.add(ticketArr.get(i).startPoint);
				tempTravelRoute.add(ticketArr.get(i).endPoint);
				goTrip(ticketArr.get(i).endPoint,tempTicketArr, tempTravelRoute);
			}
		}
		
		
        String[] answer = new String[ticketCount];
        for (int i = 0; i < travelRout.size(); i++) {
			answer[i] = travelRout.get(i);
		}
        return answer;
    }

	private static void goTrip(String endPoint, ArrayList<Ticket> newTicketArr, ArrayList<String> newTravelRoute) {
		if(newTravelRoute.size() == ticketCount) {
			travelRout = newTravelRoute;
		}else {
			for (int i = 0; i < newTicketArr.size(); i++) {
				if(endPoint.equals(newTicketArr.get(i).startPoint)){
					ArrayList<Ticket> tempTicketArr = new ArrayList<Ticket>();
					for (int j = 0; j < newTicketArr.size(); j++) {
						if(i==j) continue;
						tempTicketArr.add(newTicketArr.get(j));
					}
					Collections.sort(tempTicketArr);
					
					ArrayList<String> tempTravelRoute = new ArrayList<String>();
					for (int j = 0; j < newTravelRoute.size(); j++) {
						tempTravelRoute.add(newTravelRoute.get(j));
					}
					tempTravelRoute.add(newTicketArr.get(i).endPoint);
					goTrip(newTicketArr.get(i).endPoint,tempTicketArr, tempTravelRoute);
				}
			}
		}
		
	}

}


class Ticket implements Comparable<Ticket>{
	String startPoint;
	String endPoint;
	public Ticket(String startPoint, String endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	@Override
	public int compareTo(Ticket o) {
		// ���� ��Ʈ ����Ǵ� ������ ���ĺ� �������� �ؾ� ���� �������� ����� �����Ʈ�� ���ĺ� ������ ���� �տ� �ִ°� ��
		return o.endPoint.compareTo(this.endPoint);
	}
}

/*
 * ��ó : https://programmers.co.kr/learn/courses/30/lessons/43164?language=java
 * 
�׽�Ʈ 1 ��	��� (182.58ms, 98MB)
�׽�Ʈ 2 ��	��� (2.05ms, 52MB)
�׽�Ʈ 3 ��	��� (1.75ms, 52.1MB)
�׽�Ʈ 4 ��	��� (2.05ms, 50.1MB)
 * 
 */
