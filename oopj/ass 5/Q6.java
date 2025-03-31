import java.util.*;
class ElectrictiyBill{
private String customerName;
private double unitsConsumed;
 double billAmount=0;
public ElectrictiyBill(String customerName, double unitsConsumed){
this.customerName=customerName;
if(unitsConsumed<0){
throw new IllegalArgumentException("units consumed cann't be negative");
}
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
public double getBillAmount(){
return  billAmount;
}
}

public class Q6{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	try{
System.out.println("name of customer ");
String customerName=sc.nextLine();
System.out.println("unit consumed ");
double unitsConsumed=sc.nextDouble();
ElectrictiyBill a = new ElectrictiyBill(customerName,unitsConsumed);
a.calculateBillAmount();
double amount = a.calculateBillAmount();
System.out.println(a.getCustomerName());
System.out.println(a.getUnitsconsumed());
System.out.println(a.billAmount);
}catch(InputMismatchException e){
System.out.println("invalid input! enter numeric value for units");
}catch(IllegalArgumentException e){
System.out.println("error:"+e.getMessage());
}finally{
sc.close();
}
}
}