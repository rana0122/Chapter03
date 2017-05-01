package LIst;
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기존배열을 더 큰배열에 복사 시키고 확장시킴
		//장점 :순차적(앞에서) 접근에 유리함(빠름),DB같은 경우 중간에 삽입이 많이 일어나지 않아서 이런 경우 유리함
		//단점:중간에 삽입 삭제가 어려움.
		//벡터와 리스트의 가장 큰 차이점은 자료구조에 항목을 삽입하고 삭제하는 동작이 동기화되어 수행되는지 여부임.
		//리스트는 삽입과 삭제가 동기화되어 있지 않음-외부적 동기화 필요
		List<String> list = new ArrayList<String>();
		
		list.add("마이콜");
		list.add("둘리");
		list.add("도우넛");
		
		int count =list.size();
		for(int i =0;i<count;i++){
			String s=list.get(i);
			System.out.println(s);
		}
		
		list.remove(1);
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}

	}

}
