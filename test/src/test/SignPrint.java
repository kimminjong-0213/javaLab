package test;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� num�� ���� �Է��ϼ���");
		double input =sc.nextInt();
		String num = ( input > 0 ? "���" : input < 0 ? "����" : "0");
		System.out.println("����num = " + num);
		sc.close();

	}

}
