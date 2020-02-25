/*
 * Andrew Thompson
 * February 25, 2020
 * Find the prime numbers from 1-1000 using the Sieve of Eratosthenes
 */

package eratosthenes;

/**
 *
 * @author antho6229
 */

public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an array for of booleans that has an element for every number from 1-1000
        boolean numbers[] = new boolean[1000];
        
        //set all values to true
        numbers[1] = false; 
        for(int i = 2; i < numbers.length; i++){
            numbers[i] = true;
        }
        
        //set all non prime numbers to false. Start from 2 because 1 isnt prime,
        //and setting all multiples of 1 o false will set whole array to false
        for(int i = 2; i < numbers.length; i++){
            //if a number is prime, set all multiples of the number to false
            if(numbers[i]==true){
                //firss multiple of a number greater than the number 2*number
                for(int j = 2*i; j < numbers.length; j+=i){
                    numbers[j] = false;
                }
            }
        }
        
        int count = 1;
        
        //output the the prime numers, which are found at the indexes of elements which are true
        System.out.println("The prime numbers from 1-1000 are:\n");
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == true){
                System.out.print(i + " ");
                if(count == 10){
                    System.out.print("\n");
                    count = 0;
                }
                count++;
            }            
        }
    }
    
}
