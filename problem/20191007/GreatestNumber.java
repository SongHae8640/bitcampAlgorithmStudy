package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class GreatestNumber {

	public static void main(String[] args) {
		//System.out.println(solution(new int[] {6, 10, 2}));
		System.out.println(solution(new int[] {3, 30, 34, 5, 9}));

	}
	
	static int maxNum=0;
	
    public static String solution(int[] numbers) {
        ArrayList<NumberArr> aList = new ArrayList<NumberArr>();
        for (int i = 0; i < numbers.length; i++) {
        	aList.add(new NumberArr(numbers[i]));
		}
        
       Collections.sort(aList);

       dfs(aList, "");
		
		
        
        return maxNum+"";
    }

	private static void dfs(ArrayList<NumberArr> aList, String strMaxNum) {
		int firstNum;
		if(aList.size()==0) {
			if(maxNum < Integer.parseInt(strMaxNum)) {
				maxNum = Integer.parseInt(strMaxNum);
			}
			return;
		}else {
			firstNum = aList.get(0).numberAr[0];
			int idx=0;
			//앞자리가 가장 큰 값
			while(true) {
				if(aList.get(idx).numberAr[0] == firstNum) {
					strMaxNum = strMaxNum + aList.get(idx).originNum;
					ArrayList<NumberArr> tempList = new ArrayList<NumberArr>();
			        for (int i = 0; i < aList.size(); i++) {
			        	if(i != idx) {
			        		tempList.add(aList.get(i));
			        	}
					}
			        dfs(tempList, new String(strMaxNum));
				}else {
					break;
				}
				
			}
			
		}
		
		
	}
}

class NumberArr implements Comparable<NumberArr>{
	int[] numberAr;  
	int originNum;
	
	public NumberArr(int num) {
		this.originNum = num;
		numberAr = new int[(num+"").length()];
		for(int i = 0 ; i < numberAr.length ; i++) {
			numberAr[i] = Integer.parseInt((num+"").substring(i, i+1));
		}
	}

	@Override
	public int compareTo(NumberArr o) {
		if(this.numberAr[0] > o.numberAr[0]) return -1;
		else if(this.numberAr[0] < o.numberAr[0]) return 1;
		return 0;
	}
	
}
