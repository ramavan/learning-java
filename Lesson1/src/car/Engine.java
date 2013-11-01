/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Artem
 */
public class Engine {
    int tip=555;
    private boolean isStarted; 
    public boolean start(){
        if(!isStarted){
        comSendCommand("start", tip);
         isStarted=true;
        
        }
        return true;
    }
    
    public boolean stop(){
         comSendCommand("stop", tip);
         isStarted=false;
        return true;
    }
    
    public double getTemp(){
        return comSendCommand("temp", tip);
        
    }
    
    public double getRev(){
        return comSendCommand("rev", tip);
        
    }
    
    
    
    
    
    @Override
    public boolean equals(Object o1){
        if(this==o1) return true;
        if(o1 instanceof Engine) {
            if (((Engine) o1).tip == tip) return true;
        }
        return false;
    }
    
    
    
    
    
    
    
    
    private double comSendCommand(String cmd, int p){
        double r=-1;
        System.err.println("\tCOM << " + cmd+p);
        if(cmd.equals("start")||(cmd.equals("stop"))){
            r=1;
        }
        
        if(cmd.equals("temp")){
            if(isStarted){
                r=150;
            }
            else{
                r=30;
            }
        }
        if(cmd.equals("rev")){
            if(isStarted){
                r=2000;
            }
            else{
                r=0;
            }
        }
        return r;
    }
}
