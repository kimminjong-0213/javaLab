package sec13.exam02_random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {

		// ���ù�ȣ
		int[] selectNumber = new int[6];
		Random random = new Random(1);
		System.out.print("���ù�ȣ: ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		// ��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("��÷ ��ȣ: ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
	}

}