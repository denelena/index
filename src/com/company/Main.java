package com.company;

public class Main
{
    public static void main(String[] args)
    {
        float massa = 65f; // килограммов
        float rost = 1.75f; // метров

        BmiService bmiCalculator = new BmiService();

        float bmIndex = bmiCalculator.calculate(massa, rost);
        System.out.println("BMI: " + bmIndex);
    }
}
