/*
Daniel Karasek
Student ID 171224
Lab 3 - Binary to Integer Converter
*/

package converter_lab3;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author karas_000
 */
public class Converter_Lab3 {
    
    
    public static void main(String[] args) {
        int x = 1;
        char d;
        boolean c = true;
        boolean g = true;
        boolean h = true;
        boolean p = true;
        //Scanner in = new Scanner(System.in);
        Scanner scan = new  Scanner(System.in);
        //Scanner reader = new Scanner(System.in);
        
        while (g == true)
        {
            while (c == true)
            {
                System.out.println("Welcome to the Binary <-> Decimal Conversion Program \n\n Enter 1, 2, or 3 for the following: \n\n 1 Integer -> Binary \n\n 2 Binary -> Integer \n\n 3 Quit\n");
                
                d = scan.next().charAt(0);
                
                System.out.println("You entered: " + d + "\n");
                
                if (d == '1' )
                {
                    x = 1;
                    c = false;
                }
                else if (d == '2' )
                {
                    x = 2;
                    c = false;
                }
                else if (d == '3' )
                {
                    x = 3;
                    c = false;
                }
                else
                {
                    System.out.println("Incorrect Input: Enter 1, 2, or 3\n");
                    System.out.println("Press Any Key To Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    c = true;
                }
            }
            
            if (x == 1)
            {
                
                try
                {
                    scan = new Scanner(System.in);
                    System.out.println("Enter an Integer: \n");
                    int e = scan.nextInt();
                    System.out.println("You entered: " + e);
                    System.out.println("\nConverted \t" + Integer.toBinaryString(e) + "\n");
                }
                catch(InputMismatchException z)
                {
                    System.out.println("Exception Thrown:\t" + z);
                }
                
                System.out.println("Press Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();
                
                
                c = true;
                
                
            }
            else if (x == 2)
            {
                
                try
                {
                    System.out.println("Enter a string with digits 0 or 1: \n");
                    String a = scan.next();
                    System.out.println("You entered: " + a );
                    int foo = Integer.parseInt(a , 2);
                    System.out.println("\nConverted \t" + foo + "\n");
                    
                }
                catch(NumberFormatException e){
                    System.out.println("Exception Thrown:\t" + e);
                }
                
                //System.out.println("\nConverted \t" + foo + "\n");
                
                System.out.println("Press Any Key To Continue...");
                new java.util.Scanner(System.in).nextLine();
                
                
                c = true;
                
                
                
                
            }
            else if (x == 3)
            {
                
                
                while (h == true)
                {
                    System.out.println("Are you sure you want to quit? Y/N:");
                    char q = scan.next().charAt(0);
                    if (q == 'y' || q == 'Y' )
                    {
                        System.exit(0);
                    }
                    else if (q == 'n' || q == 'N' )
                    {
                        h = false;
                        x = 4;
                    }
                    else
                    {
                        System.out.println("Error: Please enter y or n");
                        h = true;
                    }
                }
            }
            else if (x == 4)
            {
                g = true;
                c = true;
                h = true;
                x = 1;
            }
// x = scan.nextInt();  exception if wrong datatype
            /*while (!scan.hasNextInt())
            {
            String trash = scan.next();
            System.out.println("Incorrect Input");
            }*/
//x = scan.nextInt();
            
        }
        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
        System.exit(0);
        
    }
}
//
/*int [] arr = new int[10];

// i want to read a string that only has a
String a;
boolean b;
boolean error = true;
while (error = true)
{
System.out.println("Enter a string with digits 0 - 4");
a = Scan.next();
System.out.println("You entered: " + a);
// validate the characters
for (int j = 0; j < a.length(); j++){
if (a.charAt(j) > '4'){
System.out.println("Invalid... so Noooope");
error  = false;
}
}

}*/



