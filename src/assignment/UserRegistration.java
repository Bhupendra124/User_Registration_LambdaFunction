package assignment;


import java.util.Scanner;
import java.util.regex.Pattern;

interface EmailValidationInterface {
    interface FirstNameInterface{
        boolean    firstNameValidation();
    }

    interface LastNameValidationInterface{
        boolean lastNameValidation();
    }

    interface EmailValidation{
        boolean emailValidation();
    }
    interface  MobileValidationInterface{
        boolean phoneNumberValidation();
    }

    interface PasswordValidationInterface{
        boolean passwordValidation();
    }


}


public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Enter firstName  :");
        EmailValidationInterface.FirstNameInterface PersonF = (() -> {
            Scanner scan = new Scanner(System.in);
            String fName = scan.next();
            return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
        });

        System.out.println(PersonF.firstNameValidation());

        System.out.println("Enter LastName :");
        EmailValidationInterface.LastNameValidationInterface PersonL = (() -> {
            Scanner scan = new Scanner(System.in);
            String lName = scan.next();
            return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
        });
        System.out.println(PersonL.lastNameValidation());

        System.out.println("Enter Email :");
        EmailValidationInterface.EmailValidation email = (() -> {
            Scanner scan = new Scanner(System.in);
            String Email = scan.next();
            return Pattern.matches("^[a-zA-Z0-9-.+]+@[a-zA-Z0-9.]+$", Email);

        });
        System.out.println(email.emailValidation());

        System.out.println("Enter Phone Number ");
        EmailValidationInterface.MobileValidationInterface Mobil = (() -> {
            Scanner scan = new Scanner(System.in);
            String phone = scan.next();
            return Pattern.matches("^[0-9]{3} [0-9]{10}$", phone);

        });
        System.out.println(Mobil.phoneNumberValidation());

        System.out.println("Enter Password  :");
        EmailValidationInterface.PasswordValidationInterface password = (() -> {
            Scanner scan = new Scanner(System.in);
            String Password = scan.next();
            return Pattern.matches("(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", Password);
        });
        System.out.println(password.passwordValidation());
    }
}
