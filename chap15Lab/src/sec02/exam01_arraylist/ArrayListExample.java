package sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");  //index0
		list.add("JDBC");   //index1
		list.add("Servlet/JSP"); //index2
		list.add(2, "Database"); //index2�� ���� ������ ������ ��ĭ��  �ڷ� �з�����
		list.add("iBATIS"); //index4

		int size = list.size();  //size�� 5
		System.out.println("�� ��ü��: " + size);		
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
				
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");		
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}

