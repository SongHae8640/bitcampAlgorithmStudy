import java.util.Scanner;

public class No1100WhiteBlank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pawnCountInWhite =0;
		
		for(int rowNum = 0; rowNum < 8 ; rowNum++) {
			String row = sc.next();
			char[] colInRow = row.toCharArray();
			
			for (int colNum = 0; colNum < colInRow.length; colNum++) {
				if(( (rowNum+colNum)%2==0) && colInRow[colNum] == 'F') {
					pawnCountInWhite++;
				}
			}
			
			
		}
		
		System.out.println(pawnCountInWhite);
		

	}

}

/*
 *  문제 출처 : https://www.acmicpc.net/problem/1100
 *  
 *  메모리:14192KB	
 *  시간 : 100ms
 */