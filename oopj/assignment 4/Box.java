import java.util.*;
class Box1{
private int height;
private int width;
int breadth;
int Area;
int Volume;

public Box1(int height, int breadth, int width){
this.height=height;
this.breadth=breadth;
this.width=width;
}
public int getVolume(){
 int Volume= height*breadth*width;
 return Volume;
}
public int getArea(){
int Area =2*((width*breadth)+(breadth*height)+(height*width));
return Area;
}
public void display(){
System.out.println("Volume:"+Volume);
System.out.println("Area:"+Area);
}

}
class Box{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int height=sc.nextInt();
int breadth=sc.nextInt();
int width=sc.nextInt();
Box1 b = new Box1(height,breadth,width);
System.out.println(b.getArea());
System.out.println(b.getVolume());
}
}