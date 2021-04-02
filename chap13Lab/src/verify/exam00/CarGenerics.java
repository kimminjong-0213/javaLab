package verify.exam00;

import java.util.*;

public class CarGenerics {
	public static void main(String[] args) {
		Vector<Car> vc = new Vector<Car>(5, 5);
		vc.add(new Car());
		vc.add(new Car());
		vc.add(new Car());
		vc.add(new Taxi());
		vc.add(new Bus());
		Car c1 = vc.get(1);
		c1.show();// Car
		vc.add(new Bus());// Car로 대입 Bus is Car
		Car c2 = vc.get(3);// Car, 자동형변환 Taxi -> Car
		c2.show();// Taxi
		Vector<Bus> vb = new Vector<Bus>(5, 5);
		vb.add(new Bus());
		vb.add(new Bus());
		vb.add(new Bus());
		// vc=vb;//error->ensure compile-time type safety //incompatible types
		System.out.println("-------------------------");
		Vector<? extends Car> vec = vb;// whild card
		for (Car c : vec) {
			c.show();
			((Bus) c).move();
		}
	}
}
