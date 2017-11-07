package boletin5_7;

import java.util.Scanner;

/**
 * @author jborrajorodriguez
 */
public class Boletin5_7 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Comparaciones comp=new Comparaciones();
        System.out.println("Escoga una de las siguientes opciones:\n1-Cuadrado\n2-Triangulo\n3-Circulo");
        int frigura=teclado.nextInt();
        comp.escoger(frigura);
        

    }

}
