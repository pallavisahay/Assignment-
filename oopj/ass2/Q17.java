class Q17{
	public static void main(String args[])
	{
		int a=2, b=3, c=4, d=5;
		int min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : (c < d ? c : d))
                          : ((b < c) ? ((b < d) ? b : d) : (c < d ? c : d));
        System.out.println("The minimum number is: " + min);
	}
}