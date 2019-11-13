import java.util.Scanner;

public class Circle{
    double diameter;
    double pi = 3.14159;
    public  double circumference(){
        return 2*pi*diameter;
    }
    public  double area(){
        return pi*diameter*diameter;
    }
    public  Circle(double D){
         diameter = D;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the diameter :");
        double diameter = myObj.nextDouble();
        
        Circle myCircle = new Circle(diameter);
        
        System.out.println("Area: " + myCircle.area());
        System.out.println("Area: " + myCircle.circumference());
    }
}