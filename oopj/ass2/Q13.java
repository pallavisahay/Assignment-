class Q13{
	public static void main(String args[])
	{
		int num= -12;
		int mask = num >> 31;
        int absValue = (num + mask) ^ mask; 
        System.out.println("Absolute value: " + absValue);
	}
}