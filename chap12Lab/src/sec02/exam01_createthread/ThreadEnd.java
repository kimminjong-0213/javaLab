package sec02.exam01_createthread;

//ThreadEnd는 Thread의 하위 클래스 
public class ThreadEnd extends Thread {

	@Override
	public void run() {
		// thread가 시작되면 실행되는 문장
		for (int i = 1; i <= 20; i++) {
			System.out.println("run number = " + i);
		}
	}
        //2. Thread를 하위클래스로 부터 생성
	public static void main(String[] args) {
		// Thread te = new ThreadEnd(); 로 선언해도 상관없다.
		ThreadEnd te = new ThreadEnd();

		// 작업 스레드가 수행함 thread를 실행시킴
		te.start();

		//Main스레드가 수행함 
		// main()내에서 화면에 101부터 120까지 출력
		for (int i = 101; i <= 120; i++) {
			System.out.println("-------> main number = " + i);
		}
	}

}
