package javapro;
/*
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class bj11650 {
//https://www.acmicpc.net/problem/11650
	//��Ÿ�ӿ���
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<2;j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] x, int[] y) {
				if(x[0] == y[0]){
					//x��ǥ�� ������ y��ǥ ��
					return Integer.compare(x[1],y[1]);
				}
				else{
					//��Ҵ� x��ǥ ��
					return Integer.compare(x[0], y[1]);
				}
			}
		});
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
	}
}
