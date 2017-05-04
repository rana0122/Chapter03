package Thread;

public class AlphabetThread extends Thread {
	
	@Override
	public void run() {
		super.run();
		for(char c='a';c<='z';c++){
			System.out.print(c);
			//중간에 섞여서 실행이 되게 만들기 위해서 Thread.sleep()사용
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


}
