package All_Topic_Practice;

public class String_Buffer_Builder {

	public static void main(String[] args) {
		/** StringBuffer */
		StringBuffer sb = new StringBuffer("Hello ");

		System.out.println("Original StringBuffer value: " + sb);// Hello

		sb.append("Java");// Concat--now original string is changed
		System.out.println(sb);// Hello Java

		sb.insert(5, "Pune");// Add string at index-- now original string is changed
		System.out.println(sb);//

		sb.replace(1, 3, "XXX"); // Replace string frpm index to index
		System.out.println(sb);// prints

		sb.delete(1, 4); // Delete string frpm index to index
		System.out.println(sb);//

		sb.reverse();
		System.out.println(sb);// reverse complete string

		System.out.println("*********************************************");

		StringBuffer s2 = new StringBuffer();
		System.out.println(s2.capacity());// default capacity- 16
		s2.append("Hello");
		System.out.println(s2.capacity());// now 16
		s2.append("java is my favourite language");
		System.out.println(s2.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

		System.out.println("*********************************************");

		/** StringBuilder */
		StringBuilder sbr = new StringBuilder("Hello ");

		sbr.append("Java");// now original string is changed
		System.out.println(sbr);// prints Hello Java
		sbr.reverse();
		System.out.println(sbr);// prints Hello Java

		System.out.println("*********************************************");

		StringBuilder sb1 = new StringBuilder("Hello Java");
		System.out.println(sb1);
		StringBuilder sb2 = new StringBuilder("Hello Java");
		System.out.println(sb2);

		System.out.println(sb1.equals(sb2));// address basis comparison
		System.out.println(sb1 == sb2);// address basis comparison
		// We don't have any method in StringBuffer and StringBuilder to compare object values,
		// so to overcome that first convert StringBuffer/StringBuilder to String class,
		// using toString() then use equals() of string class..

		System.out.println(sb1.toString());// value
		System.out.println((sb1.toString().equals(sb2.toString())));
	}
}
