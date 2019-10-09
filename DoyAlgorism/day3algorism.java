package DoyAlgorism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day3algorism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] numbers = { 6, 10, 2 };
		int[] numbers = { 3, 30, 34, 5, 9, 0, 30 ,301,310,41,42,43 ,989,979};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < numbers.length; i++) {
			map.put(numbers[i], numbers[i]);
			for (int j = 0; j < 2; j++) {
				if (map.get(numbers[i]) >= 10) {
					map.put(numbers[i], map.get(numbers[i]) / 10);
				}
			}
		}
		

		List<Integer> keySetList = new ArrayList<>(map.keySet());

		Collections.sort(keySetList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
//				System.out.println("1:"+o1+o2);
//				System.out.println("2:"+o2);
				return map.get(o2).compareTo(map.get(o1));
//				return 0;
			}
		});

		String answer = "";
		System.out.println(keySetList);
		for (Integer key : keySetList) {
			System.out.println(String.format("Key : %s, Value : %s", key, map.get(key)));
			answer += key;
			int sum=key+key+1;
		}
		System.out.println("test:" + answer);
	}

}
