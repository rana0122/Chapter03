package LIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//노드와 데이타로 이루어져서 노드를 그다음 데이타에 연결시킴.
		//단점 :순차적 접근에 불리함. 모든 데이타를 검색해서 접근가능
		//장점 :중간에 데이타를 삽입,삭제에 유리함. 임의로 수정하기에 유리함.
		//벡터와 리스트의 가장 큰 차이점은 자료구조에 항목을 삽입하고 삭제하는 동작이 동기화되어 수행되는지 여부임.
		//리스트는 삽입과 삭제가 동기화되어 있지 않음-외부적 동기화 필요
		List<String> list = new LinkedList<String>();
		
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
