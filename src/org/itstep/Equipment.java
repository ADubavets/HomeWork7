package org.itstep;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

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
    private List<Equipment> equipments = new LinkedList<>();

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

    public void sortMain(){
        Collections.sort(equipments);
    }

    @Override
    public int compareTo(Equipment o) {
        if (this.power == o.power) return 0;
        else if (this.power < o.power) return -1;
        else return 1;
    }
    public String toStringMain(){
        final StringBuffer buffer = new StringBuffer("Электрооборудование:");
        buffer.append(" ").append(name);
        if (seller != null)
            buffer.append(" Производство: ").append(seller);
        buffer.append(" Модель: ").append(model);
        buffer.append(" Мощность: ").append(power);
        String work = "не включено";
        if (isWork() == true) work = "включено\n";
        buffer.append(" Работа: " + work);
        return buffer.toString();
    }

}