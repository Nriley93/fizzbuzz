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
import java.util.*;
public class MaxNumber {
    public static void main(String[] args){
        int max = 0,
            count = -1;
        // prompt for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        // loop terminates with user input of zero
        for(int number = -1; number != 0;){
            // stores user input in number variable
            number = input.nextInt();
            // counts max number and restarts iteration
            if(number == max){
                count++;
                continue;
            }
            // resets count of max number
            if(number > max)
                count = 1;
            // saves largest number in max variable
            max = Math.max(number, max);
        }  
        System.out.print
        ("The largest number is " + max +
         "\n" +
         "The occurrence count of the largest number is " + count);
    }
}
