package sec06.exam03_newinstance;

public abstract class SendAction implements Action {
	@Override
	public void execute() {
		System.out.println("데이터를 보냅니다.");
	}
}
