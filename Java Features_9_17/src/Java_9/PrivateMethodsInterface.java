package Java_9;

interface Private_Interface{
	 default void notification() {
		establishConnection();
		System.out.println("Notification Sended...");
	}
	default void notifications() {
		establishConnection();
		System.out.println("Notifications Sended...");
	}
	private void establishConnection() {
		System.out.println("Connection Established...");
	}
}

public class PrivateMethodsInterface implements Private_Interface{
	public static void main(String[] args) {
		Private_Interface obj = new PrivateMethodsInterface();
		obj.notification();
		obj.notifications();
	}
}
