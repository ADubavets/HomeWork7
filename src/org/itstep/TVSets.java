package org.itstep;

import java.text.ParseException;

public class TVSets extends Equipment {
    private int diagonal;
    private String permission;
    private boolean smartTV;
    private int updateFrequency;
    private String screenTechnology;

    public TVSets(String name, Seller seller, String model, int power, int category, String sDate,
                  double price, boolean work, int diagonal, String permission, boolean smartTV, int updateFrequency,
                  String screenTechnology) throws ParseException {
        super(name, seller, model, power, category, sDate, price, work);
        this.diagonal = diagonal;
        this.permission = permission;
        this.smartTV = smartTV;
        this.updateFrequency = updateFrequency;
        this.screenTechnology = screenTechnology;
    }


    public int getDiagonal() {
        return diagonal;
    }

    public String toString(){
        String model = getName() + " " + getSeller() + " " + getModel();
        if (getSeller() == null) model = getName() + " " + getModel();
        String smartTV = null;
        if (isSmartTV() == true) smartTV = "нет";
        else smartTV = "да";
        String work = "не включено";
        if (isWork() == true)  work = "включено";
        String result = String.format("Электрооборудование: %s, Мощность: %s, Диагональ: %s, Разрешение: %s, smartTV: %s, " +
                        "Частота обновления, Гц: %s, Технология экрана: %s, Работа: %s\n",model,getPower(),getDiagonal(),getPermission(),
                smartTV,getUpdateFrequency(),getScreenTechnology(),work);
        return result;
    }

    public String getPermission() {
        return permission;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public int getUpdateFrequency() {
        return updateFrequency;
    }

    public String getScreenTechnology() {
        return screenTechnology;
    }
}
