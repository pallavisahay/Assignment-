class Q6{
	public static void main(String args[])
	{
		int a = 5, b = 6, c = 7;
		int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("The largest number is : "+largest);
	}
}