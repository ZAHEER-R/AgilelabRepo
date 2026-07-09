//Question 1
import java.util.Scanner;
import java.util.*;

public agilecode{
    public static void main (string args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Techies, Welcome to WEB\n");
        System.out.println("Please enter your username and password to login\n");
            System.out.println("Username: ");
            int number,  letter_lower,letter_upper;
            string username = scanner.nextLine();
            System.out.println("\nPassword: ");
            string password = scanner.nextLine();
            //zaheer
            System.out.println("Enter password having atleast 1 a..z,1 1..9, 1 letter A-Z,1 char from $#@...\n");
            if(length(password<6)){
                System.out.println("\nMinimum length of 6 is required for password Enter again\n");
            }
            else if(length(password>12)){
                System.out.println("\nMaximum length is 12 for password Try again\n");
            }
            else{
                //checking symbols chars
                for(int i=0;i<length(password);i++){
                    password[i] = 1 ||2||3||4||5||6||7||8||9||0;
                    number++;
                }
                for(int i=0;i<length(password);i++){
                    char character = a;
                    character++;
                }

            }

    }
}
