package javapro;
import java.util.Scanner;
public class bj1100 {
	//8*8 체스판
	//가장 위가 흰색(0,0)--- 검,흰이 번갈아 나타난다---> 시작 칸이 흰색
	//체스판의 상태가 주어졌을때, 하얀 칸 위의 말이 몇개인지 출력
	//입력 : 첫째 줄 부터 8줄의 체스판의 상태가 주어진다. 
	// '.' : 빈칸, 'F' : 말
	//==>
	//(0,0)이 주어진다--> 2차원
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//문자가 들어가는 2차배열
		char[][] chess = new char[8][8];//체스판
		int pone = 0;
		
		for(int i=0;i<8;i++){
			String input = sc.nextLine();//8*8이 입력됩니다. 
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