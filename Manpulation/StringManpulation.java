
package Manpulation;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author alsul
 */
public class StringManpulation {
    public static void main(String[] args ){
        String[] strings = {"Red" , "Orange" , "Yellow " ,"Green","Blue","indigo","Violet"};
        
        System.out.printf("orginal values : %s%n",Arrays.stream(strings).toList());
        
        System.out.printf("Strings in uppercase : %s%n",
                Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList())
        );
        
        System.out.printf("strings less than n sorted acending : %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") <0 )
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList())
        );
        
        System.out.printf("strings less than n sorted decending : %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList())
        );
    }
    
}
