class Q8{
	public static void main(String args[])
	{
			boolean a = true, b=true, c=false;
			boolean result = (a && b) || (b && c) || (a && c);
			System.out.println("At least two values are true : " + result);
	}
}