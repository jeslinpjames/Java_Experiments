/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sync;

/**
 *
 * @author jeslinpjames
 */
public class CounterMain {
    public static void main(String args[]){
        Counter ob = new Counter(10);
        Incremented iob = new Incremented(ob);
        Decremented dob = new Decremented(ob);
        iob.start();
        dob.start();
    }
    
}
