import java.util.*;
class Student{
private String name;
private int eng;
private int ht;
private int mts;
private double total;
private double avg;
public void detail(){
Scanner sc = new Scanner(System.in);
System.out.println("enter name of student - ");
name=sc.nextLine();
eng = sc.nextInt();
ht = sc.nextInt();
mts=sc.nextInt();
}
public void calc(){
total= eng+ht+mts;
avg = total/3.0;
}
public void display(){
System.out.println("name: "+name);
System.out.println("english marks :"+eng);
System.out.println("hindi marks : " +ht);
System.out.println("maths marks : "+mts);
System.out.println("Total Marks : "+total);
System.out.println("Average Marks : "+avg);
}
public static void main(String args[]){
Student a = new Student();
a.detail();
a.calc();
a.display();
}
}