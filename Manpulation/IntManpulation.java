/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manpulation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author alsul
 */
public class IntManpulation {
    public static void main(String[] args){
        Integer[] values  = {2,3,5,0,3,7,1,4,8,6};
        
        System.out.printf("orginal values : %s%n ", Arrays.asList(values));
        
        System.out.printf("Sorted values %s%n ", Arrays.stream(values).sorted().collect(Collectors.toList()));
        
        List<Integer> greaterThan4 = 
                Arrays.stream(values)
                        .filter(value -> value > 4)
                        .collect(Collectors.toList());
        
        System.out.printf("values greater than 4 : %s%n", greaterThan4);
                
    }
    
}
