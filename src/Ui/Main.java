package Ui;

import Exceptions.InvalidAmmountException;
import Exceptions.NotEnoughMoneyException;
import Model.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("v2");

        try {
            User user = new User();
            user.getWallet().addIncome(10000);
            user.getWallet().addDebt(2000);
            user.getWallet().pay(8500);

        }catch (NotEnoughMoneyException ex){
            ex.printStackTrace();
        }catch (InvalidAmmountException ex){
            ex.printStackTrace();
        }


    }
}
