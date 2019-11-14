package javapro;
import java.io.*;
import java.util.*;
public class bj1668 {
	//������ ���ʿ��� �������� �����ʿ��� ���� ���� ���̴� Ʈ���� ���� ���
	//Ʈ���� ���� 1<= N <=50
	// :: ���� �Ǵ� ���������� Ž���ϸ鼭 ���� �ִ밪�� ��
	// :: �ִ밪���� ������ �Ⱥ��̰�, �ִ밪���� ũ�� ���δ�.
	// ArrayList�� List����
			// :: List�� �������̽��� ArrayList�� List�� ��ӵ� Ŭ����.
			// :: ArrayList�� �ܵ����� ����� �� ������ ���� List�������̽��� ��ӹް� ���
			// :: �����) ArrayList : ���簢��, List : �簢��
			// �Է� :  Ʈ������ ����
			//		   ����Ʈ���Ǻ����� ����
			// ��� :  ����--> ������
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//�Է�
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