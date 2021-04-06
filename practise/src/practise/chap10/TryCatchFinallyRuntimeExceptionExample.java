package practise.chap10;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args ) {

		String data1 = null;
		String data2 = null;
		//args[0] = "123";
	    //args[1] = "321";
        //RUN - RUN - CONfiguration - argument로 매개값을 입력 받으면 맨아래 try문으로 이동해서
		//입력값을 분석한다 그리고 위에 주석과 같이 매개값을 입력해주면 try에 있는 예외발생코드가 문제없이 
		//실행된다.
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("실행방법");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 있습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}

	}

}
