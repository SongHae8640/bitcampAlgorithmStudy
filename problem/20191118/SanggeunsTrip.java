package sanggeunsTrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SanggeunsTrip {

	static List<Integer> case_num=new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String num_str = bf.readLine();
		int test_case=Integer.parseInt(num_str);
		
		for(int test_num=0;test_num<test_case;test_num++){
			
			String[] national=bf.readLine().split(" ");
			int nat_num=Integer.parseInt(national[0]);
			int air_num=Integer.parseInt(national[1]);
			
			int[][] path_conn=new int[nat_num][nat_num];
			for(int i=0;i<air_num;i++){
				String[] path=bf.readLine().split(" ");
				
				//경로 그래프
				path_conn[Integer.parseInt(path[1])-1][Integer.parseInt(path[0])-1]=1;
				path_conn[Integer.parseInt(path[0])-1][Integer.parseInt(path[1])-1]=1;
			}
			
			for(int i=0;i<nat_num;i++){
				int[] check_nat=new int[nat_num];
				check_nat[i]=1;
				dfs(i,check_nat,path_conn,0);
				
			}
			
			case_num.sort(null);
			System.out.println(case_num.get(0));
			case_num.clear();
		}
		
	}
	
	static void dfs(int idx,int[] check_nat,int[][] path_conn,int check_in){
		
		int sum=0;
		for(int i=0;i<check_nat.length;i++){
			sum+=check_nat[i];
		}
		
		if(sum==check_nat.length){
			case_num.add(check_in);
		}else{
			int count=0;
			for(int i=0;i<check_nat.length;i++){
				if(path_conn[idx][i]==1 && check_nat[i]==0){
					check_in++;
					check_nat[i]=1;
					dfs(i,check_nat,path_conn,check_in);
				}else{
					count++;
				}
			}
			if(count==check_nat.length){
				for(int i=0;i<check_nat.length;i++){
					if(path_conn[idx][i]==1){
						check_nat[i]=0;
					}
				}
				for(int i=0;i<check_nat.length;i++){
					if(path_conn[idx][i]==1 && check_nat[i]==0){
						check_in++;
						check_nat[i]=1;
						dfs(i,check_nat,path_conn,check_in);
					}
				}
			}
		}
	}
}
