package boletin5_1;

import java.util.Scanner;

/**
 * @author jborrajorodriguez
 */
public class Boletin5_1 {

    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       Metodos num=new Metodos();
       System.out.println("Introduce un número : ");
       int num1=teclado.nextInt();
       num.setNum(num1);
       if (num.getNum()>0){
            System.out.println(num1+" es POSITIVO");
        }
    }
    
}
