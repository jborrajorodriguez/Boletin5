package boletin5_3;

import java.util.Scanner;

/**
 * @author jborrajorodriguez
 */
public class Boletin5_3 {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Metodos num1=new Metodos();
        int num=teclado.nextInt();
        num1.setNum(num);
        if(num1.getNum()>0){
            System.out.println("Signo +");
        }
        else if(num1.getNum()==0){
            System.out.println("Numero 0");
        }
        else {
        System.out.println("Signo -");
        }
    }
    
}
