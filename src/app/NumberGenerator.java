package app;

public class NumberGenerator implements Runnable{

	@Override
	public void run() {
		for(int i =0; i<10;i++) {
			System.out.println(i + this.hashCode());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
