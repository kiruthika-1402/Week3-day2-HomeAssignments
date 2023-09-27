package week3.day2HomeAssignments;

public class JavaConnection implements DatabaseConnection {

	public void connect() {
		System.out.println("Connecting the data");
	}

	public void disconnect() {
		System.out.println("Disconnecting the data");	
	}

	public void executeUpdate() {
		System.out.println("Updating the data");
	}
	
	public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection();
		
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();

	}

}
