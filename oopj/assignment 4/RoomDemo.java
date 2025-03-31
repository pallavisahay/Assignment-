import java.util.*;
class Room{
private int height;
private int width;
private int breadth;
public Room(int height, int width, int breadth ){
this.height=height;
this.width=width;
this.breadth=breadth;
}
public int volume(){
return height*breadth*width;
}
}
public class RoomDemo{
	public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int n=sc.nextInt();
for(int i=0;i<n;i++){
int height= sc.nextInt();
int width= sc.nextInt();
int breadth=sc.nextInt();
Room room = new Room(height, breadth, width);
System.out.println(room.volume());
}
sc.close();

	}
}