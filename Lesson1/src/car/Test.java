/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Artem
 */
public class Test {
    public static void main(String []args){
        Engine e= new Engine();
        Engine e1= new Engine();
        
        
        System.out.println(e1==e);
        System.out.println(e1.equals(e));
        
        e.start();
        System.out.println("Проверка температуры "+e.getTemp()); 
        System.out.println("Проверка оборотов "+e.getRev());
        pause(2);
        

        e.stop();
        System.out.println("Проверка температуры "+e.getTemp()); 
        System.out.println("Проверка оборотов "+e.getRev());
    }
    
    
   static void pause(double a){
        try {
            Thread.sleep((int)(a*1000));
        } catch(Exception exc){
        } 
    }
    
}
