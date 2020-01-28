package com.company;

import Employee.Employee;
import sun.awt.geom.AreaOp;

import java.rmi.AlreadyBoundException;

public class Main {

    public static void main(String[] args) {


        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Ivanov ", "Engineer", "ivivan@mailbox.com", "892312312", 100000, 30);
        persArray[1] = new Employee("Sokolov","Alexandr","iox@inbox.com","89219213356",100000,30);
        persArray[2] = new Employee("Petrov", "Semen", "ivan@mailbox.com", "892312312", 100000, 42);
        persArray[3] = new Employee("Sidorov", "Igor", "ian@mailbox.com", "892312312", 100000, 39);
        persArray[4] = new Employee("Stepanov", "John", "van@mailbox.com", "892312312", 100000, 41);

        for (Employee employee : persArray) {
            if (employee.determineAge() > 40){
                System.out.println(employee);
            }
        }
        
        
    }
    
}
