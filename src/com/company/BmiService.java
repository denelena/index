package com.company;

public class BmiService {
    public float calculate(float weightInKg, float heightInM) {
        return weightInKg / (heightInM * heightInM);
    }
}
