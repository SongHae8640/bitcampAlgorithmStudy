package javapro;
public class Network {
	public void main(String[] args) {
		solution(3, new int[][] {{1, 1, 0}, {1, 1, 1}, {0, 0, 1}});
	}
	
	public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] chk = new boolean[n];//연결여부체크
        for(int i = 0; i < n; i++) {
            if(!chk[i]) {//연결안되어있을때
                dfs(computers, chk, i);
                answer++;
            }
        }
        return answer;
    }
    void dfs(int[][] computers, boolean[] chk, int start) {
        chk[start] = true;
        for(int i = 0; i < computers.length; i++) {
            if(computers[start][i] == 1 && !chk[i]) {
                dfs(computers, chk, i);
            }
        }
    }
}

/*lv3
 * https://programmers.co.kr/learn/courses/30/lessons/43162
 */