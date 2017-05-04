package Thread;

public class DigitThread extends Thread {

	@Override
	public void run() {
		super.run();
		for(int i=1;i<10;i++){
			System.out.print(i);
		}
		//중간에 섞여서 실행이 되게 만들기 위해서 Thread.sleep()사용
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
