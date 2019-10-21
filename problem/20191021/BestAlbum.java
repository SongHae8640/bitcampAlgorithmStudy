package level3;
import java.util.*;

class BestAlbum {
	public static void main(String[] args) {
		String[] genres = { "classic", "pop", "classic", "classic", "pop", "jazz" };
        int[] plays = { 500, 600, 150, 800, 2500, 2000 };
		solution(genres, plays);
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
				break;
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


class Album{
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
		//���� ��ȣ ������������ ����
		songs.sort(new Comparator<Song>() {
			@Override
			public int compare(Song o1, Song o2) {
				// TODO Auto-generated method stub
				return o1.uniqueNum - o2.uniqueNum;
			}
		});
		
		
		//����� Ƚ�� ��������
		this.songs.sort(new Comparator<Song>() {
			@Override
			public int compare(Song o1, Song o2) {
				// TODO Auto-generated method stub
				return o2.playTime-o1.playTime;
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

/*
 * ��ó :https://programmers.co.kr/learn/courses/30/lessons/42579
 * 
�׽�Ʈ 1 ��	��� (3.05ms, 50.4MB)
�׽�Ʈ 2 ��	��� (3.33ms, 50.5MB)
�׽�Ʈ 3 ��	��� (3.24ms, 51.8MB)
�׽�Ʈ 4 ��	��� (3.40ms, 50.7MB)
�׽�Ʈ 5 ��	��� (3.40ms, 52.4MB)
�׽�Ʈ 6 ��	��� (3.56ms, 52.4MB)
�׽�Ʈ 7 ��	��� (3.27ms, 54.5MB)
�׽�Ʈ 8 ��	���� (4.81ms, 54.6MB)
�׽�Ʈ 9 ��	���� (4.69ms, 50.4MB)
�׽�Ʈ 10 ��	��� (3.40ms, 52.9MB)
�׽�Ʈ 11 ��	��� (3.40ms, 52.2MB)
�׽�Ʈ 12 ��	��� (3.30ms, 52.7MB)
�׽�Ʈ 13 ��	��� (3.34ms, 52.8MB)
�׽�Ʈ 14 ��	��� (3.59ms, 50.3MB)
�׽�Ʈ 15 ��	��� (3.22ms, 52.4MB)
 * */
