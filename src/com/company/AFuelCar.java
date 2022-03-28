package com.company;

abstract public class AFuelCar extends ACar
{
    //Fields
    private int kmPrLitre;

    //Constructor
    public AFuelCar(int kmPrLitre,String registrationNumber, String make, String model, int numberOfDoors)
    {
        super( registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre=kmPrLitre;
    }

    //Methods

    abstract String getFuelType();
    public int getKmPrLitre()
    {
        return kmPrLitre;
    }

    @Override
    public String toString()
    {
        return super.toString()+"\nKilometer pr. litre: "+kmPrLitre;
    }
}
