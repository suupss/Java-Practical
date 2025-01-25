package Section_one.Two;
import java.util.Scanner;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); 
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            
            checkAge(age);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
           
            System.out.println("Invalid age: " + e.getMessage());
        }
        scanner.close();
    }
    

   
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");  
        }
        
    }

}
