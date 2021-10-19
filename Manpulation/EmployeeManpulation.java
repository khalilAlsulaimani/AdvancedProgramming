/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manpulation;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author alsul
 */
public class EmployeeManpulation {
    
    public static void main(String[] args){
        List<Emplyee> list = List.of(
                new Emplyee("adam" ,"red" , 5000 , "IT"),
                new Emplyee("liz" ,"fred" , 6000 , "Accounent"),
                new Emplyee("hazard" ,"eden" , 7000 , "IT"),
                new Emplyee("liam" ,"brown" , 8000 , "database eneginer"),
                new Emplyee("harvey" ,"louis" , 9000 , "janitor"),
                new Emplyee("erica" ,"chan" , 15000 , "vice"),
                new Emplyee("tomoyata" ,"dono" , 25000 , "CEO"));
        
        
        Predicate<Emplyee> fourToSixThousand =
                e -> (e.getSalary() >= 4000 && e.getSalary() <=6000);
        
        System.out.printf("%nEmployees earining 4000 to 6000 per month sorted by salary : %n");
        list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Emplyee::getSalary))
                .forEach(System.out::println);
        
        Function<Emplyee , String> byFirstName = Emplyee::getFirstName;
        Function<Emplyee, String> byLastName = Emplyee::getLastName;
        
        Comparator<Emplyee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);
        
        System.out.printf("%nEmployee in ascending order by last name then first name: %n");
        
        list.stream()
            .sorted(lastThenFirst)
             .forEach(System.out::println);
        
        System.out.println("unique employee last names");
        list.stream().map(Emplyee::getLastName).distinct().sorted().forEach(System.out::println);
    }
    
}
