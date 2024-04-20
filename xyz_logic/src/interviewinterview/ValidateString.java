package interviewinterview;

public class ValidateString {
	public static void main(String[] args) {

		String str = "(){}[]";
		if (isValidString(str)) {
			System.out.println("valid String");
		} else {
			System.out.println("not valid string");
		}
	}

	private static boolean isValidString(String str) {
		int balance = 0;

		// iterate through each characters
		for (char ch : str.toCharArray()) {
			// Increment for opening string
			if (ch == '(' || ch == '{' || ch == '[') {
				balance++;

				// Increment for opening string
			} else if (ch == ')' || ch == '}' || ch == ']') {
				balance--;
			}

			// if balance is zero it means it is not balanced
			if (balance < 0) {
				return false;
			}
		}

		// if balance is zero then it gives balanced string
		return balance == 0;
	}
}
