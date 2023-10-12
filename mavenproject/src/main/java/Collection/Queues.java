/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @author jeslinpjames
 */
public class Queues {
    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        lst.add(1);
        lst.add("xyz");
        lst.addFirst(100);
        lst.addLast(999);
        for (Object X:lst){
            System.out.println(X);
        }
        
        PriorityQueue Que  = new PriorityQueue();
        Que.add(1);
        Que.add(2);
        Que.add(3);
        System.out.println(Que.peek());
        Que.poll();
        System.out.println(Que.peek());
        Que.poll();
        System.out.println(Que.peek());
//        for(Object X : Que){
//            System.out.println(X);
//        }
    }
    
}
