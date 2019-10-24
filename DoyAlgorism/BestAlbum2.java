package DoyAlgorism;

import java.util.*;

public class BestAlbum2 {

	public static void main(String[] args) {
		System.out.println(solution(new String[] { "classic", "pop", "classic", "classic", "pop" },
				new int[] { 500, 600, 150, 800, 2500 }));

	}

	public static int[] solution(String[] genres, int[] plays) {
		Map<String, Album> albums = new HashMap<String, Album>();

		for (int i = 0; i < plays.length; i++) {
			if (albums.containsKey(genres[i])) { // 해당 장르가 있는경우
				albums.get(genres[i]).addSong(plays[i], i);
			} else {// 장르가 없는 경우
				albums.put(genres[i], new Album(genres[i], plays[i], i));

			}
		}

		List<Album> albumList = new ArrayList<Album>();

		for (String key : albums.keySet()) {
			Album tempAlbum = albums.get(key);
			tempAlbum.sortBySong();
			albumList.add(tempAlbum);
		}

		albumList.sort(new Comparator<Album>() {

			@Override
			public int compare(Album o1, Album o2) {
				// TODO Auto-generated method stub
				return o2.playSum - o1.playSum;
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

class Album {
	String genre;
	int playSum;
	ArrayList<Song> songs = new ArrayList<Song>();

	public Album(String genre, int play, int uniqueNum) {
		super();
		this.genre = genre;
		this.playSum = play;
		this.songs.add(new Song(play, uniqueNum));
	}

	public void sortBySong() {
		// 고유 번호      정렬
		songs.sort(new Comparator<Song>() {
			@Override
			public int compare(Song o1, Song o2) {
				// TODO Auto-generated method stub
				return o1.uniqueNum - o2.uniqueNum;
			}
		});

		// 재생된 횟수 내림차순
		this.songs.sort(new Comparator<Song>() {
			@Override
			public int compare(Song o1, Song o2) {
				// TODO Auto-generated method stub
				return o2.playTime - o1.playTime;
			}
		});

	}

	public void addSong(int play, int uniqueNum) {
		this.playSum += play;
		this.songs.add(new Song(play, uniqueNum));
	}

}

class Song {
	int playTime;
	int uniqueNum;

	public Song(int playTime, int uniqueNum) {
		super();
		this.playTime = playTime;
		this.uniqueNum = uniqueNum;
	}
}
