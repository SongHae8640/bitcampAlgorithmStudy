package DoyAlgorism;

import java.util.Arrays;
import java.util.Comparator;

public class day3algorism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numbers = { 6, 10, 2 };
		// int[] numbers={3, 30, 34, 5, 9};
		String answer="";
		int[] numbers = { 3, 30, 34, 5, 9, 0,0, 30 ,41,42,43,989,979};

		 String[] arr = new String[numbers.length];
		 
		for (int i = 0; i < numbers.length; i++) {
			arr[i] = (String.valueOf(numbers[i]));
		}
		
		Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
//            	System.out.println("1:"+s1);
//            	System.out.println("2:"+s2);
//            	System.out.println((s2+s1).compareTo(s1+s2));
                return (s2+s1).compareTo(s1+s2); 
            }
        });
		
		//0000 처럼 0으로만 구성되어있으면 0 return
        if (arr[0].equals("0")) answer+="0";
//        if (arr[0].equals("0")) return "0";
        
        //그 외의 경우 순차적으로 연결하여 answer return
        for (int i = 0; i < arr.length; i++) {
            answer+=arr[i];
        }
        
        System.out.println(answer);
	}

}
