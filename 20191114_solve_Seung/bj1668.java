package javapro;
import java.io.*;
import java.util.*;
public class bj1668 {
	//선반을 왼쪽에서 봤을때와 오른쪽에서 봤을 때의 보이는 트로피 개수 출력
	//트로피 개수 1<= N <=50
	// :: 왼쪽 또는 오른쪽으로 탐색하면서 현재 최대값과 비교
	// :: 최대값보다 작으면 안보이고, 최대값보다 크면 보인다.
	// ArrayList와 List차이
			// :: List는 인터페이스고 ArrayList는 List에 상속된 클래스.
			// :: ArrayList는 단독으로 사용할 수 없으며 사용시 List인터페이스를 상속받고 사용
			// :: 쉬운예제) ArrayList : 정사각형, List : 사각형
			// 입력 :  트로피의 갯수
			//		   왼쪽트로피부터의 높이
			// 출력 :  왼쪽--> 오른쪽
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//입력
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		int left_count = 1;
		int max_left = Integer.MIN_VALUE;
		int right_count = 1;
		int max_right = Integer.MIN_VALUE;
		
		//side :: left
		for(int i=0;i<n-1;i++){
			if(max_left < arr.get(i)){
				max_left = arr.get(i);
			}
			
			if(max_left>=arr.get(i+1)){
				continue;
			}
			left_count++;
		}
		
		//side :: right
		for(int i=n-1;i>0;i--){
			if(max_right < arr.get(i)){
				max_right = arr.get(i);
			}
			
			if(max_right>=arr.get(i-1)){
				continue;
			}
			right_count++;
		}
		System.out.println(left_count + " " +right_count);
	}
}
//12936KB 76ms