package Section_one.One;
import java.io.*;

import java.util.Scanner;

public class VowelConsonantSeparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String vowels = ""; 
        String consonants = "";

   
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { 
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    vowels += ch; 
                } else {
                    consonants += ch; 
                }
            }
        }

        
        try (FileWriter vowelWriter = new FileWriter("VOWEL.TXT")) {
            vowelWriter.write(vowels);
        } catch (IOException e) {
            System.out.println("Error writing to VOWEL.TXT");
        }

       
        try (FileWriter consonantWriter = new FileWriter("CONSONANT.TXT")) {
            consonantWriter.write(consonants);
        } catch (IOException e) {
            System.out.println("Error writing to CONSONANT.TXT");
        }

        System.out.println("Vowels and consonants have been saved to files.");
        scanner.close();
    }

}
