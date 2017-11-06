package boletin5_2;
/**
 * @author jborrajorodriguez
 */
public class Metodos {
     
    private short num1;
    private short num2;
    
    public Metodos(){
    }
    
    public void setNum1(short num1){
        this.num1=num1;
    }
    public void setNum2(short num2){
        this.num2=num2;
    }
    public short getNum1(){
        return num1;
    }
    public short getnum2(){
        return num2;
    }
    public short suma(){
        short suma=(short) (num1+num2);
        return suma;
    }
    public short resta(){
        short resta=(short) (num1-num2);
        return resta;
    }
    
    
}
