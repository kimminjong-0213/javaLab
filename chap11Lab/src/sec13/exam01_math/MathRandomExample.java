package sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {

		// 0.0 <= Math.random()<1.0사이의 임의의 실수값
		int num = (int) (Math.random() * 6 + 1);
		System.out.println("주사위 값:"+num);

	}

}
