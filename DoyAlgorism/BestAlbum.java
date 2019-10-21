package DoyAlgorism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAlbum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] genres = { "classic", "pop", "classic", "classic", "pop", "jazz" };
		int[] plays = { 500, 600, 150, 800, 2500, 2000 };
		solution(genres, plays);

	}

	public static int[] solution(String[] genres, int[] plays) {
		
		//재생횟수 많은 순으로 나열
		Map<String, Integer> map = new HashMap<String, Integer>();
		//장르 가장 많이 들은 순으로 나열
		Map<String, Integer> rmap = new HashMap<String, Integer>();
		//int 배열에 저장하기 위한 list
		List<String> list=new ArrayList<String>();
		
		//장르 많이 들은순으로 나열
		//일단 배열 생성해서 장르별 누적 곡 재생수 저장
		for (int i = 0; i < genres.length; i++) {
			if (rmap.get(genres[i]) == null) {
				rmap.put(genres[i], plays[i]);
			} else {
				rmap.put(genres[i], rmap.get(genres[i]) + plays[i]);
			}
		}
		
		System.out.println("장르별 누적곡 재생수:" + rmap);
		System.out.println("---------------");
		
		// 누적곡 재생수 내림차순 정렬 //
		List<String> keySetList1 = new ArrayList<>(rmap.keySet());
		Collections.sort(keySetList1, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return rmap.get(o2).compareTo(rmap.get(o1));
			}
		});

		for (String key : keySetList1) {
			System.out.println(String.format("Key : %s, Value : %s", key, rmap.get(key)));
			
		}
		System.out.println(keySetList1);

		
		//가장 많이 들은 곡 순으로 나열
		//곡 별로 map에 저장
		for (int i = 0; i < genres.length; i++) {
			//jazz-5 형식으로 많은 순대로 저장
			map.put(genres[i] + "-" + i, plays[i]);
		}

		List<String> keySetList = new ArrayList<>(map.keySet());
		// 내림차순 //
		Collections.sort(keySetList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return map.get(o2).compareTo(map.get(o1));
			}
		});
		
		String[] test={};
		
		for (String key1 : keySetList1) {
			int cnt=0;
			for (String key : keySetList) {
				test=key.split("-");
				if (key.contains(key1)) {
					System.out.println(test[0]);
					System.out.println(test[1]);
					//스플릿으로 나눈 뒤에것을 저장함 ex)jazz-5 의 뒤에 숫자 5를 list에 저장
					list.add(test[1]);
					System.out.println(key);
					System.out.println(String.format("Key : %s, Value : %s", key1, rmap.get(key1)));
					//2개 이상되면 멈춤
					if(cnt==1){
						break;
					}
					cnt++;
				}
			}
			System.out.println("----------------");
			
		}
		
		//list로 저장한것을 int 배열로 변경해서 제출
		System.out.println(map);
		System.out.println(list);
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i]=Integer.parseInt(list.get(i));
		}
		return answer;
	}
	



}

/*
 * ��ó :https://programmers.co.kr/learn/courses/30/lessons/42579
 * 
 * 
 * 테스트 1 〉	통과 (26.01ms, 54.6MB)
테스트 2 〉	통과 (29.49ms, 55MB)
테스트 3 〉	통과 (26.42ms, 54.5MB)
테스트 4 〉	통과 (25.85ms, 54.4MB)
테스트 5 〉	통과 (28.21ms, 54.5MB)
테스트 6 〉	통과 (27.64ms, 55MB)
테스트 7 〉	통과 (26.71ms, 54.7MB)
테스트 8 〉	통과 (25.68ms, 54.5MB)
테스트 9 〉	통과 (26.65ms, 54.5MB)
테스트 10 〉	통과 (29.44ms, 52.8MB)
테스트 11 〉	통과 (26.60ms, 54.5MB)
테스트 12 〉	통과 (26.26ms, 54.2MB)
테스트 13 〉	통과 (28.30ms, 54.7MB)
테스트 14 〉	통과 (28.03ms, 54.7MB)
테스트 15 〉	통과 (27.64ms, 54.5MB)
테스트 15 〉	
 */
