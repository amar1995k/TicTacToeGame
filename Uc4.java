package workshop;

public class Uc4 {
	public static int getLocation() {
		System.out.println("Enter the location ");
		int loc=Utility.getInt();
		return loc;
	}
	
	public static int getLocationForComputer() {
		int loc =(int) (Math.random() * 10) % 9;
		return (loc + 1);
	}

}
