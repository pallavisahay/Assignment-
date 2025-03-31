import java.util.*;
class ElectrictiyBill{
private String customerName;
private double unitsConsumed;
private double billAmount=0;
public ElectrictiyBill(String customerName, double unitsConsumed){
this.customerName=customerName;
this.unitsConsumed=unitsConsumed;
}
double calculateBillAmount(){
if(unitsConsumed>=300){
billAmount=1900+((unitsConsumed-300)*10);
}
else if(unitsConsumed<300 && unitsConsumed>100){
billAmount=500+((unitsConsumed-100)*7);
}
else{
billAmount=unitsConsumed*5;
}
return billAmount;
}
public String getCustomerName(){
return customerName;
}
public double getUnitsconsumed(){
return unitsConsumed;
}
}

public class Q6{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
System.out.println("name of customer ");
String customerName=sc.nextLine();
System.out.println("unit consumed ");
double unitsConsumed=sc.nextDouble();
ElectrictiyBill a = new ElectrictiyBill(customerName,unitsConsumed);

double amount = a.calculateBillAmount();
System.out.println(a.getCustomerName());
System.out.println(a.getUnitsconsumed());
System.out.println(amount);
}
}