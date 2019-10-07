package javapro;

import java.util.*;
public class Marathon {

	class Solution {
		public String solution(String[] participant, String[] completion) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (String stu : participant) {
				map.put(stu, map.get(stu) == null ? 1 : map.get(stu) + 1);
			}
			for (String stu : completion) {
				if (map.get(stu) > 1) {
					map.put(stu, map.get(stu) - 1);
				} else if (map.get(stu) == 1) {
					map.remove(stu);
            }
        }

			return map.toString().substring(1, map.toString().length() - 3);
		}
	}


}