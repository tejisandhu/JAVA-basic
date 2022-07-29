/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_package;
import java.io.*;
/**
 *
 * @author Administrator
 */
public class File_handling_Buffer_Output_stream {
   public static void main(String args[]) throws Exception{
       FileOutputStream fout= new FileOutputStream("f1.txt");
       BufferedOutputStream bout= new BufferedOutputStream(fout);
       String s= "Sachin is a player";
       byte b[]=s.getBytes();
       bout.write(b);
       
       bout.flush();
       bout.close();
       fout.close();
       System.out.println("Success");
   } 
}
