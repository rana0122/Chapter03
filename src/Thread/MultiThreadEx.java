package Thread;

public class MultiThreadEx {

	public static void main(String[] args) {
		Thread t1 = new AlphabetThread();//Thread 클래스를 상속받아 쓰는 경우
		Thread t2 = new DigitThread();
		Thread t3 = new Thread(new UpperAlphabetThread());//상속받는 클래스가 있는 경우 Runnable 인터페이스를 이용하여 Thread 와 같은 효과를 낼수있다.
		
		t1.start();
		t2.start();
		t3.start();
		//Thread.sleep()없이
		//출력물
		//abcdefghijklmnopqrstuvwxyz123456789
		
		//중간에 섞여서 실행이 되게 만들기 위해서 Thread.sleep()사용
		//출력물//
		//a123456789bcdefghijklmnopqrstuvwxyz
		//출력물//
		//a123456789ABCDEFbcdefghijklmnopqrstuvwxyz
	}

}
