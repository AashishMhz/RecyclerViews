package com.example.bmi;

public class BMICalculator {
    private float height, weight;

    public BMICalculator(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public BMICalculator() {
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float bmiCalculate(){
        float bmi;
        float meter = meterConverter();
        bmi = weight/(meter * meter);
        return bmi;
    }

    public float meterConverter(){
        float meter;
        meter = height/100;
        return meter;
    }
}
