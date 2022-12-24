package Collection.Person;

import java.util.ArrayList;

public class PersonApp {
    ArrayList<IncomeDetails> createIncome(){
        ArrayList<IncomeDetails> details = new ArrayList<>();
        details.add( new IncomeDetails("EI", 80, 800, 24000));
        details.add( new IncomeDetails("Hourly Wages", 80, 800, 14000));
        return details;
    }

    public static void main(String[] args) {
        PersonApp personApp = new PersonApp();
        ArrayList<IncomeDetails> detail = personApp.createIncome();

        Income income = new Income(detail);

        ArrayList<Deduction> deduction = new ArrayList<>();

        Deduction deduction1 = new Deduction("CPP/QPP", 2000);
        deduction.add(deduction1);

        Person person1 = new Person(1, "18-Sep-2019", income, deduction);
        System.out.println("Id: "+person1.id);
        System.out.println("Current Date: "+person1.currentDate);

        System.out.println("Income: Description- "+person1.income.detail.get(0).description
                +" Unit- "+person1.income.detail.get(0).Unit
        +" Rate- "+ person1.income.detail.get(0).Rate + " Amount- "+person1.income.detail.get(0).Amount);

        System.out.println("Deduction: Descrition-"+person1.deduction.get(0).description
        +" Unit- "+ person1.deduction.get(0).description);


    }
}
