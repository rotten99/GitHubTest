package com.company;

public class Main
{
    public static void main(String[] args)
    {
    FleetOfCars fleet = new FleetOfCars();
	ICar yaris= new GasolineCar(20,"YZ31803","Toyota","Yaris",5);
    ICar tesla= new ElectricCar(100000,648,"XX66666","Tesla","That one",5);
    ICar duster= new DieselCar(15,true,"ww56389","Dacia","Duster",5);
    fleet.addCar(yaris);
    fleet.addCar(tesla);
    fleet.addCar(duster);
    System.out.println(fleet);
    System.out.println("Total rental fee of the cars: "+fleet.totalFee());
    }
}
