package colorWeakness;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColorWeakness {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String num_str = bf.readLine();
		int number=Integer.parseInt(num_str);
		
		int count_weakness=0;
		int count_normal=0;
		
		int[][] check_weakness=new int[number][number];
		int[][] check_normal=new int[number][number];
		
		String[][] weakness=new String[number][number];
		String[][] normal=new String[number][number];
		
		for(int i=0;i<number;i++){
			String[] temp=bf.readLine().split("");
			for(int j=0;j<temp.length;j++){
				String temp_String=temp[j];
				normal[i][j]=temp[j];
				
				if(temp_String.equals("G"))temp_String="R";
				weakness[i][j]=temp_String;
			}
		}
		
		for(int i=0;i<number;i++){
			for(int j=0;j<number;j++){
				if(check_weakness[i][j]==0){
					count_weakness++;
					check_weakness[i][j]=1;
					dfs_weakness(i,j,check_weakness,weakness,number,weakness[i][j]);
				}
				
				if(check_normal[i][j]==0){
					count_normal++;
					check_normal[i][j]=1;
					dfs_normal(i,j,check_normal,normal,number,normal[i][j]);
				}
			}
		}
		
		System.out.println(count_normal);
		System.out.println(count_weakness);
	}
	
	//색약
	static void dfs_weakness(int idx_i,int idx_j,int[][] check_weakness, String[][] weakness,int number, String color){
		
		for(int j=idx_j;j<number-1;j++){
			
			if(idx_i+1<number){
				if(color.equals(weakness[idx_i+1][j])){
					check_weakness[idx_i+1][j]=1;
					dfs_weakness(idx_i+1, j, check_weakness, weakness, number, color);
				}
			}
			if(j<number-1){
				if(!color.equals(weakness[idx_i][j+1])){
					break;
				}else{
					check_weakness[idx_i][j+1]=1;
				}
			}
		}
		
		for(int j=idx_j;j>0;j--){
			
			if(idx_i+1<number){
				if(color.equals(weakness[idx_i+1][j])){
					check_weakness[idx_i+1][j]=1;
					dfs_weakness(idx_i+1, j, check_weakness, weakness, number, color);
				}
			}
			
			if(j>0){
				if(!color.equals(weakness[idx_i][j-1])){
					break;
				}else{
					check_weakness[idx_i][j-1]=1;
				}
			}
		}
	}
	
	//일반
	static void dfs_normal(int idx_i,int idx_j,int[][] check_normal, String[][] normal,int number, String color){
		
		for(int j=idx_j;j<number;j++){
			
			if(idx_i+1<number){
				if(color.equals(normal[idx_i+1][j])){
					check_normal[idx_i+1][j]=1;
					dfs_normal(idx_i+1, idx_j, check_normal, normal, number, color);
				}
			}
			
			if(j<number-1){
				if(!color.equals(normal[idx_i][j+1])){
					break;
				}else{
					check_normal[idx_i][j+1]=1;
				}
			}
		}
		
		for(int j=idx_j;j>=0;j--){
			
			if(idx_i+1<number){
				if(color.equals(normal[idx_i+1][j])){
					check_normal[idx_i+1][j]=1;
					dfs_normal(idx_i+1, idx_j, check_normal, normal, number, color);
				}
			}
			
			if(j>0){
				if(!color.equals(normal[idx_i][j-1])){
					break;
				}else{
					check_normal[idx_i][j-1]=1;
				}
			}
		}
	}

}
