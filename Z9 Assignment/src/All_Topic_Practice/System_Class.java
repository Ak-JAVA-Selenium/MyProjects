package All_Topic_Practice;

public class System_Class {

	public static void main(String[] args) {

		String str = "JavaBasic";
		// checking specific property
		System.out.println("System User Dir: " + System.getProperty("user.home"));
		System.out.println("===================================");
		System.out.println("Current Working Dir: " + System.getProperty("user.dir"));
		System.out.println("===================================");
		
		// clearing this property
		System.clearProperty("user.home");
		System.out.println(System.getProperty("user.home"));// null
		System.out.println("===================================");
		
		// checking country
		System.out.println(System.getProperty("user.country"));// IN
		System.out.println("===================================");
		
		// setting specific country
		System.setProperty("user.country", "INDIA");
		// checking specific country
		System.out.println(System.getProperty("user.country"));// INDIA
		System.out.println("===================================");
		
		// checking property other than system property
		// illustrating getProperty(String key, String def)
		System.out.println("other than system property: " + System.getProperty("user.password"));
		System.out
				.println("other than system property: " + System.getProperty("user.password", "none of your business"));
		System.out.println("===================================");

		System.out.println("current time in milli sec: " + System.currentTimeMillis());
		System.out.println("difference between the current time and midnight, January 1, 1970 UTC is: "
				+ System.currentTimeMillis());
		System.out.println("===================================");
		System.out.println("current time in " + "nano sec: " + System.nanoTime());
		System.out.println("***********************************");
	}
}
