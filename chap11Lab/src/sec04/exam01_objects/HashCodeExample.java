package sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {		
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	//���� ��� Ŭ����
	static class Student {
		int sno;
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		//Object Ŭ������ hashCode(): ��ü�� �ּҰ����� �ؽ��ڵ�(����)�� �����Ѵ�.
		@Override
		public int hashCode() {
			//Objects.hash(): �Ű������� �־��� ���� �̿��� �ؽ� �ڵ� �����Ѵ�.
			return Objects.hash(sno, name);
		}
	}
}
