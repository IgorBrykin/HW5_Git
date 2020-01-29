package com.company;

import Employee.Employee;
import sun.awt.geom.AreaOp;

import java.rmi.AlreadyBoundException;

public class Main {

    public static void main(String[] args) {


        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Ivanov", "Ivan", "Engineer","artist", "ivivan@mailbox.com", "892312312", 98000, 30);
        persArray[1] = new Employee("Petrov","Ivan", "Artist","artist", "ivivan@mailbox.com", "892312312", 95000, 45);
        persArray[2] = new Employee("Sidorov","Ivan", "Driver","artist", "ivivan@mailbox.com", "892312312", 98000, 43);
        persArray[3] = new Employee("Michenko","Ivan", "Teacher","artist", "ivivan@mailbox.com", "892312312", 89000,42);
        persArray[4] = new Employee("Chepaev","Ivan", "Typist","artist", "ivivan@mailbox.com", "892312312", 150000, 38);

        for (Employee employee : persArray) {
            if (40 <=employee.determineAge()){
                System.out.println(employee.toString());
            }
        }
        
        
    }
    
}
