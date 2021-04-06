package practise.chap10;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args ) {

		String data1 = null;
		String data2 = null;
		//args[0] = "123";
	    //args[1] = "321";
        //RUN - RUN - CONfiguration - argument�� �Ű����� �Է� ������ �ǾƷ� try������ �̵��ؼ�
		//�Է°��� �м��Ѵ� �׸��� ���� �ּ��� ���� �Ű����� �Է����ָ� try�� �ִ� ���ܹ߻��ڵ尡 �������� 
		//����ȴ�.
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("������");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �ֽ��ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���");
		}

	}

}
