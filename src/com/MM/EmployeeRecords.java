package com.MM;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EmployeeRecords {

    private Map<String, Employee> records;

    public EmployeeRecords() {
        this.records = new HashMap<String, Employee>();
    }

    public void addEmployee(Employee e) {
//        this.records.put("Monir", new Employee(1,"MonirHossain",28));
        this.records.put(e.getName(),e);
    }
    public Map<String, Employee> getEmployee() {
        return Collections.unmodifiableMap( this.records);
    }
    public Map<String,Employee> getEmployeeCopy(){
        return new HashMap<String, Employee>(records);
    }
}
