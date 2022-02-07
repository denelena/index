package com.company;

public class Main {
    public static void main(String[] args) {
        float massaKg = 65f; // килограммов
        float rostMeters = 1.75f; // метров

        BmiService bmiCalculator = new BmiService();

        float bmIndex = bmiCalculator.calculate(massaKg, rostMeters);
        System.out.println("BMI: " + bmIndex);
    }
}
