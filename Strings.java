class Strings {
	public static void main(String[] args) {
		String str = new String("A string");
		String s = "A string";
		// if(str.equals(s)) {
		// 	System.out.println("A");

		// } else {
		// 	System.out.println("B"dsadsa);
		// }
		// for (int i=0; i < str.length(); i++) {
		// 	System.out.println(str.charAt(i));
			
		// }
		// for (int i = 0; i < str.length()-1; i++) {
		// 	System.out.println(str.substring(i, i+2));
			
		// }
		System.out.println(isPalindrome("racecars"));
		System.out.println(count("people", "e"));
		// System.out.println(hasAnA("apple"));
		System.out.println(letters("acddef"));
		System.out.println(isDupledrome("ll"));
	}
	public static boolean contains(String s, String t){
		for (int i =0; i <= s.length()-t.length(); i++) {
			if(s.substring(i, i+t.length()).equals(t)){
				return true;
			}
			
		}
		return false;
	}
	public static int count(String s, String t){
		int x = 0;
		for (int i = 0; i<=s.length()-t.length(); i++) {
			if (s.substring(i, i+t.length()).equals(t)) {
				x++;
				
			}
		}
		return x;
	}
	public static boolean isPalindrome(String s){ 
		for (int i = s.length()-1, j=0; i>0; i--,j++) {
			if (s.charAt(j) != s.charAt(i)) {
				return false;
				
			}	
		}
		return true;
	}
	// public static boolean hasAnA(String s){
	// 	char a = 'a';
	// 	for (int i =0; i <= s.length()-1; i++) {
	// 		if(s.charAt(i) = a.charAt(0)){
	// 			return true;
	// 		}
			
	// 	}
	// 	return false;

	// }

	public static boolean letters(String s){
		s = s.toLowerCase();
		for (int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) >= s.charAt(i+1)){
				return false;
			}
			
		}
		return true;
	}
	public static boolean isDupledrome(String s){
		for (int i = 0; i<s.length()-2; i+=2) {
			if(s.charAt(i)!=s.charAt(i+1)){
				return false;

			}
		}
		return true;

	}
	public static boolean captainCrunch(){
		help;
	}
}














