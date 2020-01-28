package Employee;

import javax.print.event.PrintJobListener;
import javax.swing.*;

/* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    * Конструктор класса должен заполнять эти поля при создании объекта;
    * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    * Создать массив из 5 сотрудников

    Пример:
    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    persArray[1] = new Person(...);
    ...
    persArray[4] = new Person(...);
    * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;*/
public class Employee {


    private String surname;
    private  String name;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int age;
    private int salary;



    public Employee(String surname, String name, String patronymic, String position,
                    int age, int salary) {



        this.surname = surname.toLowerCase();
        this.name = name.toLowerCase();
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;

        System.out.println("surname = " + surname + ", name = " + name + ", patronymic = " + patronymic + ", position = " + position + ", email = " + email + ", phone = " + phone + ", age = " + age + ", salary = " + salary);
        System.out.println(toString()); // Проверил на работоспособность
        }

    public int determineAge() {

        return age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }



    }








