import java.util.HashMap;

public class Camouflage {

	public static void main(String[] args) {
		solution(new String[][] {{"yellow_hat", "headgear"}, 
								{"blue_sunglasses", "eyewear"}, 
								{"green_turban", "headgear"}});//5
		
		solution(new String[][] {{"crow_mask", "face"}, 
								{"blue_sunglasses", "face"}, 
								{"smoky_makeup", "face"}});//3

	}
	
	
    public static int solution(String[][] clothes) {
    	
    	int answer = 1;//아예안입진않으므로(최소1개)
    	//옷종류, 갯수
    	HashMap<String, Integer> map = new HashMap<>();
    	//[ㅑ][1]=옷종류
    	for(int i=0;i<clothes.length;i++) {
    		if(map.get(clothes)[i][1])==null){
    			map.put(clothes[i][1],1);//없으면 1값(안입은 경우의 0=>0,ㅁ,ㅠ=3)
    		}
    		else {
    			map.get(clothes[i][1],map.get(clothes[i][1])+1);//있으면+1
    		}
    	}
    	
    	for(String keys : map.keySet()) {//키(옷종류)의 값만
    		answer *= (map.get(keys)+1);
    	}
    	
    	//안입는 경우까지해서 전체개수+1
    	//2차배열이니까 전체 경우의 수는 ()*()
    	
    	
    
    	answer -=1;
        return answer;
    }
}


