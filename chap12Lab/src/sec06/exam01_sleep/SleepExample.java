package sec06.exam01_sleep;

import java.awt.Toolkit;

//Main Thread가 maim()메소드를 실행시킨다.
public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();		
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000); //Thread.sleep()은 자신의 스레드를 일시정지상태로 만든다.
			} catch(InterruptedException e) {			
			}		
		}	
	}
}
