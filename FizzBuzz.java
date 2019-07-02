/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.fizzbuzz;

/**
 *
 * @author Nickolas
 */
public class FizzBuzz {
     public static void main(String[] args){
        //Loop iterates 100 times
        for(int count = 1; count <= 100; count++){
                 
            // Prints "FizzBuzz" upon condition
            if((count % 3 == 0) && (count % 5 == 0))
                System.out.println("FizzBuzz");
            // prints "Buzz" upon condition
            else if(count % 5 == 0)
                System.out.println("Buzz");
            // prints "Fizz" upon Condition
            else if(count % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(count);
                      
        }
    }
}

