package com.company;

public class DieselCar extends AFuelCar
{
    //Fields
    private boolean particleFilter;

    //Constructor
    public DieselCar(int kmPrLitre, boolean particleFilter,String registrationNumber, String make, String model, int numberOfDoors)
    {
        super(kmPrLitre,registrationNumber, make, model, numberOfDoors);
        this.particleFilter=particleFilter;
    }

    //methods

    @Override
    String getFuelType()
    {
        return "Diesel";
    }

    private boolean hasParticleFilter()
    {
        return particleFilter;
    }

    public int getRegistrationFee()
    {
        int kmPrLitre=getKmPrLitre();
        int payment;
        if( kmPrLitre>=20 && kmPrLitre<=50)
        {
            payment= 330+130;
        }

        else if(kmPrLitre>=15 && kmPrLitre<20)
        {
            payment= 1050+1390;
        }

        else if(kmPrLitre>=10 && kmPrLitre<15)
        {
            payment= 2340+1850;
        }

        else if(kmPrLitre>=5 && kmPrLitre<10)
        {
            payment= 5500+2770;
        }
        else
        {
            payment= 10470+15260;
        }


        boolean hasFilter=hasParticleFilter();
        if(hasFilter==false)
        {
            payment+=1000;
        }
        return payment;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\nRegistration fee: "+getRegistrationFee()+"\nHas particle filter: "+hasParticleFilter()+"\n\n";
    }
}
