package sec03.exam05_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = null;
		for(int i = 1; i<=50; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc();//Gargage Collector를 강제로 실행시킨다.
		}

	}

}
