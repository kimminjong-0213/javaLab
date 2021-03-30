package sec06.exam03_newinstance;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("sec06.exam03_newinstance.SendAction");
			//Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");
			Action action = (Action) clazz.newInstance(); //SendAction 备泅 按眉 积己茄促.
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}


