package Exceptions;

public class InvalidAmmountException extends Exception{

    public InvalidAmmountException(double value) {
        super("El valor"+value+" no es un registro valido");
    }
}
