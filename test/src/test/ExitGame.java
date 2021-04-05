package test;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("숫자를 5번 입력하세요");
		for (int num = 0; num <= 4; num++) {
			int input = sc.nextInt();
			sum += input;
			System.out.println("입력 :" + input + ", 합 : " + sum);
			if (sum >= 100) {
				num = 4;
				System.out.println("프로그램 종료!");
			}
		}
		sc.close();
	}

}
