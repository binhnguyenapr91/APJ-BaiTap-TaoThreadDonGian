package app;

public class App {
	public static void main(String[] args) {
		NumberGenerator ng1= new NumberGenerator();
		NumberGenerator ng2 = new NumberGenerator();
		Thread thread1 = new Thread(ng1);
		Thread thread2 = new Thread(ng2);
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
	}
}
