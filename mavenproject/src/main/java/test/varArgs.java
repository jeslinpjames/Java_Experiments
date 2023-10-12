/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jeslin
 */
public class varArgs {
    public int sum(int ... n){
        int sum = 0;
        for(int i=0;i<n.length;i++){
            sum= sum+n[i];
        }
        return sum;
    }
    public static void main(String args[]){
        varArgs ob = new varArgs();
        int sum =ob.sum(1,2,3,4,5,6,7,8);
        System.out.println("SUM = "+ sum);
    }
}
