package se.lexicon;

import java.time.LocalDate;

public abstract class Employee {

    private int id;
    private String name;
    public double salary;
    private LocalDate dateHired;

    public static final int BASE_SALARY = 25000;

    public Employee (int id, String name, LocalDate dateHired){
        this.id = id;
        this.name = name;
        this.dateHired = dateHired;
        this.salary = BASE_SALARY;
    }

    public abstract void CalculateSalary();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }
}
