/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sync;

/**
 *
 * @author jeslinpjames
 */
public class VariableArguments {
    public static int sum(int ...a){
        int sum =0;
        for(int i=0;i<a.length;i++)
            sum=sum+a[i];
        return sum;
    }
    public static void main(String[] args) {
        int s ;
        s=sum(1,2);
        System.out.println("Sum = "+s);
        s=sum(1,2,3,4);
        System.out.println("Sum = "+s);
        
    }
    
}
