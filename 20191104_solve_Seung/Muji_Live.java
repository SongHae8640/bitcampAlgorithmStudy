package javapro;
import java.util.*;
public class Muji_Live {
	//����Ž��
	public static void main(String[] args){
		int[] food_times = {3,1,2};
		long k = 5;
		//���� �ð����� ���� ����-> �Ծ���ϴ� ������ ���� ������ ���� ����
		solution(food_times, k);
		System.out.println(solution(food_times, k));
	}
	
	static class Food{
		int time;
		int num;
		Food(int t, int i){
			time = t;
			num = i;
		}
	};
	
	static Comparator<Food> CompTime = new Comparator<Food>(){
		public int compare(Food a, Food b){
			return a.time - b.time;
		}
	};
	
	static Comparator<Food> CompNum = new Comparator<Food>(){
		public int compare(Food a, Food b){
			return a.num - b.num;
		}
	};
	
    public static int solution(int[] food_times, long k) {
        List<Food> foods = new LinkedList<Food>();
        int n = food_times.length;
        for(int i=0;i<n;i++){
        	foods.add(new Food(food_times[i],i+1));
        	//�ð��� ������ ��� for������ �ð������� ����
        }
        //�ð�����
        foods.sort(CompTime);
        
        int pretime = 0;
        int i = 0;
        for(Food f : foods){
        	long differ = f.time - pretime;
        	//�ð��� �������->���̰� ����->differ = 0
        	if(differ != 0){
        		long spend = differ * n;
        		if(spend <= k){
        			k-=spend;
        			pretime = f.time;
        		}else {
        			k %= n;
        			foods.subList(i, food_times.length).sort(CompNum);
        			//���� ���ĵ��� ���� ����
        			return foods.get(i+(int)k).num;
        		}
        	}
        	i++;
        	n--;//�ٸ������Ļ���
        }
        return -1;
    }
}
