/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_package;

/**
 *
 * @author Administrator
 */
abstract class bike{
    abstract void run();
}
class honda extends bike{
    void run(){
        System.out.println("run Safely");
    }
}
public class abstraction {
    public static void main(String args[]){
        bike obj= new honda();
        obj.run();
    }
}
