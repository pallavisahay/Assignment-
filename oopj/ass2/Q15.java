class Q15{
	public static void main(String args[])
	{
		int x= 32;
		int evenBits = x & 0xAAAAAAAA; 
        int oddBits = x & 0x55555555;  

        int swapped = (evenBits >> 1) | (oddBits << 1);
        System.out.println("Number after swapping odd and even bits: " + swapped);
	}
}