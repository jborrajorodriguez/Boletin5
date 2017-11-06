package boletin5_6;

import java.util.Scanner;

/**
 * @author jborrajorodriguez
 */
public class Boletin5_6 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introducir cantidad del articulo");
        int articulo1=teclado.nextInt();
        Metodos articulo=new Metodos(articulo1);
        if(articulo1>1000){
            System.out.println("Primeira necesidade");
        }
        else if(articulo1>500&&articulo1<=1000){
            System.out.println("Alto");
        }
        else if(articulo1>100&&articulo1<=500){
            System.out.println("Medio");
        }
        else System.out.println("Baixo");

    }

}
