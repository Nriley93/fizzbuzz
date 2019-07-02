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
public class CozaLozaWoza {
    public static void main(String[] args){
        //Loop iterates 100 times
        for(int count = 1; count <= 110; count++){
            // Prints "Coza" if divisible by 3 && 5
            if(count % 15 == 0)
                System.out.print("CozaLoza ");
            // prints "Loza" if divisible by 5
            else if(count % 5 == 0)
                System.out.print("Loza ");
            //prints "CozaWoza if divisible by 7 && 3"
            else if(count % 21 == 0)
                System.out.print("CozaWoza ");
            // prints "cards!" if divisible by 3
            else if(count % 3 == 0)
                System.out.print("Coza ");
            // prints "Woza" if divisible by 7
            else if(count % 7 == 0)
                System.out.print("Woza ");
            else
                System.out.print(count + " ");
            if(count % 11 == 0)
                System.out.println();
        }
    }
}