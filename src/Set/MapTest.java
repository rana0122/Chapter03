package Set;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("둘리", new Integer(10));//map.put("둘리", 10);
		map.put("도우넛", 90);//auto boxing
		map.put("마이콜", 80);
		map.put("또치", 70);
	
		System.out.println(map.get(new String("도우넛")));
		System.out.println(map.get("또치"));
		System.out.println(map.size());//size 4
		
		map.put("둘리", 95);
		System.out.println(map.size());//size 4
		System.out.println(map.size()+":"+map.get("둘리"));//기존 데이타 삭제 후 업데이트 됨
		
		//평균 구하기 키는 셋에 저장되어 있다.
		Set <String> set =map.keySet();
		int count = set.size();
		int sum=0;
		
		Iterator <String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			int score =map.get(key);//auto one boxing
			sum+=score;
		}
		System.out.println("평균 :"+(sum/count));

	}

}
