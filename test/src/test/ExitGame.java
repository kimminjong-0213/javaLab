package test;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("���ڸ� 5�� �Է��ϼ���");
		for (int num = 0; num <= 4; num++) {
			int input = sc.nextInt();
			sum += input;
			System.out.println("�Է� :" + input + ", �� : " + sum);
			if (sum >= 100) {
				num = 4;
				System.out.println("���α׷� ����!");
			}
		}
		sc.close();
	}

}
