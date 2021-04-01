package sec06.exam06_stop;

//main Thread ½ÇÇà
public class InterruptExample {
	public static void main(String[] args)  {
		
		//
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}
		
		thread.interrupt();
	}
}
