/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jeslin
 */
import java.io.*;

public class filewriter {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Write text to the file
        writeToFile(filePath);

        // Read text from the file
        readFromFile(filePath);
    }

    // Method to write text to a file
    public static void writeToFile(String filePath) {
        try {
            // Create a FileWriter with the specified file path
            FileWriter writer = new FileWriter(filePath);

            // Write text to the file
            writer.write("Hello, Java FileWriter and FileReader!");

            // Close the FileWriter to release resources
            writer.close();

            System.out.println("Text written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read text from a file
    public static void readFromFile(String filePath) {
        try {
            // Create a FileReader with the specified file path
            FileReader reader = new FileReader(filePath);

            // Create a character buffer for reading
            char[] buffer = new char[1024];

            // Read characters from the file into the buffer
            int bytesRead = reader.read(buffer);

            // Close the FileReader
            reader.close();

            if (bytesRead != -1) {
                // Convert the buffer to a string and print it
                String content = new String(buffer, 0, bytesRead);
                System.out.println("Text read from the file:");
                System.out.println(content);
            } else {
                System.out.println("No data read from the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
