package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//1.Thread를 Thread클래스로부터 직접생성
		//how1 : BeepTask 구현객체를 이용함
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		//how2 : 익명구현객체를 이용함
		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});*/
		
		//how3 : 람다식(익명구현객체를 간략하게 표현한 식)을 이용함
		/*Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		});*/
		
		//작업 스레드가 수행
		thread.start(); 
		
		//Main 스레드가 수행
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}


