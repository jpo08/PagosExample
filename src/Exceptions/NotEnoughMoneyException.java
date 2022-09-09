package Exceptions;

public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException(double total, double price){
        super("el precio es de "+ price + " y no le alcanza porque tiene "+ total);
    }

}
