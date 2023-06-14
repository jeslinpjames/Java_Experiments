/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author james
 */
public class value_main {
    public static void main(String args[])
    {
        value ob = new value();
        int x=10,y=12;
        ob.setX(x);
        ob.setY(y);
        ob.sum();
        System.out.println("The sum of "+ob.getX()+" and "+ob.getY()+" is : "+ob.getsum());
    }
}
