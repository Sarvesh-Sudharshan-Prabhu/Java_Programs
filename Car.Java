

import java.text.DecimalFormat;

public class Car
{
    // Declaring instance variables
    private int year;
    private String make;
    private String model;
    private double mpg;
    private double fuel;
    private double odometer;
//  Setting up a constructor and assigning values to the instance variables
    public Car(int y, String ma, String mo, double mp)
    {
        year = y;
        make = ma;
        model = mo;
        mpg = mp;
        fuel = 0;
        odometer = 0;
    }

    // These methods stated below simulate the behavior of the object
    public double getRange()
    {
        return fuel * mpg;
    }

    public boolean lowFuel()
    {
        return (fuel * mpg) < 20;
    }

    public void drive (double specifiedDistance)
    {
        // This if statement adjusts how far the car can drive if the specified distance is more than the range. Adjusts fuel and odometer properly based on this scenario.
        if (specifiedDistance > getRange())
        {
            odometer = odometer + getRange();
            fuel = 0;
        }
        else
        {
            odometer = odometer + specifiedDistance;
            fuel = fuel - specifiedDistance / mpg;
        }
    }
    public void addFuel(double fuelAmount)
    {
        fuel = fuel + fuelAmount;
    }

    public String toString()
    {
        // Limits the number of decimal places to 2 places.
        DecimalFormat df = new DecimalFormat("0.00");

        String everything = year + " " + make + " " + model + "\n" +
                "Miles Traveled: " + df.format(odometer) + "\n" +
                "Fuel: " + df.format(fuel) + " gallons\n" +
                "Range: " + df.format(getRange()) + " miles";

        if (lowFuel())
        {
            everything = "WARNING: LOW FUEL";
        }
        return everything;
    }
}

