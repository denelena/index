package com.company;

public class BmiService
{
    public float calculate(float weight_in_kg, float height_in_m)
    {
        return weight_in_kg / (height_in_m * height_in_m);
    }
}
