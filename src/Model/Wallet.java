package Model;

import Exceptions.InvalidAmmountException;
import Exceptions.NotEnoughMoneyException;

import java.util.ArrayList;

public class Wallet {

    private ArrayList<Debt> debts;
    private ArrayList<Incomes> incomes;

    public Wallet() {
        debts = new ArrayList<>();
        incomes = new ArrayList<>();
    }

    public void pay (double value) throws NotEnoughMoneyException, InvalidAmmountException{
        int totalDebts = 0;
        for(Debt debt : debts){
            totalDebts += debt.getValues();
        }

        double totalIncomes = 0;
        for (Incomes income : incomes){
            totalIncomes += income.getValues();
        }
        double total = totalIncomes-totalDebts;
        if (value>total){
            throw new NotEnoughMoneyException(total,value);
        }else {
            addDebt(value);
        }

    }

    public void addDebt(double value) throws InvalidAmmountException{
        Debt d = new Debt(value);
        debts.add(d);
    }

    public void addIncome(double value) throws  InvalidAmmountException{
        Incomes i = new Incomes(value);
        incomes.add(i);

    }
}
