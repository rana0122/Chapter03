package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Value> set = new HashSet<Value>();
		
		Value v1 =new Value(10,20);
		Value v2 =new Value(10,20);
		
		set.add(v1);
		set.add(v2);
		// 입력한 객체를 가지고 있는지 확인하는 메소드
		System.out.println(set.contains(new Value(10,20)));
		
		//순서가 없기때문에 인덱스로 빼올수는 없음 다만 순회는 가능함 iterator로 순회하자
		Iterator<Value> it = set.iterator();
		
		while(it.hasNext()){
			Value v =it.next();
			System.out.println(v.hashCode());
			//System.out.println(v);
		}
		set.remove(new Value(10,20));
		System.out.println(set.size());
	}

}
