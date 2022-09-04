package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal() {

    }

    public String getColor() {
        return this.color;
    }
    public int getNumberOfPaws() {
        return  this.numberOfPaws;
    }
    public boolean getHasFur() {
        return this.hasFur;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }
    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
    public String getDescription() {
        String description = "";
        String repeatedString = "This animal is mostly ";
        if(getNumberOfPaws() != 1) {
            if (getHasFur()) {
                description = "This animal is mostly " + getColor() + ". It has " +
                        getNumberOfPaws() + " paws and a fur.";
            } else {
                description = "This animal is mostly " + getColor() + ". It has " +
                        getNumberOfPaws() + " paws and no fur.";
            }
        } else {
            if (getHasFur()) {
                description = "This animal is mostly " + getColor() + ". It has " +
                        getNumberOfPaws() + " paw and a fur.";
            } else {
                description = "This animal is mostly " + getColor() + ". It has " +
                        getNumberOfPaws() + " paw and no fur.";
            }
        }

        return  description;
    }
}