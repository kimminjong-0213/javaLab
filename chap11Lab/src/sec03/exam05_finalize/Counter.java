package sec03.exam05_finalize;

public class Counter {
	private int no;
	public Counter(int no) {
		this.no=no;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "�� ��ü�� finalize()�� �����");
	}

}
