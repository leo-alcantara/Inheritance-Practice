package se.lexicon;

import java.util.Arrays;

public class SalesPerson extends Employee {

    public int newClientAcquired = 1000;
    public int everyMaintainedClient = 500;

    public String name;
    public String [] maintainedClients;
    public String[] newClient;
    public int salesPersonSalary;

    public SalesPerson(String name, String[] maintainedClients, String[] newClient) {
        this.name = name;
        this.maintainedClients = maintainedClients;
        this.newClient = newClient;
        this.salesPersonSalary = CalculateSalary(baseSalary, newClientAcquired, everyMaintainedClient);
    }

    @Override
    public int CalculateSalary(int baseSalary, int achievements1, int achievements2 ) {
        salary = baseSalary + achievements1 + achievements2;
        return salary;
    }

    @Override
    public String toString() {
        return "SalesPerson{" + "baseSalary=" + baseSalary + ", newClientAcquired=" + newClientAcquired +
                ", everyMaintainedClient=" + everyMaintainedClient + ", name='" + name + '\'' + ", maintainedClients="
                + Arrays.toString(maintainedClients) + ", newClient=" + Arrays.toString(newClient) + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getMaintainedClients() {
        return maintainedClients;
    }

    public void setMaintainedClients(String[] maintainedClients) {
        this.maintainedClients = maintainedClients;
    }

    public String[] getNewClient() {
        return newClient;
    }

    public void setNewClient(String[] newClient) {
        this.newClient = newClient;
    }
}
