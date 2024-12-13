package com.ecofind;

public abstract class MarketItem {
    private final String name;
    private final String brand;
    private final int sustainabilityScore;

    public MarketItem(String name, String brand, int sustainabilityScore) {
        this.name = name;
        this.brand = brand;
        this.sustainabilityScore = sustainabilityScore;
    }

    
    public abstract double calculateEnvironmentalImpact();

   
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public int getSustainabilityScore() { return sustainabilityScore; }
}