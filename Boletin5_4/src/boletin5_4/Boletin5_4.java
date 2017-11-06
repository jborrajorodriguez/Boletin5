package boletin5_4;

import java.util.Scanner;

/**
 * @author jborrajorodriguez
 */
public class Boletin5_4 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    Persoas pers1=new Persoas();
    Persoas pers2=new Persoas();
    System.out.println("Introducir nombre persona 1");
    String nomePers1=teclado.nextLine();
    pers1.setNome(nomePers1);
    System.out.println("Introducir peso persona 1");
    int peso1=teclado.nextInt();
    pers1.setPeso(peso1);
    System.out.println("Introducir nombre persona 2");
    String nomePers2=teclado.next();
    pers2.setNome(nomePers2);
    System.out.println("Introducir peso persona 2");
    int peso2=teclado.nextInt();
    pers2.setPeso(peso2);
        System.out.println("nombre pers 1 "+pers1.getNome()+" peso pers 1"+pers1.getPeso()+"\n Persona 2 "+pers2.getNome());
    if(peso1>peso2){
        System.out.println("Persona que pesa más : \nNombre : "+pers1.getNome()+"\nPeso : "+pers1.getPeso()+"kg"+"\nDiferencia : "+(pers1.getPeso()-pers2.getPeso()));
        
    }
    else {
        System.out.println("Persona que pesa más : \nNombre : "+pers2.getNome()+"\nPeso : "+pers2.getPeso()+"kg"+(pers2.getPeso()-pers1.getPeso()));
    }
       
    
    }
    
}
