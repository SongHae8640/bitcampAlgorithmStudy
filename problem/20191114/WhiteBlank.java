package whiteSpace;

import java.util.Scanner;
public class WhiteSpace {

	public static void main(String[] args) {
		int answer=0;
		Scanner scan=new Scanner(System.in);

		for(int i=0;i<8;i++){
			String chess_status=scan.nextLine();
			for(int j=0;j<chess_status.length();j++){
				if(i%2==0){
					if(j%2==0 && chess_status.charAt(j)=='F')answer++;
				}else{
					if(j%2!=0 && chess_status.charAt(j)=='F')answer++;
				}
			}
			
		}
		
		System.out.println(answer);
		
	}

}
