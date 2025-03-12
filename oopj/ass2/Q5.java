class Q5{
	public static void main(String[] args){
		int x = 10, y = 11;
		System.out.println("Before Swapping: \nX = " + x + "\nY = " + y); 
		x += y;
		y -= x;
		y = -y;
		x -= y;
		System.out.println("After Swapping: \nX = " + x + "\nY = " + y); 
	}
}