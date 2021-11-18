package org.itstep;

import java.text.ParseException;

public class WashingMachines extends Equipment{
    private String methodOfLoadingLaundry;
    private double maximumLoad;
    private int spinSpeed;

    public WashingMachines(String name, Seller seller, String model, int power, int category, String sDate,
                           double price, boolean work, String methodOfLoadingLaundry, double maximumLoad,
                           int spinSpeed) throws ParseException {
        super(name, seller, model, power, category, sDate, price, work);
        this.methodOfLoadingLaundry = methodOfLoadingLaundry;
        this.maximumLoad = maximumLoad;
        this.spinSpeed = spinSpeed;
    }

    public String getMethodOfLoadingLaundry() {
        return methodOfLoadingLaundry;
    }

    public double getMaximumLoad() {
        return maximumLoad;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }
    public String toString(){
        String model = getName() + " " + getSeller() + " " + getModel();
        if (getSeller() == null) model = getName() + " " + getModel();

        String work = "не включено";
        if (isWork() == true)  work = "включено";
        String result = String.format("Электрооборудование: %s, Мощность: %s, Способ загрузки белья: %s, " +
                        "Максимальная загрузка: %s, Скорость, об./мин.: %s, Работа: %s\n",
                model,getPower(),getMethodOfLoadingLaundry(),getMaximumLoad(),getSpinSpeed(), work);
        return result;
    }
}
