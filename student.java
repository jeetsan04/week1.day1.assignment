package week1.day2;

public class student {
	String name="Sanjeet";
	int rollNo=20;
	
	public void college() {
		String collegeName="Sathyabama";
	    System.out.println("College Name: "+collegeName);
	}
	public static void main(String[] args) {
		
		student objectStudent= new student();
		objectStudent.college();
		System.out.println("Name :"+objectStudent.name);
		System.out.println("Roll No.: "+objectStudent.rollNo);
		
	}

}
