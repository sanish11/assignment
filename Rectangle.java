import java.util.*;
class Rectangle{
public static void main(String []args)
    {
           int rectangle;
           Scanner s=new Scanner(System.in);
            System.out.println("enter width and length:");
            int width=s.nextInt();
            int length=s.nextInt();
            rectangle=width*length;
            System.out.println("area of rectangle="+rectangle);

    }
}