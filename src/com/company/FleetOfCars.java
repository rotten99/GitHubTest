package com.company;

import java.util.ArrayList;

public class FleetOfCars
{
    //Fields
    ArrayList<ICar> fleet= new ArrayList<>();

    // Methods
    public void addCar(ICar car)
    {
        fleet.add(car);
    }

    public int totalFee()
    {
        int sum=0;
        for (ICar c: fleet)
        {
            sum+=c.getRegistrationFee();
        }
        return sum;
    }


    @Override
    public String toString()
    {

        return "Cars:\n"+fleet;
    }
}
