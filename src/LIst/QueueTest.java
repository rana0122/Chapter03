package LIst;

import java.util.*;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String> q= new LinkedList<String>();
		
		q.offer("마이콜");
		q.offer("도우넛");
		q.offer("둘리");
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.poll());
		//비어 있는 경우  null이 나온다(Exception 발생 안함)
		System.out.println(q.poll());

	}

}
