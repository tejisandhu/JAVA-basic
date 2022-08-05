/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Administrator
 */
public class File_handling_byte_array_output_stream {
    public static void main(String args[]) throws Exception{
        FileOutputStream fout1=new FileOutputStream("f1.txt");
        FileOutputStream fout2=new FileOutputStream("f2.txt");

        ByteArrayOutputStream bout= new ByteArrayOutputStream();
        String s="Hello";
        
        bout.writeTo(fout1);
                        bout.writeTo(fout2);

}
}