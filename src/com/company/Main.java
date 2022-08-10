package com.company;

public class Main {


    public static void main(String[] args) {

        System.out.println(createObject("CarNumber"));
        System.out.println(createObject("CarBody"));
        System.out.println(createObject("Chair"));
    }

    public static Car  createObject(String className) {
        switch (className) {
            case "CarNumber":
                CarNumber carNumber = new CarNumber("Мers", 2020, 4.0, "USA",
                        9, 'a', 1);
                carNumber.print();
                return carNumber;
            case "CarBody":
                CarBody carBody = new CarBody("Nissan", 2018, 3.0, BodyMaterial.ULTRA_HIGH_STRENGTH_HOT_FORMING_STEEL);
                carBody.print();
                return carBody;
            case "Chair":
                Chair chair = new Chair("Lexus", 2019, 2.5, "Skin", 80);
                chair.print();
                return chair;
            
        }
        return null;
    }
}
