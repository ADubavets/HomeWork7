package org.itstep;

import java.text.ParseException;

public class VacuumCleaners extends Equipment {
    private double suctionPower;    //мощность всасывания, Вт
    private double noiseLevel;      //уровень шума, дБ

    public VacuumCleaners(String name, Seller seller, String model, int power, int category, String sDate,
                          double price, boolean work, double suctionPower, double noiseLevel) throws ParseException {
        super(name, seller, model, power, category, sDate, price, work);
        this.suctionPower = suctionPower;
        this.noiseLevel = noiseLevel;
    }


    public String toString(){
        String model = getName() + " " + getSeller() + " " + getModel();
        String result = String.format("[Equipment: %s, power: %s, Suction power: %s, Noise level: %s",
                model,getPower(),getSuctionPower(),getNoiseLevel());
        return result;
    }

    public double getSuctionPower() {
        return suctionPower;
    }

    public double getNoiseLevel() {
        return noiseLevel;
    }


}
