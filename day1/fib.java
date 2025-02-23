class fib{
public static void main(String args[]){
int n= 10, first=0, second=1;
System.out.println("fib series till " +n+ "terms:");
for (int i=1; i<=n; ++i){
System.out.println(first + ",");
int next= first+second;
first= second;
second = next;

}
  }
}