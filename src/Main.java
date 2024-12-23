//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
 class circle{
     double r;
    circle(double radius){
        this.r=radius;
    }
public void area()
{
    double area;
    area = Math.PI*r*r;
    System.out.println("The area of the circle is "+area);
}
public void circumference()
{
    double circumference=Math.PI*r*2;
    System.out.println("The circumference of the circle is "+circumference);
}
    }

class rectangle {
    double l,b;

    public rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        double area;
        area = l*b;
        System.out.println("The area of the rectangle is "+area);

    }
    public void perimeter() {
        double perimeter;
        perimeter = 2*l*b;
        System.out.println("The perimeter of the rectangle is "+perimeter);

    }
}
class square {
     double s;
     square(double s) {
         this.s = s;
     }
     public void area() {
         double area;
         area=s*s;
         System.out.println("The area of the square is "+s);
     }
     public void perimeter() {
         double perimeter;
         perimeter=2*s*s;
         System.out.println("The perimeter of the square is "+perimeter);
     }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        circle obj=new circle(radius);
        obj.area();
        obj.circumference();
        System.out.println("Enter the side of the rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        rectangle obj2=new rectangle(l,b);
        obj2.area();
        obj2.perimeter();
        System.out.println("Enter the side of the square: ");
        double s = sc.nextDouble();
        square obj3=new square(s);
        obj3.area();
        obj3.perimeter();
        }
    }
