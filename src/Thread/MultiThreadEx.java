package Thread;

public class MultiThreadEx {

	public static void main(String[] args) {
		Thread t1 = new AlphabetThread();//Thread Ŭ������ ��ӹ޾� ���� ���
		Thread t2 = new DigitThread();
		Thread t3 = new Thread(new UpperAlphabetThread());//��ӹ޴� Ŭ������ �ִ� ��� Runnable �������̽��� �̿��Ͽ� Thread �� ���� ȿ���� �����ִ�.
		
		t1.start();
		t2.start();
		t3.start();
		//Thread.sleep()����
		//��¹�
		//abcdefghijklmnopqrstuvwxyz123456789
		
		//�߰��� ������ ������ �ǰ� ����� ���ؼ� Thread.sleep()���
		//��¹�//
		//a123456789bcdefghijklmnopqrstuvwxyz
		//��¹�//
		//a123456789ABCDEFbcdefghijklmnopqrstuvwxyz
	}

}
