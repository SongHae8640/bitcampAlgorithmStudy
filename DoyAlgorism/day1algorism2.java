package DoyAlgorism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class day1algorism2 {

	private static int answer=1;

	public static void main(String[] args){
		String[][] te1=new String[][] {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};
		String[][] te2=new String[][] {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
		String[][] te3=new String[][] {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"},{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
		
		Map<String, Integer> map=new HashMap<>();
		
		//옷종류 갯수 구하기
		for (int i = 0; i < te3.length; i++) {
			String key=te3[i][1];
//			System.out.println(key);
			if(map.get(key)==null){
				map.put(key,1);
			}else{
				map.put(key,map.get(key)+1);
			}
		}
		
		System.out.println("11:"+map);
		System.out.println(map.values());
		
		//공식에 의한 옷갈아입기 횟수
		for (int cnt : map.values()) {
			System.out.println(cnt);
			answer*=(cnt+1);
		}
		answer+=-1;
		System.out.println("answer:"+answer);
		
		
	}
}
  