package verify.exam00;

//Thread 클래스를 상속
public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 500; i++)
			System.out.print("S");
	}
}
