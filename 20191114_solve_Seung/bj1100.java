package javapro;
import java.util.Scanner;
public class bj1100 {
	//8*8 ü����
	//���� ���� ���(0,0)--- ��,���� ������ ��Ÿ����---> ���� ĭ�� ���
	//ü������ ���°� �־�������, �Ͼ� ĭ ���� ���� ����� ���
	//�Է� : ù° �� ���� 8���� ü������ ���°� �־�����. 
	// '.' : ��ĭ, 'F' : ��
	//==>
	//(0,0)�� �־�����--> 2����
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//���ڰ� ���� 2���迭
		char[][] chess = new char[8][8];//ü����
		int pone = 0;
		
		for(int i=0;i<8;i++){
			String input = sc.nextLine();//8*8�� �Էµ˴ϴ�. 
			for(int j=0;j<8;j++){
				chess[i][j] = input.charAt(j);
				
				if(chess[i][j] == 'F' && (i+j)%2 == 0){
					pone++;
				}
			}
		}
		System.out.println(pone);
		sc.close();
	}
}
//14180KB, 104ms