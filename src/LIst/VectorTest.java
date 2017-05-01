package LIst;
import java.util.*;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//벡터와 리스트의 가장 큰 차이점은 자료구조에 항목을 삽입하고 삭제하는 동작이 동기화되어 수행되는지 여부임.
		//벡터는 동기화도니 삽입 삭제 동작 제공
		//Stack 은 백터 밑에 구현되어 있음.
		//push pop은  Stack및에 구현되어 있음
		
		Vector<String> vector = new Vector <String>();
		
		vector.addElement("마이콜");
		vector.addElement("둘리");
		vector.addElement("도우넛");
		
		int count =vector.size();
		for(int i=0;i<count;i++){
			String s = vector.elementAt(i);
			System.out.println(s);
		}
		
		vector.removeElementAt(1);//둘리 삭제
		Enumeration<String> e = vector.elements();
		while(e.hasMoreElements()){
			String s = e.nextElement();
			System.out.println("/"+s);
		}

	}

}
