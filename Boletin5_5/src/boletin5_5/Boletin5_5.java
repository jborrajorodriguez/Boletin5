package boletin5_5;

import java.util.Scanner;

/**
 * @author jborrajorodriguez
 */
public class Boletin5_5 {

    public static void main(String[] args) {
       
        Scanner teclado=new Scanner(System.in);
        Numeros num=new Numeros();
        System.out.println("Introducir número 1");
        int numero1=teclado.nextInt();
        num.setNum1(numero1);
        System.out.println("introducir número 2 ");
        int numero2=teclado.nextInt();
        num.setNum2(numero2);
        System.out.println("introducir número 3 ");
        int numero3=teclado.nextInt();
        num.setNum3(numero3);
        if(num.getNum1()>num.getNum2()&&num.getNum2()>num.getNum3()){
            System.out.println(num.getNum1());
        }
        else if(num.getNum2()>num.getNum3()){
            System.out.println(num.getNum2());
        }
        else System.out.println(num.getNum3());
        
  
       }
}

