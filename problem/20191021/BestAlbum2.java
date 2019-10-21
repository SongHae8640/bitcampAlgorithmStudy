package level3;

import java.util.*;

public class BestAlbum2 {

	public static void main(String[] args) {
		System.out.println(solution(new String[] {"classic", "pop", "classic", "classic", "pop"}, new int[] {500, 600, 150, 800, 2500}));

	}
	public static int[] solution(String[] genres, int[] plays) {
		Map<String,Album> albums = new HashMap<String,Album>();
		
		for (int i = 0; i < plays.length; i++) {
			if(albums.containsKey(genres[i])) { // 해당 장르가 있는경우
				albums.get(genres[i]).addSong(plays[i], i);
			}else {//장르가 없는 경우
				albums.put(genres[i], new Album(genres[i], plays[i], i));
				
			}
		}
		
		List<Album> albumList = new ArrayList<Album>();
		
		for(String key : albums.keySet()) {
			Album tempAlbum = albums.get(key);
			tempAlbum.sortBySong();
			albumList.add(tempAlbum);
		}
		
		
		albumList.sort(new Comparator<Album>() {

			@Override
			public int compare(Album o1, Album o2) {
				// TODO Auto-generated method stub
				return o2.playSum -o1.playSum;
			}
		});
		
		
		
		ArrayList<Integer> resultArr = new ArrayList<Integer>();
		
		for (Album album : albumList) {
			ArrayList<Song> tempSongs = album.songs;
			resultArr.add(tempSongs.get(0).uniqueNum);
			
			try {
				resultArr.add(tempSongs.get(1).uniqueNum);
			} catch (Exception e) {
				continue;
			}
		}
		
		
        int[] answer = new int[resultArr.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = resultArr.get(i);
		}
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

/*
 * 출처 :https://programmers.co.kr/learn/courses/30/lessons/42579
 * 
 * 장르에 노래가 하나만 있을대 for문 안에 있는 break가 for문 전체를 끝내버려서 오류가 남
 * > continue로 변경했더니 정상 작동
 * 
테스트 1 〉	통과 (3.24ms, 51.8MB)
테스트 2 〉	통과 (2.82ms, 52.3MB)
테스트 3 〉	통과 (3.20ms, 52.1MB)
테스트 4 〉	통과 (3.16ms, 50.4MB)
테스트 5 〉	통과 (3.46ms, 50.1MB)
테스트 6 〉	통과 (2.89ms, 52.3MB)
테스트 7 〉	통과 (3.25ms, 52.5MB)
테스트 8 〉	통과 (3.42ms, 52.1MB)
테스트 9 〉	통과 (3.21ms, 52.4MB)
테스트 10 〉	통과 (3.03ms, 52.1MB)
테스트 11 〉	통과 (3.47ms, 52.9MB)
테스트 12 〉	통과 (3.19ms, 54.5MB)
테스트 13 〉	통과 (3.39ms, 50.4MB)
테스트 14 〉	통과 (3.02ms, 54.8MB)
테스트 15 〉	통과 (3.28ms, 52MB)
 * */
