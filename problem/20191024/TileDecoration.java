package level1;

public class TileDecoration {

	public static void main(String[] args) {
		System.out.println(solution(5));
		System.out.println(solution(6));

	}
	
	public static long solution(int N) {
		long width = 1;
		long height = 1;
		
		for(int i = 1 ; i < N ; i ++) {
			if(i%2==0) {
				height = height + width;
			}else {
				width = width + height;
			}
		}
		
		return (width + height)*2;
	}

}


/*
 * ÃâÃ³ : https://programmers.co.kr/learn/courses/30/lessons/43104
 * 
 * 
 * */