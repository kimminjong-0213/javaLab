package sec07.exam01_constructor;

public class ByteToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1); // "Hello Java"
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2); //"java"

	}

}
