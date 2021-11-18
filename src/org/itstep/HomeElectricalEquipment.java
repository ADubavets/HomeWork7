package org.itstep;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

public class HomeElectricalEquipment {
    private static int max = 400;
    public static void main(String[] args) throws ParseException {
        /*
        3. Домашние электроприборы. Определить иерархию электроприборов.
        Включить некоторые в розетку. Подсчитать потребляемую мощность. Провести
        сортировку приборов в квартире на основе мощности. Найти прибор
        в квартире, соответствующий заданному диапазону параметров.
         */
        List<EquipmentByRoom> list = new LinkedList<>();
        // комната 1
        EquipmentByRoom room1 = new EquipmentByRoom("Комната 1");
        list.add(room1);
        Lamps lamp1 = new Lamps("Настольная лампа",
                null,
                "INhome 4690612012902, E27",
                40,
                4,
                "10.07.2020",
                39.85,
                false,
                450);
        lamp1.setWork(true);
        Lamps lamp2 = new Lamps("Лампа",
                null,
                "Gauss 23227A, E27",
                9,
                2,
                "25.06.2019",
                3.15,false,
                900);
        room1.addEquipment(lamp1);
        room1.addEquipment(lamp2);
        room1.sort();
        System.out.println(room1);
        System.out.println("Текущее потребление, Вт: " + room1.getPower());
        System.out.println();

        // комната 2
        EquipmentByRoom room2 = new EquipmentByRoom("Зал");
        list.add(room2);
        Lamps lamp3 = new Lamps("Светильник БРА",
                null,
                ", E27",
                36,
                4,
                "04.02.2021",
                450.80,
                false,
                4500);
        room2.addEquipment(lamp3);
        Lamps lamp4 = new Lamps("Светильник настенный",
                null,
                ", E27",
                25,
                4,
                "04.02.2021",
                180.80,
                false,
                600);
        room2.addEquipment(lamp4);
        TVSets tvSets = new TVSets("Телевизор",
                Seller.SAMSUNG,
                "UE32T4510AUXRU",
                60,
                4,
                "03.11.2018",
                899,
                false,
                32,
                "1366x768 (HD)",
                true,
                50,
                "LED");
        room2.addEquipment(tvSets);
        tvSets.setWork(true);
        room2.sort();
        System.out.println(room2);
        System.out.println("Текущее потребление, Вт: " + room2.getPower());
        System.out.println();

        // комната 3
        EquipmentByRoom room3 = new EquipmentByRoom("Комната 2");
        list.add(room3);
        Lamps lamp5 = new Lamps("Светильник БРА",
                null,
                ", E27",
                20,4,
                "04.02.2021",
                300.80,
                false,
                2000);
        room3.addEquipment(lamp5);
        TVSets tvSets2 = new TVSets("Телевизор",
                Seller.SAMSUNG,
                "UE20T3510",
                120,
                4,
                "03.11.2012",
                400,
                false,
                20,
                "1366x768 (HD)",
                true,
                50,
                "LED");
        room3.addEquipment(tvSets2);
        room3.sort();
        System.out.println(room3);
        System.out.println("Текущее потребление, Вт: " + room3.getPower());
        System.out.println();

        // комната 4
        EquipmentByRoom room4 = new EquipmentByRoom("Кухня");
        list.add(room4);
        Lamps lamp6 = new Lamps("Светильник БРА",
                null,
                ", E27",
                20,4,
                "04.02.2020",
                300.80,
                false,
                2000);
        room4.addEquipment(lamp6);
        TVSets tvSets3 = new TVSets("Телевизор",
                Seller.SAMSUNG,
                "UE20T3510",
                120,
                4,
                "03.11.2012",
                400,
                false,
                20,
                "1366x768 (HD)",
                true,
                50,
                "LED");
        room4.addEquipment(tvSets3);
        Refrigerator refrigerator = new Refrigerator("Холодильник с морозильником",
                null,
                "Indesit TIA 140",
                75,
                4,
                "25.11.2020",
                659.45,
                true,
                "двухдверный",
                2,
                Color.WHITE);
        room4.addEquipment(refrigerator);
        MicrowaveOven microwaveOven = new MicrowaveOven("Микроволновая печь",
                null,
                "Bosch BEL523MS0",
                800,
                4,
                "20.05.2020",
                999.0,
                false,
                false,
                "5 (90 Вт, 180 Вт, 360 Вт, 600 Вт, 800 Вт)",
                1000);
        room4.addEquipment(microwaveOven);
        room4.sort();
        System.out.println(room4);
        System.out.println("Текущее потребление, Вт: " + room4.getPower());
        System.out.println();

        // комната 5
        EquipmentByRoom room5 = new EquipmentByRoom("Сан. узел");
        list.add(room5);
        Lamps lamp7 = new Lamps("Светильник",
                null,
                ", E27",
                60,
                5,
                "04.02.2020",
                120.80,
                false,
                400);
        room5.addEquipment(lamp7);
        WashingMachines machines = new WashingMachines("Стиральная машина",
                null,
                "Indesit IWSB 50851 BY",
                80,
                5,
                "20.05.2010",
                504,
                false,
                "фронтальный",
                5.0,
                960);
        room5.addEquipment(machines);
        room5.sort();
        System.out.println(room5);
        System.out.println("Текущее потребление, Вт: " + room5.getPower());
        System.out.println();

        double power = 0.0;
        for (EquipmentByRoom room: list) power += room.getPower();
        System.out.println("Общее текущее потребление по всей квартире, Вт: " + power);

        // оборудование, мощность которого больше 400 Вт
        System.out.println();
        System.out.println("Список электрооборудования, мощность которого больше " + max +" Вт:");
        for (EquipmentByRoom room: list) {
            room.equipmentPowerMax(max);
        }

    }

}

