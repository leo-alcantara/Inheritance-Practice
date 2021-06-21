package se.lexicon;

import java.util.Arrays;

public class SystemDeveloper extends Employee {


    public int certificatesAcquired = 1000;
    public int programmingLanguagesLearned = 1500;

    public String[] certificates;
    public String[] languages;

    public SystemDeveloper(String[] certificates, String[] languages) {
        this.certificates = certificates;
        this.languages = languages;
        CalculateSalary();
    }

    @Override
    public void CalculateSalary() {
        salary = Employee.BASE_SALARY + (certificatesAcquired * certificates.length) + (programmingLanguagesLearned * programmingLanguages.length);
    }

    @Override
    public String toString() {
        return "SystemDeveloper{" + "certificatesAcquired=" + certificatesAcquired +
                ", programmingLanguagesLearned=" + programmingLanguagesLearned + ", certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) + '}';
    }

    public int getCertificatesAcquired() {
        return certificatesAcquired;
    }

    public void setCertificatesAcquired(int certificatesAcquired) {
        this.certificatesAcquired = certificatesAcquired;
    }

    public int getProgrammingLanguagesLearned() {
        return programmingLanguagesLearned;
    }

    public void setProgrammingLanguagesLearned(int programmingLanguagesLearned) {
        this.programmingLanguagesLearned = programmingLanguagesLearned;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}