package com.banking.violetApple;

public class Fruit {
    private String name;
    private String color;
    private String price;

    // Constructors
    public Fruit() {}

    public Fruit(String name, String color, String price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    // Getters and Setters
    public String getFruitname() {
        return name;
    }

    public void setFruitname(String username) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String lastName) {
        this.price = price;
    }
}
