package sec03.exam03_tostring;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
				
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
			
		

	}

}
