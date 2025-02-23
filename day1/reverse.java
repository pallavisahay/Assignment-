class reverse{
public static void main(String args[]){
int n= 12345 , r=0;
System.out.println("original num = " +n);
while(n !=0){
int d= n%10;
r = r*10+d;
n/=10;
}
System.out.println("reversed num = " +r);
  }
}