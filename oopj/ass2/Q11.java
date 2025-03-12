class Q11{
	public static void main(String args[])
	{
		int n= 4;
		boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);
        System.out.println(n + " is a power of 2: " + isPowerOfTwo);
	}
}