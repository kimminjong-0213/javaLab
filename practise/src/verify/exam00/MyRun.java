package verify.exam00;

//Runnable 인터페이스를 구현
public class MyRun implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 500; i++)
			System.out.print("T");
	}
}
