package javapro;
import java.util.*;
public class Muji_Live {
	//완전탐색
	public static void main(String[] args){
		int[] food_times = {3,1,2};
		long k = 5;
		//음식 시간별로 먼저 정렬-> 먹어야하는 순서와 음식 순서를 같이 정리
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
        	//시간과 순서로 묶어서 for문돌려 시간순으로 정렬
        }
        //시간순서
        foods.sort(CompTime);
        
        int pretime = 0;
        int i = 0;
        for(Food f : foods){
        	long differ = f.time - pretime;
        	//시간이 같은경우->차이가 없다->differ = 0
        	if(differ != 0){
        		long spend = differ * n;
        		if(spend <= k){
        			k-=spend;
        			pretime = f.time;
        		}else {
        			k %= n;
        			foods.subList(i, food_times.length).sort(CompNum);
        			//남은 음식들의 순서 정리
        			return foods.get(i+(int)k).num;
        		}
        	}
        	i++;
        	n--;//다먹은음식빼기
        }
        return -1;
    }
}
