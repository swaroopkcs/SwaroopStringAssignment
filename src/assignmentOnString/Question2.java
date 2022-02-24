package assignmentOnString;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="100 queen street,Toronto,M5V 3E3 ";
		String streetAddress = str.substring(0, str.indexOf(","));
		System.out.println("Street Address: "+streetAddress);
		String city = str.substring(str.indexOf(",")+1, str.indexOf(",M"));
		System.out.println("City Name: "+city);
		String zip = str.substring(str.indexOf("M"), str.lastIndexOf("3")+1);
		System.out.println("Postal Code: "+zip);
		

	}

}
