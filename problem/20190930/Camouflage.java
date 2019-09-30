import java.util.HashMap;
import java.util.Iterator;


public class Camouflage_juhee {

	public static void main(String[] args) {
		int result = solution(new String[][] {{"yellow_hat", "headgear"}, 
								{"blue_sunglasses", "eyewear"}, 
								{"green_turban", "headgear"}});
		System.out.println(result);
		
		solution(new String[][] {{"crow_mask", "face"}, 
								{"blue_sunglasses", "face"}, 
								{"smoky_makeup", "face"}});

		}
	
	
    public static int solution(String[][] clothes) {
    	
    	int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            if(!map.containsKey(key)) {
                //옷종류의 개수가 하나도 없을 경우
                map.put(key, 1);
            } else {
                //있으면 옷이 있을때마다 추가
                map.put(key, map.get(key) + 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        //값이 있으면 while문 실행
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
            //전체 경우의 수
        }
        
        //아무것도 입지 않았을 때 : 전부 0 > 빼준다
        //최소 1개는 입어야하므로
        //전체 경우의수 -1
        return answer-1;
    	
    }
}

