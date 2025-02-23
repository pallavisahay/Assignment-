class prime{
public static void main(String args[]){
int n=17;
boolean flag = false;
if(n==0||n==1){
flag=true;
}
for(int i=2;i<=n/2;++i){
if(n%i==0){
flag=true;
break;
}
}
if(!flag)
System.out.println(n+ " is a prime number");
else
System.out.println(n+ " is a not prime number");

  }
}