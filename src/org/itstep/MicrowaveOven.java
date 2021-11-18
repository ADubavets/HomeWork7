package org.itstep;

import java.text.ParseException;

public class MicrowaveOven extends Equipment{
    private boolean installation;
    private String operatingModes;
    private double volume;

    public MicrowaveOven(String name, Seller seller, String model, int power, int category, String sDate, double price,
                         boolean work, boolean installation, String operatingModes, double volume)
            throws ParseException {
        super(name, seller, model, power, category, sDate, price, work);
        this.installation = installation;
        this.operatingModes = operatingModes;
        this.volume = volume;
    }

    public boolean isInstallation() {
        return installation;
    }

    public String getOperatingModes() {
        return operatingModes;
    }

    public double getVolume() {
        return volume;
    }
    public String toString(){
        String model = getName() + " " + getSeller() + " " + getModel();
        if (getSeller() == null) model = getName() + " " + getModel();
        String installation = null;
        if (isInstallation() == true) installation = "встраиваемая";
        else installation = "отдельная установка";
        String work = "не включено";
        if (isWork() == true)  work = "включено";
        String result = String.format("Электрооборудование: %s, Мощность: %s," +
                        " Установка: %s, Количество режимов: %s, Объем: %s, Работа: %s \n",
                model,getPower(),installation,getOperatingModes(),getVolume(),work);
        return result;
    }
}
