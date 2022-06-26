package Java_9;

interface Private_Interface1{
	 static void notification() {
		establishConnection();
		System.out.println("Notification Sended...");
	}
	default void notifications() {
		establishConnection();
		System.out.println("Notifications Sended...");
	}
	private static void establishConnection() {
		System.out.println("Connection Established...");
	}
}

public class PrivateStaticMethodsInterface implements Private_Interface{
	public static void main(String[] args) {
		PrivateStaticMethodsInterface obj = new PrivateStaticMethodsInterface();
		Private_Interface1.notification();
		obj.notifications();
	}
}
