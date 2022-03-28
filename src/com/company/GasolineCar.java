package com.company;

public class GasolineCar extends AFuelCar
{
    public GasolineCar(int kmPrLitre,String registrationNumber, String make, String model, int numberOfDoors)
    {
        super(kmPrLitre,registrationNumber, make, model, numberOfDoors);
    }

    //methods

    @Override
    String getFuelType()
    {
        return "Gasoline";
    }

    public int getRegistrationFee()
    {
        int kmPrLitre=getKmPrLitre();
        int cost;
        if( kmPrLitre>=20 && kmPrLitre<=50)
        {
            cost= 330;
        }

        else if(kmPrLitre>=15 && kmPrLitre<20)
        {
            cost= 1050;
        }

        else if(kmPrLitre>=10 && kmPrLitre<15)
        {
            cost= 2340;
        }

        else if(kmPrLitre>=5 && kmPrLitre<10)
        {
            cost= 5500;
        }
        else
        {
            cost=10470;
        }
        return cost;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\nRegistration fee: "+getRegistrationFee()+"\n\n";
    }
}
