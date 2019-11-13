import java.util.Scanner;


public class ThreeIntegers{
    int x,y,z;
    
    public ThreeIntegers( int a, int b, int c){
        x = a ;
        y = b;
        z = c;
    }
    public double average(){
        return (x + y + z)/3;
    }
    public int greatest(){
       if (x > y && x > z){
            return x;
       } else if ( y > x && y > z){
           return y;
       } else if ( z > x && z > y){
           return z;
       } else {
           return x;
       }
    }
    public int smallest(){
        if (x < y && x < z){
             return x;
        } else if ( y < x && y < z){
            return y;
        } else if ( z < x && z < y){
            return z;
        } else {
            return x;
        }
     }

    public static void main(String[] args) {
        int x,y,z;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ENTER First integer: \n");
        x = keyboard.nextInt();
        System.out.println("ENTER Second integer: \n");
        y = keyboard.nextInt();
        System.out.println("ENTER Third integer: \n");
        z = keyboard.nextInt();
        
        ThreeIntegers myThreeIntegers = new ThreeIntegers(x, y, z);
        System.out.println("Greatest: " + myThreeIntegers.greatest()+ "\n");
        System.out.println("Smallest: " + myThreeIntegers.smallest()+ "\n");
        System.out.println("Average : " + myThreeIntegers.average()+ "\n");
    }


}