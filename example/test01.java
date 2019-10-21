package example;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n=2~20
		int[] arr = new int[20];
		int[] price={1, 1, 1, 1, 1};
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1;
		}
		int target = 3;
		
		System.out.println(new test01().solution(price, target));

	}

	private int solution(int[] number, int target) {
		// TODO Auto-generated method stub
		return Dfs(number, target, 0, 0);
	}

	private int Dfs(int[] number, int target, int i, int j) {
		// TODO Auto-generated method stub
		if (i == number.length) {
			return j == target ? 1 : 0;
		} else {
			return Dfs(number, target, i + 1, j + number[i]) 
					+ Dfs(number, target, i + 1, j - number[i]);
		}
	}

}
