import java.util.Scanner;


public class Sum {

    public static void main(String[] args) {
        Scanner keyboread = new Scanner(System.in);
        System.out.println("Enter a 3 digit number:");
        int number = keyboread.nextInt();
        String numberString = String.valueOf(number);
        int resault = 0;
        for(int i = 0 ; i < 3; i++){
            resault += Character.digit(numberString.charAt(i), 10);
        }
        System.out.println(resault);
    }


}