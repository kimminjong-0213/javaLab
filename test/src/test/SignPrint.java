package test;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("변수 num의 값을 입력하세요");
		double input =sc.nextInt();
		String num = ( input > 0 ? "양수" : input < 0 ? "음수" : "0");
		System.out.println("변수num = " + num);
		sc.close();

	}

}
