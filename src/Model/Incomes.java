package Model;

import Exceptions.InvalidAmmountException;

public class Incomes {
    private double values;

    public Incomes(double values) throws InvalidAmmountException {
        //podemos lanzar la excepcion;
        if (values <= 0){
            throw new InvalidAmmountException(values);
        }else{
            this.values = values;
        }

    }

    public double getValues() {
        return values;
    }

    public void setValues(double values) {
        this.values = values;
    }
}
