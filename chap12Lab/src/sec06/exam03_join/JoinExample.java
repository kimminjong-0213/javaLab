package sec06.exam03_join;

public class JoinExample {
	// Main 스레드가 실행
	public static void main(String[] args) {
		// 작업 스레드를 생성
		SumThread sumThread = new SumThread();
		// 작업 스레드가 실행
		sumThread.start();
		try {
			// main 스레드가 작업 스레드가 완료될때까지 일시 대기 상태로 있는다.
			sumThread.join(); // join이 없다면 기다리지 않고 바로 출력해서 출력값이 0이 나온다.
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}
