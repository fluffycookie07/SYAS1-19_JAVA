class demo{
void show()
{  int year=1900;
if(year%4==0&&year%400==0||year%100!=0){
System.out.println("Leap");
}
else{
System.out.println("Not leap");
}
}
}
public class leap{
public static void main(String[] args){
  demo s=new demo();
  s.show();
}
}
