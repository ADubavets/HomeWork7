package org.itstep;

import java.text.ParseException;

public class Refrigerator extends Equipment{
    private String construction;
    private int countCamera;
    private Color color;

    public Refrigerator(String name, Seller seller, String model, int power, int category, String sDate,
                        double price, boolean work, String construction, int countCamera, Color color)
            throws ParseException {
        super(name, seller, model, power, category, sDate, price, work);
        this.construction = construction;
        this.countCamera = countCamera;
        this.color = color;
    }

    public String getConstruction() {
        return construction;
    }

    public int getCountCamera() {
        return countCamera;
    }

    public Color getColor() {
        return color;
    }
    public String toString(){
        String model = getName() + " " + getSeller() + " " + getModel();
        if (getSeller() == null) model = getName() + " " + getModel();
        String work = "не включено";
        if (isWork() == true)  work = "включено";
        String result = String.format("Электрооборудование: %s, Мощность: %s," +
                        " Конструкция: %s, Количество камер: %s, Цвет: %s, Работа: %s\n",
                model,getPower(),getConstruction(),getCountCamera(),getColor(), work);
        return result;
    }
}
