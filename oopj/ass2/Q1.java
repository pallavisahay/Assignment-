public class Q1{
    public static void main(String[] args) {
	int a = 10;
	int b = 20;
	System.out.println("before swapping : \n a=" +a+"\n b="+b);
	a = a ^b;
	b= a^b;
	a= a^b;
	System.out.println("after swapping : \n a=" +a+"\n b="+b);
	}
	}
	