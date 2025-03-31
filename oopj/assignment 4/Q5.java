import java.util.*;
class BMI{
private double height, weight;
public BMI(double height, double weight){
this.height=height;
this.weight=weight;
}
public double getHeight(){
return height;
}
public void setHeight(double height){
this.height=height;
}
public double getWeight(){
return weight;
}
public void setWeight(double weight){
this.weight=weight;
}
double calc(){
return weight/(height*height);

}
}
public class Q5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
BMI b= new BMI(0,0);
double height= sc.nextDouble();
double weight= sc.nextDouble();
b.setHeight(height);
b.setWeight(weight);
double bmi = b.calc();
 System.out.printf("Your BMI is: %.2f\n", bmi);

        sc.close();
}
}