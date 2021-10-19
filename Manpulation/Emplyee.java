/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manpulation;

/**
 *
 * @author alsul
 */
public class Emplyee {
    private String firstName;
    private String lastName;
    private double salary;
    private String department;
    
    public Emplyee(String firstName , String lastName , double salary , String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
    
    public String getName(){
        return String.format("%s %s" , getFirstName() , getLastName());
    }
    
    @Override
    public String toString(){
        return String.format("%-8s %-8s %8.2f    %s",
                getFirstName(), getLastName() , getSalary(), getDepartment());
    }
    
    
}
