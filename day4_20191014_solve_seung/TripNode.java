package javapro;


2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
import java.util.*;

class Solution {
    static boolean visit[];
    static List<String> list = new ArrayList<>();
    static String route = "";

        public static void dfs(String[][] tickets, String end, int count) {

        route += end + ",";
       // System.out.print(route+ " ");
        //System.out.print(count+ " ");


        if(count==tickets.length) {
            list.add(route);
            return;
        }

        for(int i = 0 ; i < tickets.length ; i++) {
            String depart = tickets[i][0];
            String desti = tickets[i][1];

            if(end.equals(depart) && !visit[i]) {
                visit[i] = true;
                dfs(tickets, desti, count+1);
                visit[i] = false;
                route = route.substring(0, route.length()-4); //ÆÄ½Ì
            }
        }
    }

    public String[] solution(String[][] tickets) {
        visit = new boolean[tickets.length];

        for(int i = 0 ; i < tickets.length; i++) {

            String departure = tickets[i][0];
            String destination = tickets[i][1];

            if(departure.equals("ICN")) {
                visit[i] = true;
                route = departure + ",";
                dfs(tickets, destination, 1);
                visit[i] = false;
            }
        }
        Collections.sort(list);

        String[] answer = list.get(0).split(",");
        return answer;
    }


}