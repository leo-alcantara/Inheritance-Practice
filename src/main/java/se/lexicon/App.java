package se.lexicon;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {



    public static void main(String[] args) {

        String[] certificates = {"OCA", "OCP", "OCE"};
        String [] languages = {"Java", "C++", "Python"};

        SystemDeveloper systemDeveloper01 = new SystemDeveloper(1, "John Doe", LocalDate.parse("2021-06-22"), certificates, languages);

        System.out.println(systemDeveloper01.toString());


    }

}
