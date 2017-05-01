package LIst;
import java.util.*;
public class VectorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new Vector<String>();
		
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
