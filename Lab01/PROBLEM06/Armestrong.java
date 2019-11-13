import java.util.Scanner;
import java.lang.Math; 

public class Armestrong {

    public static void main(String[] args) {
        Scanner keyboread = new Scanner(System.in);
        System.out.println("Enter a 3 digit number:");
        int number = keyboread.nextInt();
        String numberString = String.valueOf(number);
        int resault = 0;
        for(int i = 0 ; i < 3; i++){
            resault += Math.pow(Character.digit(numberString.charAt(i), 10), 3) ;
        }
        if (resault ==  number){
            System.out.println( resault + " is an Armestrong number !");
        } else{
            System.out.println( resault + " is NOT an Armestrong number !");
        }
        
    }


}