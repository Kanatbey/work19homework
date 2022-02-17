package com.company;

public class Horse extends Pets {

    private String color;
    public Horse(double weigth, int age,String color, String gender, String nickName) {
        super(weigth, age, gender, nickName);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\ncolor: " + color + super.toString();
    }
}
