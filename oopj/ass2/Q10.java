class Q10{
	public static void main(String args[])
	{
		char ch = 'a';
		String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
					  || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Vowel" : "Consonant";
		System.out.println("The character '" + ch + "' is a " + result + ".");
	}
}