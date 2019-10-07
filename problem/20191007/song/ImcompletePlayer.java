package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;


public class ImcompletePlayer {

	public static void main(String[] args) {
		String[] a = {"leo", "kiki", "eden"};
		String[] b = {"leo", "kiki", "eden"};
		System.out.println(solution(a, b));

	}

	
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for (int i = 0; i < completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
        return participant[participant.length-1];
    }

}
