package verify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Set s = new HashSet();
		//TreeSet s = new TreeSet();

		Random r = new Random();
		while(s.size() != 6) {
			n = r.nextInt(45) + 1;
			s.add(n);
		}
		
		//Á¤·Ä
		List list = new ArrayList(s);
		Collections.sort(list);
		
		System.out.println(s);
		System.out.println(list);
	
		/*while (true) {

			n = r.nextInt(45) + 1;
			s.add(n);
			if (s.size() == 6) {
				System.out.println(s);
				break;
			}

		}*/
	}

}
