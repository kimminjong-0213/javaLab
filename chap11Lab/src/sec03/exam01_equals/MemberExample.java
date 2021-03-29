package sec03.exam01_equals;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("bule");
		Member obj2 = new Member("bule");
		Member obj3 = new Member("red");
		

		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다");
		}else {
			System.out.println("obj1과 obj2는 같지 않습니다.");
		}
	}

}
