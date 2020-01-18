package com.MM;

import java.util.ArrayList;
import java.util.Map;

public class EmpTest {

    public static void main(String []args) {
       /* final Employee employee = new Employee(1,"Monir", 28);
        employee.setName("Nouf");
        System.out.println(employee);*/
        EmployeeRecords records = new EmployeeRecords();
                        records.addEmployee(new Employee(1, "Monir", 28));
                        records.addEmployee(new Employee(2, "MonirHossain", 29));

                        for(Employee emmp : records.getEmployee().values()){
                            System.out.println(emmp);
                        }

        Map<String, Employee> getRecords = records.getEmployee();
   //    getRecords.clear();
        System.out.println(getRecords.values());

        Map<String,Employee> temp =records.getEmployeeCopy();
                            temp.clear();
        System.out.printf("Duplicate Value: ");
        System.out.println(getRecords.values());

        ArrayList al =new ArrayList<Employee>();
        for(Employee emp : records.getEmployee().values()){
            al.add(emp);
        }

        ArrayList al2 = al;
        ArrayList al3 = new ArrayList<Employee>(al);
       // al3.remove(0);
        al3.set(1, new Employee(5, "Kohli",31));
        al.forEach(emp ->{
            System.out.println(emp);
        });
        al3.forEach(emp ->{
            System.out.println(emp);
        });

    }
}
