package trophy;

import java.util.Scanner;

public class Trophy {

	public static void main(String[] args) {
		
		int left=1;
		int right=1;
		Scanner scan=new Scanner(System.in);
		
		int trophy_num=scan.nextInt();
		int[] display=new int[trophy_num];
		
		for(int i=0;i<trophy_num;i++){
			int height=scan.nextInt();
			display[i]=height;
		}
		
		int left_view=display[0];
		for(int i=1;i<trophy_num;i++){
			if(left_view<display[i]){
				left++;
				left_view=display[i];
			}
		}
		
		
		int right_view=display[display.length-1];
		for(int i=trophy_num-2;i>=0;i--){
			if(right_view<display[i]){
				right++;
				right_view=display[i];
			}
		}
		
		System.out.println(left);
		System.out.println(right);
		
	}

}
