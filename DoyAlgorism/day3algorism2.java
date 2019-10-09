package DoyAlgorism;

import java.util.Arrays;
import java.util.HashMap;

public class day3algorism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";

		// String[] participant = { "leo", "kiki", "eden" };
		// String[] completion = { "kiki", "eden" };
		// String[] participant = { "marina", "josipa", "nikola",
		// "vinko","filipa" };
		// String[] completion = { "marina", "josipa", "nikola", "filipa" };
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "mislav", "stanko", "ana" };

		// 효율성 탈락한것
		// for (int i = 0; i < completion.length; i++) {
		// System.out.println("완료자:"+completion[i]);
		// for (int j = 0; j < participant.length; j++) {
		// System.out.println("참가자:"+participant[j]);
		// if(completion[i].equals(participant[j])){
		// participant[j]="-1";
		// break;
		// }
		// }
		// }
		// for (int j = 0; j < participant.length; j++) {
		// if(participant[j]!="-1"){
		// answer=participant[j];
		// }
		// }
		//
		// System.out.println("--------------------");
		// System.out.println("return:"+answer);

//		// 효율성 통과
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		int i = 0;
//		try {
//			for (i = 0; i < participant.length; i++) {
//				System.out.println("참가자:" + participant[i]);
//				System.out.println("완주자:" + completion[i]);
//				if (!(participant[i].equals(completion[i]))) {
//					answer = participant[i];
//					System.out.println("1");
//					break;
//				}
//			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			answer = participant[i];
//		}
//		System.out.println(answer);

		 HashMap<String, Integer> hm = new HashMap<>();
		 for (String player : participant) {
		 hm.put(player, hm.getOrDefault(player, 0) + 1);
		 System.out.println(player+hm.get(player));
		 }
		System.out.println("--------------");
		for (String player : completion) {
		 hm.put(player, hm.get(player) - 1);
		 System.out.println(player+hm.get(player));
		 }
		 System.out.println("--------------");
		 for (String key : hm.keySet()) {
		 System.out.println(key+hm.get(key));
		 if (hm.get(key) != 0){
		 answer = key;
		 }
		 }

	}

}
