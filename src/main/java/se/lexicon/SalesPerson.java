package se.lexicon;

import java.time.LocalDate;
import java.util.Arrays;

public class SalesPerson extends Employee {

    public int newClientAcquired = 1000;
    public int everyMaintainedClient = 500;


    private String [] clients;
    private String[] acquiredClients;


    public SalesPerson(int id, String name, LocalDate dateHired, String[] clients, String[] acquiredClients) {
        super(id, name, dateHired);
        this.clients = clients;
        this.acquiredClients = acquiredClients;
        CalculateSalary();
    }

    @Override
    public void CalculateSalary() {
        salary = Employee.BASE_SALARY + (newClientAcquired * acquiredClients.length) + (everyMaintainedClient * clients.length);
    }

    @Override
    public String toString() {
        return "SalesPerson{" + "newClientAcquired=" + newClientAcquired +
                ", everyMaintainedClient=" + everyMaintainedClient + ", clients=" + Arrays.toString(clients) +
                ", acquiredClients=" + Arrays.toString(acquiredClients) + '}';
    }

    public int getNewClientAcquired() {
        return newClientAcquired;
    }

    public void setNewClientAcquired(int newClientAcquired) {
        this.newClientAcquired = newClientAcquired;
    }

    public int getEveryMaintainedClient() {
        return everyMaintainedClient;
    }

    public void setEveryMaintainedClient(int everyMaintainedClient) {
        this.everyMaintainedClient = everyMaintainedClient;
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public String[] getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(String[] acquiredClients) {
        this.acquiredClients = acquiredClients;
    }
}
