package org.itstep;

import java.text.ParseException;

public class Lamps extends Equipment {
    private double lightFlow;

    public Lamps(String name, Seller seller, String model, int power, int category, String sDate, double price,
                 boolean work, double lightFlow) throws ParseException {
        super(name, seller, model, power, category, sDate, price, work);
        this.lightFlow = lightFlow;
    }


    public String toString(){
        String model = getName() + " " + getSeller() + " " + getModel();
        if (getSeller() == null) model = getName() + " " + getModel();

        String work = "не включено";
        if (isWork() == true)  work = "включено";
        String result = String.format("Электрооборудование: %s, Мощность: %s, Световой поток: %s, Работа: %s\n",
                model,getPower(),getLightFlow(), work);
        return result;
    }

    public double getLightFlow() {
        return lightFlow;
    }
}
