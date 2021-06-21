package se.lexicon;

public class Employee {

    public int salary;
    public int baseSalary = 25000;
    //public int newClient = 1000;
    //public int maintainedClient = 500;
    //public int certificates = 1000;
    //public int programmingLanguages = 1500;

    public int CalculateSalary(int baseSalary, int achievements1, int achievements2 ) {
          salary = baseSalary + achievements1 + achievements2;
        return salary;
    }


}
