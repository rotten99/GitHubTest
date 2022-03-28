package com.company;

public class ElectricCar extends ACar
{
    //Fields
    private int batteryCapacity;
    private int maxRangeKm;

    //Constructor
    public ElectricCar(int batteryCapacity, int maxRangeKm, String registrationNumber, String make, String model, int numberOfDoors)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRangeKm = maxRangeKm;
    }

    //Methods
    public int getBatteryCapacityKWh()
    {
        return batteryCapacity;
    }

    public int getMaxRangeKm()
    {
        return maxRangeKm;
    }

    public int getWhPrKm()
    {
        return getBatteryCapacityKWh() / getMaxRangeKm();
    }


    @Override
    public int getRegistrationFee()
    {
        double value = getWhPrKm() / 91.25;
        double res = 100 / value;

        if (res >= 20 && res <= 50)
        {
            return 330;
        }

        else if (res >= 15 && res < 20)
        {
            return 1050;
        }

        else if (res >= 10 && res < 15)
        {
            return 2340;
        }

        else if (res >= 5 && res < 10)
        {
            return 5500;
        }
        return 10470;
    }

    @Override
    public String toString()
    {
        return super.toString()+"\nRegistration fee: "+getRegistrationFee()+"\nWatt hours pr. kilometer: " + getWhPrKm()+"\n\n";
    }
}
