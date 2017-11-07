package boletin5_7;

import java.util.Scanner;

/**
 * @author jborrajorodriguez
 */
public class Comparaciones {
   Scanner num=new Scanner(System.in);
    public void escoger(int numero){
        switch(numero){
            case 1:System.out.println("Cuadrado");
                System.out.println("Introducir lado");
            int lado=num.nextInt();
            int cuadrado=(int) Math.pow(lado,2);
                System.out.println("El area es de = "+cuadrado);
            break;
            case 2:System.out.println("Triangulo");
                System.out.println("Introducir Base");
            int base=num.nextInt();
                System.out.println("Introducir altura");
            int altura=num.nextInt();
            int triangulo=base*altura/2;
                System.out.println("El area es de = "+triangulo);
            break;
            case 3:System.out.println("Circulo");
                System.out.println("Introducir radio");
            double radio=num.nextDouble();
            double circulo=Math.PI*Math.pow(radio, 2);
                System.out.println("El area es de = "+circulo);
            break;
            default:System.out.println("Opción incorrecta");
        }
    }

}
