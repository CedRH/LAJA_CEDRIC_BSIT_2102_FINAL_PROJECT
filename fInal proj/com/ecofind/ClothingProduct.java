package com.ecofind;

public class ClothingProduct extends MarketItem {
    private final String material;
    private final boolean organic;

    public ClothingProduct(String name, String brand, int sustainabilityScore, 
                            String material, boolean organic) {
        super(name, brand, sustainabilityScore);
        this.material = material;
        this.organic = organic;
    }

    // Different polymorphic implementation
    @Override
    public double calculateEnvironmentalImpact() {
        return organic ? 0.3 : 0.7;
    }

    public String getMaterial() { return material; }
    public boolean isOrganic() { return organic; }
}
