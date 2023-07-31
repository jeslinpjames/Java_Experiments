/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sync;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeslinpjames
 */
public class Decremented extends Thread{
    Counter ob;
    public Decremented(Counter ob){
        this.ob = ob;
    }
     public void run(){
        while(true){           
            try {
                ob.decrement();
                Thread.sleep(100);           
            } catch (InterruptedException ex) {
                Logger.getLogger(Decremented.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }
}
