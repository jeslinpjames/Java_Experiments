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
public class Incremented extends Thread {
    Counter ob ;
    public Incremented(Counter ob){
        this.ob = ob;
    }
    public void run(){
        while(true){
            try {
                ob.increment();
                Thread.sleep(99);
            } catch (InterruptedException ex) {
                Logger.getLogger(Incremented.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }
}
