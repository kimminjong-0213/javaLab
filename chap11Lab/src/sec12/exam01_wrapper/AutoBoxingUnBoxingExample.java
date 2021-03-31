package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//Auto - Boxing
		Integer obj =100;
		System.out.println("value:"+obj.intValue());
		
		//Auto -Unboxing
		int value = obj;
		System.out.println("value:"+value);
		
		//¿¬»ê½Ã Auto-Unboxing
		int result = obj+100;
		System.out.println("value:"+result);

	}

}
