package org.example;

import java.lang.reflect.Array;

class Employee
{
    private static int counter=0;
    private int id = 0;
    private String name="";
    private String surname="";
    private String birthday;
    private String place = "";
    private int salary;
    private int arr51;
    private int arr52;
    private boolean is_married;
    public Employee(int id, String name, String surname, String birthday, String place, int salary, boolean is_married)
    {
        if (counter < 10) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.birthday = birthday;
            this.place = place;
            this.salary = salary;
            this.is_married = is_married;
            counter++;
        }
        else {
            System.out.println("ОШИБКА 100 ЧЕЛОВЕК");

        }
    }



    public static int getCounter() {
        return counter;
    }

    public int getSalary() {
        return salary;
    }
    public void print()
    {
        System.out.print("Name: "+name+"\n"+"Date of birth: "+birthday+"\n");
    }



    public void changeName(String name)
    {
        this.name = name;
    }
    public void changeSurname(String surname)
    {
        this.surname = surname;
    }
    public void changeBirthday(String birthday)
    {
        this.birthday = birthday;
    }
    public void changePlace(String place)
    {
        this.place = place;
    }

    public void changeSalary(int salary)
    {
        this.salary = salary;
    }

    public void changeStatus(boolean is_married)
    {
        this.is_married = is_married;
    }



}