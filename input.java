import java.util.Scanner;
public class input
{
 public static void main(String[] args)
  {
     int number;
     Scanner keyboard=new Scanner(System.in);
     System.out.println("Enter Integer Value:");
     number=keyboard.nextInt();
     System.out.println("Number is "+ number);
     System.out.println((float)number);
  }
}
