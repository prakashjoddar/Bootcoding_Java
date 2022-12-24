package Collection.Person;

import java.util.ArrayList;

public class Person {
    int id;
    String currentDate;

    Income income;
    ArrayList<Deduction> deduction;

    public Person(int id, String currentDate, Income income, ArrayList<Deduction> deduction) {
        this.id = id;
        this.currentDate = currentDate;
        this.income = income;
        this.deduction = deduction;
    }
}
