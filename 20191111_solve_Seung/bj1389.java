package javapro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj1389 {

	public static void main(String args[]) throws IOException{
	//��� ������� 6�ܰ� ���� ���� �ƴ� ������� ����Ǿ��ִ�
	//������ �λ���� ��ܰ踸�� �̾����°�
	//BFS--> ť
	//������ �� N(2<=N<=100)		
	//����� M (1<=M<=5000)
	//�������
	
		
	//=>1)2������ �� ���ٴ�
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list[] = new ArrayList[n + 1];//��ȣ��1���͵�
		for(int i=1;i<=n;i++){
			list[i]=new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		int tmp[] = new int[n + 1];
		int answer[] = new int[n + 1];
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
			tmp[i]=0;
			while(!q.isEmpty()){
				int idx = q.poll();
				for(int j=0;j<list[idx].size();j++){
					int val = list[idx].get(j);
					if(i!=val && tmp[val] == 0){
						tmp[val]=tmp[idx]+1;
						q.add(val);
					}
				}
			}
			int sum = 0;
			for(int t = 1; t<=n ;t++){
				sum+=tmp[t];
				tmp[t] = 0;
			}
			answer[i]=sum;
		}
		int min = answer[1];
		int ans = 1;
		for(int i=2;i<=n;i++){
			if(min>answer[i]){
				min = answer[i];
				ans = i;
			}
		}
		System.out.println(ans);
		}

	}
	//13156KB, 80ms
