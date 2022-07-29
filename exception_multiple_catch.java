/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_package;

/**
 *
 * @author Administrator
 */
public class exception_multiple_catch {

    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0 ;
        } catch (ArithmeticException e) {
            System.out.println("Task 1 completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Task 2 completed");
        } catch (Exception e) {
            System.out.println("General Task completed");
        }
        System.out.println("Rest of the code");

    }
}
