class complex{
private double real;
private double imaginary;
complex(){
this.real=0;
this.imaginary=0;
}
complex(double real){
this.real=real;
this.imaginary=0;
}
complex(double real, double imaginary){
this.real=real;
this.imaginary=imaginary;
}
complex add(complex other){
double newreal= this.real+other.real;
double newimaginary= this.imaginary+other.imaginary;
return new complex(newreal,newimaginary);
}
complex multiply(complex other){
double newreal= (this.real*other.real)-(this.imaginary*other.imaginary);
double newimaginary= (this.real*other.imaginary)+(this.imaginary*other.real);
return new complex(newreal, newimaginary);
}
void display(){
System.out.println(this.real+" "+(this.imaginary>=0?"+" : "-")+" " +this.imaginary +"i");
}
}
public class Q4{
public static void main(String args[]){
complex num1= new complex(1,-2);
complex num2 = new complex(1.2,-2.98);
complex sum = num1.add(num2);
complex product = num1.multiply(num2);
sum.display();
product.display();
}
}