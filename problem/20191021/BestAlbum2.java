package level3;

import java.util.*;

public class BestAlbum2 {

	public static void main(String[] args) {
		System.out.println(solution(new String[] {"classic", "pop", "classic", "classic", "pop"}, new int[] {500, 600, 150, 800, 2500}));

	}
	public static int[] solution(String[] genres, int[] plays) {
		Map<String,Album> albums = new HashMap<String,Album>();
		
		for (int i = 0; i < plays.length; i++) {
			if(albums.containsKey(genres[i])) { // �ش� �帣�� �ִ°��
				albums.get(genres[i]).addSong(plays[i], i);
			}else {//�帣�� ���� ���
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
 * ��ó :https://programmers.co.kr/learn/courses/30/lessons/42579
 * 
 * �帣�� �뷡�� �ϳ��� ������ for�� �ȿ� �ִ� break�� for�� ��ü�� ���������� ������ ��
 * > continue�� �����ߴ��� ���� �۵�
 * 
�׽�Ʈ 1 ��	��� (3.24ms, 51.8MB)
�׽�Ʈ 2 ��	��� (2.82ms, 52.3MB)
�׽�Ʈ 3 ��	��� (3.20ms, 52.1MB)
�׽�Ʈ 4 ��	��� (3.16ms, 50.4MB)
�׽�Ʈ 5 ��	��� (3.46ms, 50.1MB)
�׽�Ʈ 6 ��	��� (2.89ms, 52.3MB)
�׽�Ʈ 7 ��	��� (3.25ms, 52.5MB)
�׽�Ʈ 8 ��	��� (3.42ms, 52.1MB)
�׽�Ʈ 9 ��	��� (3.21ms, 52.4MB)
�׽�Ʈ 10 ��	��� (3.03ms, 52.1MB)
�׽�Ʈ 11 ��	��� (3.47ms, 52.9MB)
�׽�Ʈ 12 ��	��� (3.19ms, 54.5MB)
�׽�Ʈ 13 ��	��� (3.39ms, 50.4MB)
�׽�Ʈ 14 ��	��� (3.02ms, 54.8MB)
�׽�Ʈ 15 ��	��� (3.28ms, 52MB)
 * */
