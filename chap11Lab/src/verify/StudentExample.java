package verify;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {

		//Student 키로 총점을 저장하는 HashMap 객체 생성
		//Map:{Key, Value} 쌍으로 구성된 자료구조인 인터페이스
		//HashMap:Map 인터페이스를 구현한 구현 클래스
		//제너릭 타입:타입을 파라메터로 갖는 클래스와 인터페이스를 말한다.
		
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		//new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");
		
		//new Student("1") 로 점수를 읽어옴
		String score  = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
	}
}
