/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_package;

/**
 *
 * @author Administrator
 */
class InvalidAgeException extends Exception {

    InvalidAgeException(String s) {
        super(s);
    }
}

public class customException {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("not valid");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String args[]) {
        try {
            validate(13);
        } catch (Exception m) {
            System.out.println("Exception occured" + m);

        }
                    System.out.println("Rest of the code");

    }
}
