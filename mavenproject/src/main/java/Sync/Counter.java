/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sync;

/**
 *
 * @author jeslinpjames
 */
public class Counter {
    private int limit;
    private int count;
    public Counter(int limit){
        this.limit = limit;
        this.count =0;
    }
    public void increment(){
        if(count>=limit){
            System.out.println("Limit Reached, Waiting for decrement.");
        }
        else{
            count++;
            System.out.println("Current count incremented to : "+count);
        }
    }
    public void decrement(){
        if(count<=0){
            System.out.println("Count can't be decremented.");
        }
        else{
            count--;
            System.out.println("Current count decremented to : "+count);
        }
    }
    
}
