/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;
// inner


class Computer {
    
    /**
     * Объем памяти в байтах
     */
    int ram;
    final double cpuFreq;
    boolean isHdmi;
    static int num=0;
    /**
     * Конструктор по умолчанию
     */
    public Computer(double fr) {
        cpuFreq = fr;
        num++;
    }
    
    void test() {
       System.out.println("Test: "+cpuFreq);
    }
    
    static void test2() {
       System.out.println("Количество: " + num);
    } 
    
    static double mean(double[] vs) {
        ///.......
        double f=0;
        for (int i = 0; i < vs.length; i++) {
            f+=vs[i]; 
        }
       // System.out.println((int)f/vs.length);печать для проверки
        return f/vs.length;
    }
}

/**
 *  Мой сурер класс
 * @author Artem
 */
public class Lesson1 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer c1 = new Computer(1.1);
        Computer.test2();

        Computer c2 = new Computer(1.4);
        
        c1.test();
       
        
        c2.test();
        Computer.test2();
        
        System.out.println(0.0 == Computer.mean(new double[] {}));
    }
}
