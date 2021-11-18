package org.itstep;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EquipmentByRoom {
    private List<Equipment> equipments = new LinkedList<>();
    private String nameRoom;

    public EquipmentByRoom(String s) {
        nameRoom = s;
    }

    public void addEquipment(Equipment equipment){
        equipments.add(equipment);
    }
    public void sort(){
        Collections.sort(equipments);
    }
    public String toString(){
        StringBuilder sb = new  StringBuilder();
        sb.append(nameRoom + ":  \n");
        for (Equipment equipment: equipments)
            sb.append(equipment.toString());
        return  sb.toString();
    }
    public double getPower(){
        int power = 0;
        for (Equipment equipment: equipments) if (equipment.isWork() == true) power += equipment.getPower();
        return  power;
    }
    public void equipmentPowerMax(double max) {
        for (Equipment equipment: equipments)
            if (max < equipment.power) System.out.println(equipment.toString());
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }
}
