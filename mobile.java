package week1.day2;

public class mobile {
	
	String msg="Learn Selenium";
	long contactNumber=9780566789L;
	
	public void sendMsg() {
		System.out.println("Message: "+msg);
		
	}
	
	public void makeCall() {
		System.out.println("Calling: "+contactNumber);
		
	}
	
	public void saveContact() {
		System.out.println("RAM: " +contactNumber);
		
	}
	public static void main(String[] args) {
		
		mobile objectName= new mobile();
		objectName.makeCall();
		objectName.sendMsg();
		objectName.saveContact();
	}

}
