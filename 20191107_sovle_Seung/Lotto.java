package javapro;
import java.util.*;
public class Lotto {
//완전탐색 //백트래킹
	private static int[] output_Number;
	private static int[] input_Number;
	private static int num_k;
	
	private static int Rotto_num = 6;
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		num_k = scan.nextInt();
		
		while (num_k > 6 && num_k < 13){
			//로또 번호 후보 숫자 배열 생성
			input_Number = new int[num_k];
			output_Number = new int[Rotto_num];
			
			//후보 숫자 입력받기
			for(int i=0; i< num_k;i++){
				input_Number[i] = scan.nextInt();
			}
			
			//랜덤숫자6(로또) 찾기
			dfs(0,0);
			
			//다음 k입력받기, k==0 종료
			num_k = scan.nextInt();
		}
		scan.close();		
	}
	//start_num = 로또 후보 수자 배열 순서...
	//depth = 로또로 선택한 숫자
	private static void dfs(int start_num, int depth){
		if(depth == Rotto_num){
			for(int i = start_num; i<num_k;i++){
				output_Number[depth] = input_Number[i];
				dfs(i+1, depth +1);
			}
		}
	}
}
