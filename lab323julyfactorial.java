import java.util.*;
import java.util.Scanner;



public class lab323julyfactorial{

    public void calculatefactorial(int number){
    if (number<0 || number!>0){
        System.out.println("\nEnter number greater than zero");
    }
    else{
        int i,fact=1,total=0;
        for(i=0;i<number;i++){
            fact = i;
            fact = fact*i;
            total = fact;
            total = total+fact;
        }
         System.out.println("The factorial is"+ total);
    }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial:");
        int number,i;
        number = sc.nextInt();
        lab323julyfactorial object = new lab323julyfactorial();
        object.calculatefactorial(number);
        sc.close();
    }
    
}
