package logic;

public class String_concept {
	public static void main(String[] args) {
		String a = "Shruti";
		String b = "Sneha";
		
		// print small letter
		System.out.println(a.toLowerCase());
		// print Capital letter
		System.out.println(b.toUpperCase());
		String c = "  john   ";
		String d = "";
		// remove empty space
		System.out.println(c.trim());
		// check string string is empty or not
		System.out.println(d.isEmpty());
		// find character at the position of 2
		System.out.println(b.charAt(2));
		
		// find u character at the position in the index position 
		System.out.println(a.indexOf('u'));
		// check string of b is equal to string of c
		System.out.println(b.equals(c));
		// check if r present r in string after that replace by t otherwise return false
		System.out.println(d.replace('r', 't'));
		System.out.println(a.substring(3));
	}
}
