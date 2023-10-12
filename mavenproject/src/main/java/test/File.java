/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.io.*;

/**
 *
 * @author jeslin
 */
public class File {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("output.txt");
            BufferedWriter wr = new BufferedWriter(f);
            wr.write("JHDKJKDHD\n");
            wr.write("hjdjhgfkjjehf");
            wr.close();
        }
        catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
        try{
            FileReader f = new FileReader("output.txt");
            BufferedReader wr = new BufferedReader(f);
            String s;
            while((s=wr.readLine())!=null){
                System.out.println(s);
            }
            wr.close();
        }
        catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
