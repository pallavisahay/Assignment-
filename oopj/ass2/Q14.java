class Q14{
	public static void main(String args[])
	{
		int n= 11;
		int count = 0;
        while (n > 0) {
            n = n & (n - 1); // Removes the rightmost 1-bit
            count++;
        }
		System.out.println( "number of 1s in binary: " + count);
	}
}