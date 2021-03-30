package sec05.exam04_getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.Home");

		System.out.println("운영체제 이름 : " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈 디렉토리: " + userHome);

		System.out.println("----------------------------------");
		System.out.println("[key]value");
		System.out.println("----------------------------------");

		//map 자료구조 [key]value 예) {String타입 : String타입}<--properties
		Properties props = System.getProperties();
		//set 자료구조 : 순서가 없고, 자료가 중복할 수 없고, null 허용
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("["+key+"]"+value);
		}
		
	}

}
