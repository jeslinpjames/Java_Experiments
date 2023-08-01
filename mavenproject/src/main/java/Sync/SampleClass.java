/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sync;

/**
 *
 * @author jeslinpjames
 */
public class SampleClass {
    public static void increment(Integer a ){
        a++;
    }
    public static void main(String[] args) {
        int i =5;
        Integer I = new Integer(i);
        System.out.println("i before Increment : "+ I);
        increment(I);
        System.out.println("i after Increment : "+I);
    }
}
