package level2;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

	public static void main(String[] args) {
		solution(new String[][] {{"yellow_hat", "headgear"}, 
								{"blue_sunglasses", "eyewear"}, 
								{"green_turban", "headgear"}});
		
		solution(new String[][] {{"crow_mask", "face"}, 
								{"blue_sunglasses", "face"}, 
								{"smoky_makeup", "face"}});

	}
	
	
    public static int solution(String[][] clothes) {
    	int clothesCount = 1;
    	
    	//�� ������ ���� ���ϱ�
    	HashMap<String, Integer> clothAndCount = new HashMap<String, Integer>();
    	for (int i = 0; i < clothes.length; i++) {
    		if(clothAndCount.containsKey(clothes[i][1])) {
    			clothAndCount.put(clothes[i][1], clothAndCount.get(clothes[i][1]) +1);
    		}else {
    			clothAndCount.put(clothes[i][1], 1);
    		}
		}
    	
    		
		for (Map.Entry<String, Integer> entry : clothAndCount.entrySet()) {
			clothesCount *= (entry.getValue()+1);
		}
    	
		//�ƹ��͵� ������ ��� ����
        return clothesCount -1;
    }
}


/*
 * ���� : https://programmers.co.kr/learn/courses/30/lessons/42578
 * ���� level 2
 * 
 * Ǯ��
 * step1 �� �ǻ� ������ �� �ǻ��� ������ ���Ѵ�.
 * step2 (�� �ǻ� ���� +1)*(�� �ǻ� ���� +1) ...
 * step3 �ƹ��͵� ���� ���� ��찡 �ֱ� ������ -1 ���ش�
 * 
 * ���� ��� �Ӹ�3 �� 2, ����1 �� ��� �� ������ ������
 * (3+1)*(2+1)*(1+1) -1= 13�̴�.
 * �� �ǻ� ���� +1 �� ���� ���� �������� ���� ��찡 �߰� �Ȱ��̰�
 * �� �������� -1 �� ���� ��� ������ ���� ���� ���� ��츦 �� ���̴�.
 * 
 * 
 * ä�� ���
�׽�Ʈ 1 ��	��� (0.84ms, 52.2MB)
�׽�Ʈ 2 ��	��� (0.88ms, 52.3MB)
�׽�Ʈ 3 ��	��� (0.83ms, 50.9MB)
�׽�Ʈ 4 ��	��� (0.87ms, 52.3MB)
�׽�Ʈ 5 ��	��� (0.85ms, 52.4MB)
�׽�Ʈ 6 ��	��� (0.76ms, 50.8MB)
�׽�Ʈ 7 ��	��� (0.90ms, 52.9MB)
�׽�Ʈ 8 ��	��� (0.85ms, 52.5MB)
�׽�Ʈ 9 ��	��� (0.78ms, 52.2MB)
�׽�Ʈ 10 ��	��� (0.85ms, 52MB)
�׽�Ʈ 11 ��	��� (0.84ms, 52.3MB)
�׽�Ʈ 12 ��	��� (0.85ms, 52.8MB)
�׽�Ʈ 13 ��	��� (0.59ms, 52.3MB)
�׽�Ʈ 14 ��	��� (0.78ms, 52.1MB)
�׽�Ʈ 15 ��	��� (0.79ms, 52.8MB)
�׽�Ʈ 16 ��	��� (0.85ms, 50.4MB)
�׽�Ʈ 17 ��	��� (0.85ms, 52.4MB)
�׽�Ʈ 18 ��	��� (0.89ms, 52.4MB)
�׽�Ʈ 19 ��	��� (0.81ms, 52.5MB)
�׽�Ʈ 20 ��	��� (0.87ms, 52.8MB)
�׽�Ʈ 21 ��	��� (0.90ms, 50.7MB)
�׽�Ʈ 22 ��	��� (0.71ms, 50.5MB)
�׽�Ʈ 23 ��	��� (0.90ms, 50.8MB)
�׽�Ʈ 24 ��	��� (0.91ms, 50.1MB)
�׽�Ʈ 25 ��	��� (0.92ms, 52.1MB)
�׽�Ʈ 26 ��	��� (0.90ms, 53.4MB)
�׽�Ʈ 27 ��	��� (0.78ms, 52.1MB)
�׽�Ʈ 28 ��	��� (0.87ms, 52.4MB)
 * */