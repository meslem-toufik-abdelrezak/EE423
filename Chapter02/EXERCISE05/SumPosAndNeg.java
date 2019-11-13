import java.util.Scanner;


public class SumPosAndNeg{
    
    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int sum = 0;
    int positive = 0 ;
    int negative = 0;
    int count = 1 ; 
    double average = 0;

    System.out.println("Enter an integer:  ( Enter 0 to EXIT ! ) ");
    int digit = keyboard.nextInt();

    if  (digit == 0 ){
        System.out.println("Program exit ");
       
    } else{

        do {
            //calculate sum & average 
            sum += digit ;
            average = sum / count ;

            // check sign 
            if (digit > 0) {
                ++positive;
            } else{
                ++negative;
            };

            // output resaults
            System.out.println("Sum: " +sum);
            System.out.println("Positive numbers: " + positive);
            System.out.println("Negative numbers: " + negative);
            System.out.println("Average: " + average + "\n\n");

            // get new integer 
            System.out.println("Enter an integer:  ( Enter 0 to EXIT ! ) ");
            digit = keyboard.nextInt();
            ++count;

        }   while ( digit != 0 ) ;

    }
    
        



    }
}