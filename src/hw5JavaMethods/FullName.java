package hw5JavaMethods;

public class FullName {
	public String fullName(String fname, String lname) {
		System.out.println("FAMILY MEMBER:" + fname + " " + lname);
		return null;
	}

	public static void main(String[] args) {
		FullName fname = new FullName();
		fname.fullName("ASIF", "IQBAL");
		fname.fullName("MOHAMMAD", "ARIF");
		fname.fullName("OMAR", "FARUQUE");
		fname.fullName("SHIBBIR", "AHMED");

	}

}
