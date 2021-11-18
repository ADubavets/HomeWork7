package org.itstep;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Equipment implements Comparable<Equipment> {
    private String name;        // наименование электрооборудования
    private Seller seller;      // Производитель / поставщик / фирма
    private String model;       // Модель электрооборудования
    protected int power;          // мощность, Вт
    private int category;       // категория электрооборудования
    private Date date;          // дата выпуска
    private String sDate;       // строковое значение даты выпуска
    private double price;       // цена покупки электрооборудования
    private boolean work;       // состояние работы: включено / выключено

    public Equipment(String name,Seller seller, String model, int power, int category, String sDate,
                     double price, boolean work) throws ParseException {
        this.name = name;
        this.seller = seller;
        this.model = model;
        this.power = power;
        this.category = category;
        this.sDate = sDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        this.date = dateFormat.parse(sDate);
        this.price = price;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getCategory() {
        return category;
    }

    public String getsDate() {
        return sDate;
    }

    public double getPrice() {
        return price;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    public String getModel() {
        return model;
    }

    public Seller getSeller() {
        return seller;
    }

    @Override
    public int compareTo(Equipment o) {
        if (this.power == o.power) return 0;
        else if (this.power < o.power) return -1;
        else return 1;
    }
    public String toString(){
        final StringBuffer buffer = new StringBuffer("Equipment {");
        String work = "does not work ";
        if (isWork() == true) work = "works ";
        buffer.append("name = ").append(name);
        buffer.append("seller = ").append(seller);
        buffer.append("model = ").append(model);
        buffer.append("power = ").append(power);
        buffer.append("} " + work);
        return buffer.toString();
    }
}