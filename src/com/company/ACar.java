package com.company;

abstract public class ACar implements ICar
{
    //Fields
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfDoors;

    //Constructor
    public ACar(String registrationNumber, String make, String model, int numberOfDoors)
    {
        this.registrationNumber=registrationNumber;
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
    }


    //Methods
    @Override
    public String getRegistrationNumber()
    {
        return this.registrationNumber;
    }

    @Override
    public String getMake()
    {
        return this.make;
    }

    @Override
    public String getModel()
    {
        return this.model;
    }

    @Override
    public int getNumberOfDoors()
    {
        return this.numberOfDoors;
    }



    @Override
    public String toString()
    {
        return "Registration number: "+registrationNumber+"\nMake: "+make+"\nModel:"+model+"\nNumber of doors:"+numberOfDoors;
    }
}
