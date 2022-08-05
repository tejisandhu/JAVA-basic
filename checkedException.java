/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_package;

/**
 *
 * @author Administrator
 */
class TestExceptionPropagation1{
    //Checked exceptions are NOT forwarded in the calling chain ie they are NOT propagated, hence this program will show an error
    void m(){
        throw new java.io.IOException("Device Error");  //checked excpetion
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }
        catch(Exception e){
            System.out.println("Exception Handled");
        }
    }
}
public class checkedException {
    public static void main(String args[]){
    TestExceptionPropagation1 obj=new TestExceptionPropagation1();
    obj.p();
    System.out.println("Normal flow...");
}
}
