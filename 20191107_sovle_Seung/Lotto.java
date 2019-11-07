package javapro;
import java.util.*;
public class Lotto {
//����Ž�� //��Ʈ��ŷ
	private static int[] output_Number;
	private static int[] input_Number;
	private static int num_k;
	
	private static int Rotto_num = 6;
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		num_k = scan.nextInt();
		
		while (num_k > 6 && num_k < 13){
			//�ζ� ��ȣ �ĺ� ���� �迭 ����
			input_Number = new int[num_k];
			output_Number = new int[Rotto_num];
			
			//�ĺ� ���� �Է¹ޱ�
			for(int i=0; i< num_k;i++){
				input_Number[i] = scan.nextInt();
			}
			
			//��������6(�ζ�) ã��
			dfs(0,0);
			
			//���� k�Է¹ޱ�, k==0 ����
			num_k = scan.nextInt();
		}
		scan.close();		
	}
	//start_num = �ζ� �ĺ� ���� �迭 ����...
	//depth = �ζǷ� ������ ����
	private static void dfs(int start_num, int depth){
		if(depth == Rotto_num){
			for(int i = start_num; i<num_k;i++){
				output_Number[depth] = input_Number[i];
				dfs(i+1, depth +1);
			}
		}
	}
}
