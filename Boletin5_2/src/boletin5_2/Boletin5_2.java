package boletin5_2;

import java.util.Scanner;

/**
 * @author jborrajorodriguez
 */
public class Boletin5_2 {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Metodos num1=new Metodos ();
        System.out.println("introducir Num1:");
        short numero1=teclado.nextShort();
        num1.setNum1(numero1);
        System.out.println("Introducir Num2:");
        short numero2=teclado.nextShort();
        num1.setNum2(numero2);
        if (num1.getNum1()>=num1.getnum2()){
            System.out.println("Resta = "+num1.resta());
            System.out.println("Suma = "+num1.suma());
        }
        else{
            System.out.println("Suma = "+num1.suma());
        }
        
    }
    
}
