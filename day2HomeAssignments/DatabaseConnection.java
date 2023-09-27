package week3.day2HomeAssignments;

public interface DatabaseConnection {
        
	    // Abstract method
	    public void connect();
	    
	    public void disconnect();
	    
	    public void executeUpdate();
}
