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
                //�������� ������ �ϳ��� ���� ���
                map.put(key, 1);
            } else {
                //������ ���� ���������� �߰�
                map.put(key, map.get(key) + 1);
            }
        }
        Iterator<Integer> it = map.values().iterator();
        //���� ������ while�� ����
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
            //��ü ����� ��
        }
        
        //�ƹ��͵� ���� �ʾ��� �� : ���� 0 > ���ش�
        //�ּ� 1���� �Ծ���ϹǷ�
        //��ü ����Ǽ� -1
        return answer-1;
    	
    }
}

