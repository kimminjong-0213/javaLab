package sec02.exam01_createthread;

//Runnable 인터페이스의 구현 클래스
public class ThreadLife implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 21; i++) {
			// thread의 이름과 정수 출력
			System.out.println(Thread.currentThread().getName() + " number = " + i);
		}
	}

	//Main Thread가 main() 메소드를 실행한다.
	public static void main(String[] args) {
		ThreadLife tl = new ThreadLife(); //t1은 Runnable 인터페이스의 구현객체

		// 첫 번째 Thread 생성 : 작업 스레드
		Thread first = new Thread(tl, "first1");
		// 두 번째 Thread 생성
		Thread second = new Thread(tl, "second1");
		// 세 번째 Thread 생성
		Thread third = new Thread(tl, "third1");

		//Muti= thread
		second.start();
		first.start();
		third.start();
	}

}
