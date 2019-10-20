package DoyAlgorism;

import java.util.HashMap;
import java.util.Map;

public class day5algorism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "try hello world";
		String answer = "";

		String[] t = s.split(" ", -1);

		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);

			char[] ch = t[i].toCharArray();

			for (int j = 0; j < ch.length; j++) {
				if (j % 2 == 0) {
					ch[j] = Character.toUpperCase(ch[j]);
					System.out.println(ch[j]);
					answer += ch[j];
				} else {
					ch[j] = Character.toLowerCase(ch[j]);
					System.out.println(ch[j]);
					answer += ch[j];
				}
			}

			if (i != t.length - 1) {
				answer += " ";
			}
		}
		System.out.println(answer);
	}
	
	//속도 가장 빠름
//	String[] word = s.split("");
//    //t,r,y, ,h,e,l,l,o, ,w,o,r,l,d(°ø¹éÆ÷ÇÔ)
//    int cnt=0;
//    
//    for(int i=0;i<word.length;i++){
//        if(word[i].equals(" ")){
//            cnt=0;
//        }else{
//            cnt+=1;
//        }
//        
//        if(cnt%2==0){
//            word[i] = word[i].replace(word[i],word[i].toLowerCase());
//        }else{
//            word[i] = word[i].replace(word[i],word[i].toUpperCase());
//        }
//        answer += word[i];
//    }
//    System.out.println(answer);


	/*
	 * lv1 https://programmers.co.kr/learn/courses/30/lessons/12930
	 */
	// 테스트 결과
//	테스트 1 〉	통과 (36.47ms, 55.4MB)
//	테스트 2 〉	통과 (30.94ms, 55MB)
//	테스트 3 〉	통과 (35.00ms, 54.4MB)
//	테스트 4 〉	통과 (41.38ms, 54.8MB)
//	테스트 5 〉	통과 (37.58ms, 55.7MB)
//	테스트 6 〉	통과 (26.87ms, 55.1MB)
//	테스트 7 〉	통과 (45.01ms, 55.7MB)
//	테스트 8 〉	통과 (41.05ms, 55.7MB)
//	테스트 9 〉	통과 (40.51ms, 55.8MB)
//	테스트 10 〉	통과 (36.53ms, 55.5MB)
//	테스트 11 〉	통과 (43.49ms, 55.7MB)
//	테스트 12 〉	통과 (37.35ms, 53.5MB)
//	테스트 13 〉	통과 (39.17ms, 55.5MB)
//	테스트 14 〉	통과 (38.47ms, 55.6MB)
//	테스트 15 〉	통과 (38.71ms, 53.4MB)
//	테스트 16 〉	통과 (39.69ms, 52.6MB)

}
