package se.lexicon;

import java.util.Arrays;

public class SystemDeveloper extends Employee {

    public int certificatesAcquired = 1000;
    public int programmingLanguagesLearned = 1500;

    public String name;
    public String [] certificates;
    public String[] programmingLanguages;
    public int systemDeveloperSalary;

    public SystemDeveloper(String name, String[] certificates, String[] languages) {
        this.name = name;
        this.certificates = certificates;
        this.programmingLanguages = languages;
        this.systemDeveloperSalary = CalculateSalary(baseSalary, certificatesAcquired, programmingLanguagesLearned);
    }

    @Override
    public int CalculateSalary(int baseSalary, int achievements1, int achievements2 ) {
        salary = baseSalary + achievements1 + achievements2;
        return salary;
    }

    @Override
    public String toString() {
        return "SystemDeveloper{" + "certificatesAcquired=" + certificatesAcquired + ", programmingLanguagesLearned=" + programmingLanguagesLearned +
                ", baseSalary=" + baseSalary + ", name='" + name + '\'' + ", certificates=" + Arrays.toString(certificates) +
                ", programmingLanguages=" + Arrays.toString(programmingLanguages) + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
}
