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
    	
    	int answer = 1;//�ƿ������������Ƿ�(�ּ�1��)
    	//������, ����
    	HashMap<String, Integer> map = new HashMap<>();
    	//[��][1]=������
    	for(int i=0;i<clothes.length;i++) {
    		if(map.get(clothes)[i][1])==null){
    			map.put(clothes[i][1],1);//������ 1��(������ ����� 0=>0,��,��=3)
    		}
    		else {
    			map.get(clothes[i][1],map.get(clothes[i][1])+1);//������+1
    		}
    	}
    	
    	for(String keys : map.keySet()) {//Ű(������)�� ����
    		answer *= (map.get(keys)+1);
    	}
    	
    	//���Դ� �������ؼ� ��ü����+1
    	//2���迭�̴ϱ� ��ü ����� ���� ()*()
    	
    	
    
    	answer -=1;
        return answer;
    }
}


