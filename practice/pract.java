/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author alsul
 */
public class pract {
    public static void main(String[] args){
        System.out.printf("sum of 1 through 10 is %d%n",IntStream.rangeClosed(1,10).sum() );
        
        System.out.printf("sum of the even ints from 2 through 20 is : %d%n", 
                IntStream.rangeClosed(1, 10)
                        .map(x -> x*2)
                        .sum());
        
        System.out.printf("Sum of the triplets of the even ints from 2 through 10 is: %d%n",
                IntStream.rangeClosed(1,10)
                        .filter(x -> x%2 == 0)
                        .map(x-> x*3)
                        .sum());
        
        
        SecureRandom rand = new SecureRandom();
        
        System.out.println("Random numbers on seperate lines: ");
        rand.ints(10,1,7)
                .forEach(System.out::println);
        
        String numbers = 
                rand.ints(10,1,7)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "));
        
        System.out.printf("%nRandom numbers on one line: %s%n", numbers);
        
        
        int[] values ={3,10,6,1,4,8,2,5,9,7};
        
        System.out.println();
        
        System.out.print("original values : ");
        System.out.println(
        IntStream.of(values).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        
        
        System.out.printf("Count: %d%n" , IntStream.of(values).count());
        
        System.out.printf("Min : %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max : %d%n" , IntStream.of(values).max().getAsInt());
        System.out.printf("avg : %f%n", IntStream.of(values).average().getAsDouble());
        System.out.printf("sum : %d%n", IntStream.of(values).sum());
        
         
        System.out.printf("%nSum via reduce method :%d%n ",
                IntStream.of(values)
                .reduce(0,(x,y) -> x+y));
        
        System.out.printf("product by reduce method : %d%n ", IntStream.of(values).reduce((x,y) -> x*y).getAsInt());
        
        System.out.printf("sum of square via map and sum : %d%n", IntStream.of(values).map(x  -> x*x).sum());
         
        
    }
}
