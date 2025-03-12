class Q19{
	public static void main(String args[])
	{
		char ch='D';
		char ch='';
		String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" :
                        (ch >= 'a' && ch <= 'z') ? "Lowercase" :
                        "Not a Letter";
        System.out.println("The character is: " + result);		
	}
}