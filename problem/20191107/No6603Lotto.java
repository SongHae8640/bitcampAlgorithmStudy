package DfsBfs;

import java.util.Scanner;
import java.util.Stack;

public class No6603Lotto {
	static Stack<Integer> ballBuket = new Stack<Integer>();
	static int[] s;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input=  sc.nextLine();
			String[] inputArr = input.split(" ");
			
			if(inputArr[0].equals("0")) break;
			
			s = new int[Integer.parseInt(inputArr[0])];
			
			for(int i = 0 ; i < s.length ; i++) {
				s[i] = Integer.parseInt(inputArr[i+1]);
			}
			pickLottoBalls(0, 0);
			System.out.println();
			
		}

	}

	private static void pickLottoBalls(int startIdx, int pickCount) {
		if(pickCount ==6) {
			//뽑은 볼을 보여준다.
			for (int i = 0; i < ballBuket.size(); i++) {
				System.out.print(ballBuket.get(i) +" ");
			}
			System.out.println();
		}else {
			for(int i=startIdx ; i <= s.length-6+startIdx +1 ; i++) {
				if(i >= s.length) {
					break;	
				}
				ballBuket.add(s[i]);
				pickLottoBalls(i+1,pickCount+1);
				ballBuket.pop();
			}
		}
		
	}

}
