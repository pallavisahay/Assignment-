public class Q3{
    public static void main(String[] args) {
	int a = 1234;
	int r =0;
	
	while(a!=0){
		r = r+(a%10);
		a=a/10;
	}
	System.out.println("Sum:" +r);
	}
	}
	