package chapter1.two;

public class CircurRotation {
	
	static boolean judge(String str1, String str2) {
		str1.toUpperCase();
		str1.toUpperCase();
		if (str1.length() != str2.length()) 
			return false;
		else
			for (int i = 0; i < str1.length(); i++) {
				String newStr = str1.substring(i, str1.length()) + str1.substring(0, i);
				if (newStr.equals(str2))
					return true;
			}
		return false;
	}
	
	static String mystery(String s) {
		int N = s.length();
		if (N <= 1)
			return s;
		String a = s.substring(0, N/2);
		String b = s.substring(N/2, N);
		return mystery(b) + mystery(a);
	}

	public static void main(String[] args) {
		String str1 = "AcTGACG";
		String str2 = "TGACGAC";
		if (judge(str1, str2))
			System.out.println("yes");
		else {
			System.out.println("no");
		}
		System.out.println(mystery(str1));
	}
}
