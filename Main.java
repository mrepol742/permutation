import java.util.Scanner;

class Main {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
	String str;
	String answer = "";
	System.out.print("Enter the string: ");
	str = scanner.next();
	System.out.println("All possible strings combination are:\n");
	permute(str, answer);
    System.out.println("\n\n");
}


static void permute(String str, String answer) {
	if (str.length() == 0) {
		System.out.print(answer + " ");
		return;
	}
	for(int i = 0 ;i < str.length(); i++) {
		char ch = str.charAt(i);
		String left_substr = str.substring(0, i);
		String right_substr = str.substring(i + 1);
		String rest = left_substr + right_substr;
		permute(rest, answer + ch);
	}
}
}