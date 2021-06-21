package se.lexicon;

public class SystemDeveloper extends Employee {
    public String name;
    public String [] certificates;
    public String[] languages;

    public SystemDeveloper(String name, String[] certificates, String[] languages) {
        this.name = name;
        this.certificates = certificates;
        this.languages = languages;
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

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
