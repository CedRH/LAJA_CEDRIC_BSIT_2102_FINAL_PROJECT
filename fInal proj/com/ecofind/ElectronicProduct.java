package com.ecofind;

public class ElectronicProduct extends MarketItem {
    private final boolean energyEfficient;
    private final String powerConsumption;

    public ElectronicProduct(String name, String brand, int sustainabilityScore, 
                              boolean energyEfficient, String powerConsumption) {
        super(name, brand, sustainabilityScore);
        this.energyEfficient = energyEfficient;
        this.powerConsumption = powerConsumption;
    }

    // Polymorphic implementation of environmental impact
    @Override
    public double calculateEnvironmentalImpact() {
        return energyEfficient ? 0.5 : 1.0;
    }

    public boolean isEnergyEfficient() { return energyEfficient; }
    public String getPowerConsumption() { return powerConsumption; }
}
