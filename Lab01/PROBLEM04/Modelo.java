import java.util.Scanner;

import sun.security.pkcs11.Secmod.Module;
public class Modelo{
    int x;
    public String modulo(){
        if( x % 2 == 0){
            return "even" ;
        } else {
            return "odd";
        }
    }
    public Modelo(int X){
        x = X; 
    }

    public static void main(String[] args) {
        Scanner keyboread = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int x = keyboread.nextInt();
        Modelo calculator = new Modelo(x);
        System.out.println(" INTEGER IS " + calculator.modulo());
        
    }
}